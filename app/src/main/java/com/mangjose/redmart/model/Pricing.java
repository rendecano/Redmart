
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pricing {

    @Expose
    private double price;
    @SerializedName("promo_price")
    @Expose
    private double promoPrice;
    @Expose
    private double savings;
    @SerializedName("on_sale")
    @Expose
    private long onSale;

    /**
     * @return The price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return The promoPrice
     */
    public double getPromoPrice() {
        return promoPrice;
    }

    /**
     * @param promoPrice The promo_price
     */
    public void setPromoPrice(long promoPrice) {
        this.promoPrice = promoPrice;
    }

    /**
     * @return The savings
     */
    public double getSavings() {
        return savings;
    }

    /**
     * @param savings The savings
     */
    public void setSavings(long savings) {
        this.savings = savings;
    }

    /**
     * @return The onSale
     */
    public long getOnSale() {
        return onSale;
    }

    /**
     * @param onSale The on_sale
     */
    public void setOnSale(long onSale) {
        this.onSale = onSale;
    }

}
