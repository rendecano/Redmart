
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details {

    @SerializedName("is_new")
    @Expose
    private long isNew;
    @SerializedName("prod_type")
    @Expose
    private long prodType;
    @Expose
    private long status;
    @Expose
    private String uri;

    /**
     * @return The isNew
     */
    public long getIsNew() {
        return isNew;
    }

    /**
     * @param isNew The is_new
     */
    public void setIsNew(long isNew) {
        this.isNew = isNew;
    }

    /**
     * @return The prodType
     */
    public long getProdType() {
        return prodType;
    }

    /**
     * @param prodType The prod_type
     */
    public void setProdType(long prodType) {
        this.prodType = prodType;
    }

    /**
     * @return The status
     */
    public long getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(long status) {
        this.status = status;
    }

    /**
     * @return The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}
