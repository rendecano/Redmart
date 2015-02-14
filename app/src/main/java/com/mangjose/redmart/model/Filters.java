
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Filters {

    @Expose
    private long brand;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("brand_uri")
    @Expose
    private String brandUri;
    @Expose
    private long frequency;
    @SerializedName("is_organic")
    @Expose
    private long isOrganic;
    @Expose
    private long mfr;
    @SerializedName("mfr_name")
    @Expose
    private String mfrName;
    @Expose
    private long vendor;
    @SerializedName("vendor_name")
    @Expose
    private String vendorName;

    /**
     * @return The brand
     */
    public long getBrand() {
        return brand;
    }

    /**
     * @param brand The brand
     */
    public void setBrand(long brand) {
        this.brand = brand;
    }

    /**
     * @return The brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName The brand_name
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return The brandUri
     */
    public String getBrandUri() {
        return brandUri;
    }

    /**
     * @param brandUri The brand_uri
     */
    public void setBrandUri(String brandUri) {
        this.brandUri = brandUri;
    }

    /**
     * @return The frequency
     */
    public long getFrequency() {
        return frequency;
    }

    /**
     * @param frequency The frequency
     */
    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    /**
     * @return The isOrganic
     */
    public long getIsOrganic() {
        return isOrganic;
    }

    /**
     * @param isOrganic The is_organic
     */
    public void setIsOrganic(long isOrganic) {
        this.isOrganic = isOrganic;
    }

    /**
     * @return The mfr
     */
    public long getMfr() {
        return mfr;
    }

    /**
     * @param mfr The mfr
     */
    public void setMfr(long mfr) {
        this.mfr = mfr;
    }

    /**
     * @return The mfrName
     */
    public String getMfrName() {
        return mfrName;
    }

    /**
     * @param mfrName The mfr_name
     */
    public void setMfrName(String mfrName) {
        this.mfrName = mfrName;
    }

    /**
     * @return The vendor
     */
    public long getVendor() {
        return vendor;
    }

    /**
     * @param vendor The vendor
     */
    public void setVendor(long vendor) {
        this.vendor = vendor;
    }

    /**
     * @return The vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * @param vendorName The vendor_name
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

}
