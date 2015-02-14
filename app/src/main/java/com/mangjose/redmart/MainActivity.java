package com.mangjose.redmart;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.mangjose.redmart.adapter.ProductAdapter;
import com.mangjose.redmart.fragment.NavigationDrawerFragment;
import com.mangjose.redmart.helper.LoadMoreProductListener;
import com.mangjose.redmart.helper.ProductClickListener;
import com.mangjose.redmart.model.Product;
import com.mangjose.redmart.model.Redmart;
import com.mangjose.redmart.network.RequestFactory;
import com.mangjose.redmart.network.VolleyHelper;


public class MainActivity extends ActionBarActivity implements SwipeRefreshLayout.OnRefreshListener {


    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout swipeLayout;
    private ProductAdapter mProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.item_list);
        mProductAdapter = new ProductAdapter(this, mProductClickListener, mLoadProductListener);
        mRecyclerView.setAdapter(mProductAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorSchemeResources(R.color.primary_color);

        sendRequest(0);
    }


    private Response.Listener<Redmart> mProductResponse = new Response.Listener<Redmart>() {
        @Override
        public void onResponse(Redmart pEvent) {


            // Check if status is OK
            if (pEvent.getStatus().getCode() == 2000) {

                if (pEvent.getPage() == 0) { // is first page
                    mProductAdapter.setData(pEvent.getProducts(), pEvent.getPage(), pEvent.getTotal() / pEvent.getPageSize());
                } else {
                    mProductAdapter.setAdditionalData(pEvent.getProducts(), pEvent.getPage(), pEvent.getTotal() / pEvent.getPageSize());
                }


            } else {
                // Show error here
                Toast.makeText(MainActivity.this, "Ooops, something went wrong. Please try again.", Toast.LENGTH_SHORT).show();
            }


            swipeLayout.setRefreshing(false);
        }
    };

    private Response.ErrorListener mProductErrorResponse = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

            // Show error here
            Toast.makeText(MainActivity.this, "Ooops, something went wrong. Please try again.", Toast.LENGTH_SHORT).show();

            swipeLayout.setRefreshing(false);
        }
    };

    @Override
    public void onRefresh() {

        swipeLayout.setRefreshing(true);

        sendRequest(0);

    }

    private void sendRequest(int pageNumber) {
        swipeLayout.setRefreshing(true);
        Request<Redmart> request = RequestFactory.getInstance().executeGetProducts(pageNumber, mProductResponse, mProductErrorResponse);
        VolleyHelper.exec(request);
    }


    private final LoadMoreProductListener mLoadProductListener = new LoadMoreProductListener() {
        @Override
        public void loadPage(int page) {
            sendRequest(page);
        }

        @Override
        public void noMorePages() {
            Toast.makeText(MainActivity.this, "No more pages to show", Toast.LENGTH_SHORT).show();
        }
    };

    private final ProductClickListener mProductClickListener = new ProductClickListener() {

        @Override
        public void onClickProduct(Product pProduct) {

            Intent intent = new Intent(MainActivity.this, ProductActivity.class);
            intent.putExtra("productId", pProduct.getId());
            startActivity(intent);

        }
    };

}
