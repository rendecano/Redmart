package com.mangjose.redmart.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.mangjose.redmart.helper.LoadMoreProductListener;
import com.mangjose.redmart.helper.ProductClickListener;
import com.mangjose.redmart.R;
import com.mangjose.redmart.model.Product;
import com.mangjose.redmart.network.VolleyHelper;

import java.util.Collections;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    List<Product> mData = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;
    private int mCurrentPage;
    private int mTotalPageCount;
    private ProductClickListener mProductClickListener;
    private LoadMoreProductListener mLoadMoreProductListener;

    public ProductAdapter(Context context, ProductClickListener pProductClickListener, LoadMoreProductListener pLoadMoreProductListener) {
        this.context = context;
        this.mProductClickListener = pProductClickListener;
        this.mLoadMoreProductListener = pLoadMoreProductListener;
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<Product> data, int currentPage, int totalPages) {
        mData.removeAll(mData);
        mData = data;
        setPageTracking(currentPage, totalPages);
        notifyDataSetChanged();
    }

    public void setAdditionalData(List<Product> data, int currentPage, int totalPages) {

        for (Product product : data) {
            mData.add(product);
        }


        setPageTracking(currentPage, totalPages);
        notifyDataSetChanged();
    }

    public void delete(int position) {
        mData.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_item_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Product product = mData.get(position);

        holder.productName.setText(product.getTitle());
        holder.productVendor.setText(product.getFilters().getVendorName());
        holder.productPrice.setText("$" + String.valueOf(product.getPricing().getPrice()));

        String url = "http://media.redmart.com/newmedia/200p" + product.getImg().getName();
        holder.productImage.setImageUrl(url, VolleyHelper.getImageLoader());

        holder.productLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (product != null) {
                    mProductClickListener.onClickProduct(product);
                }
            }
        });


        // infinite scroll handling
        if (position == mData.size() - 1 && mCurrentPage <= mTotalPageCount) {
            if (mCurrentPage == mTotalPageCount) {
                mLoadMoreProductListener.noMorePages();
            } else {
                int newPage = mCurrentPage + 1;
                mLoadMoreProductListener.loadPage(newPage);
            }
        }
    }

    private void setPageTracking(int currentPage, int totalPages) {
        mCurrentPage = currentPage;
        mTotalPageCount = totalPages;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout productLayout;
        TextView productName;
        TextView productVendor;
        TextView productPrice;
        NetworkImageView productImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            productLayout = (RelativeLayout) itemView.findViewById(R.id.productLayout);
            productName = (TextView) itemView.findViewById(R.id.productName);
            productVendor = (TextView) itemView.findViewById(R.id.vendorName);
            productPrice = (TextView) itemView.findViewById(R.id.productPrice);
            productImage = (NetworkImageView) itemView.findViewById(R.id.productImage);
        }
    }
}
