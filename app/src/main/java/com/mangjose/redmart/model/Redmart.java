
package com.mangjose.redmart.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Redmart {

    @Expose
    private int total;
    @SerializedName("page_size")
    @Expose
    private int pageSize;
    @Expose
    private String session;
    @Expose
    private int page;
    @Expose
    private Status status;
    @Expose
    private List<Product> products = new ArrayList<Product>();
    @Expose
    private Product product;

    /**
     * @return The total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return The pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize The page_size
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return The session
     */
    public String getSession() {
        return session;
    }

    /**
     * @param session The session
     */
    public void setSession(String session) {
        this.session = session;
    }

    /**
     * @return The page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page The page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return The status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return The products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products The products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
