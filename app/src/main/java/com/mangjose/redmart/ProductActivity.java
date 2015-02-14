package com.mangjose.redmart;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.NetworkImageView;
import com.mangjose.redmart.model.Redmart;
import com.mangjose.redmart.network.RequestFactory;
import com.mangjose.redmart.network.VolleyHelper;


public class ProductActivity extends ActionBarActivity implements SwipeRefreshLayout.OnRefreshListener {

    private NetworkImageView mProductImageView;
    private TextView mProductName;
    private TextView mProductVendor;
    private TextView mProductDescription;
    private Button mProductPrice;
    private Toolbar mToolbar;
    private SwipeRefreshLayout swipeLayout;
    private long mProductId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        mToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mProductImageView = (NetworkImageView) findViewById(R.id.productImage);

        mProductName = (TextView) findViewById(R.id.productName);
        mProductVendor = (TextView) findViewById(R.id.productVendor);
        mProductDescription = (TextView) findViewById(R.id.productDescription);
        mProductPrice = (Button) findViewById(R.id.productPrice);

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeResources(R.color.primary_color);

        // Get product id
        mProductId = getIntent().getLongExtra("productId", 0);

        sendRequest(mProductId);

    }


    private Response.Listener<Redmart> mProductResponse = new Response.Listener<Redmart>() {
        @Override
        public void onResponse(Redmart pEvent) {


            // Check if status is OK
            if (pEvent.getStatus().getCode() == 2000) {

                if (pEvent.getTotal() == 1) {

                    // Set page title
                    setTitle(pEvent.getProduct().getTitle());

                    String url = "http://media.redmart.com/newmedia/200p" + pEvent.getProduct().getImages().get(0).getName();
                    mProductImageView.setImageUrl(url, VolleyHelper.getImageLoader());

                    mProductName.setText(pEvent.getProduct().getTitle());
                    mProductVendor.setText(pEvent.getProduct().getFilters().getVendorName());
                    mProductDescription.setText(pEvent.getProduct().getDesc());
                    mProductPrice.setText("$" + String.valueOf(pEvent.getProduct().getPricing().getPrice()));
                }


            } else {
                // Show error here
                Toast.makeText(ProductActivity.this, "Ooops, something went wrong. Please try again.", Toast.LENGTH_SHORT).show();
            }


            swipeLayout.setRefreshing(false);
        }
    };

    private Response.ErrorListener mProductErrorResponse = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

            // Show error here
            Toast.makeText(ProductActivity.this, "Ooops, something went wrong. Please try again.", Toast.LENGTH_SHORT).show();

            swipeLayout.setRefreshing(false);
        }
    };


    @Override
    public void onRefresh() {

        swipeLayout.setRefreshing(true);

        sendRequest(mProductId);

    }

    private void sendRequest(long productId) {
        swipeLayout.setRefreshing(true);
        Request<Redmart> request = RequestFactory.getInstance().executeGetProduct(productId, mProductResponse, mProductErrorResponse);
        VolleyHelper.exec(request);
    }

}
