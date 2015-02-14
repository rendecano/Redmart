
package com.mangjose.redmart.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("atp_lots")
    @Expose
    private List<Object> atpLots = new ArrayList<Object>();
    @SerializedName("atp_status")
    @Expose
    private long atpStatus;
    @SerializedName("max_sale_qty")
    @Expose
    private long maxSaleQty;
    @SerializedName("qty_in_carts")
    @Expose
    private long qtyInCarts;
    @SerializedName("qty_in_stock")
    @Expose
    private long qtyInStock;
    @SerializedName("stock_status")
    @Expose
    private long stockStatus;

    /**
     * @return The atpLots
     */
    public List<Object> getAtpLots() {
        return atpLots;
    }

    /**
     * @param atpLots The atp_lots
     */
    public void setAtpLots(List<Object> atpLots) {
        this.atpLots = atpLots;
    }

    /**
     * @return The atpStatus
     */
    public long getAtpStatus() {
        return atpStatus;
    }

    /**
     * @param atpStatus The atp_status
     */
    public void setAtpStatus(long atpStatus) {
        this.atpStatus = atpStatus;
    }

    /**
     * @return The maxSaleQty
     */
    public long getMaxSaleQty() {
        return maxSaleQty;
    }

    /**
     * @param maxSaleQty The max_sale_qty
     */
    public void setMaxSaleQty(long maxSaleQty) {
        this.maxSaleQty = maxSaleQty;
    }

    /**
     * @return The qtyInCarts
     */
    public long getQtyInCarts() {
        return qtyInCarts;
    }

    /**
     * @param qtyInCarts The qty_in_carts
     */
    public void setQtyInCarts(long qtyInCarts) {
        this.qtyInCarts = qtyInCarts;
    }

    /**
     * @return The qtyInStock
     */
    public long getQtyInStock() {
        return qtyInStock;
    }

    /**
     * @param qtyInStock The qty_in_stock
     */
    public void setQtyInStock(long qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    /**
     * @return The stockStatus
     */
    public long getStockStatus() {
        return stockStatus;
    }

    /**
     * @param stockStatus The stock_status
     */
    public void setStockStatus(long stockStatus) {
        this.stockStatus = stockStatus;
    }

}
