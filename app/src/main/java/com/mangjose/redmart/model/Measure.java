
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Measure {

    @Expose
    private String size;
    @SerializedName("wt_or_vol")
    @Expose
    private String wtOrVol;

    @Expose
    private float vol;
    @SerializedName("vol_metric")
    @Expose
    private String volMetric;
    @Expose
    private float wt;
    @SerializedName("wt_metric")
    @Expose
    private String wtMetric;
    @Expose
    private float l;
    @Expose
    private float w;
    @Expose
    private float h;

    /**
     * @return The vol
     */
    public float getVol() {
        return vol;
    }

    /**
     * @param vol The vol
     */
    public void setVol(float vol) {
        this.vol = vol;
    }

    /**
     * @return The volMetric
     */
    public String getVolMetric() {
        return volMetric;
    }

    /**
     * @param volMetric The vol_metric
     */
    public void setVolMetric(String volMetric) {
        this.volMetric = volMetric;
    }

    /**
     * @return The wt
     */
    public float getWt() {
        return wt;
    }

    /**
     * @param wt The wt
     */
    public void setWt(float wt) {
        this.wt = wt;
    }

    /**
     * @return The wtMetric
     */
    public String getWtMetric() {
        return wtMetric;
    }

    /**
     * @param wtMetric The wt_metric
     */
    public void setWtMetric(String wtMetric) {
        this.wtMetric = wtMetric;
    }

    /**
     * @return The l
     */
    public float getL() {
        return l;
    }

    /**
     * @param l The l
     */
    public void setL(float l) {
        this.l = l;
    }

    /**
     * @return The w
     */
    public float getW() {
        return w;
    }

    /**
     * @param w The w
     */
    public void setW(float w) {
        this.w = w;
    }

    /**
     * @return The h
     */
    public float getH() {
        return h;
    }

    /**
     * @param h The h
     */
    public void setH(float h) {
        this.h = h;
    }

    /**
     * @return The size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return The wtOrVol
     */
    public String getWtOrVol() {
        return wtOrVol;
    }

    /**
     * @param wtOrVol The wt_or_vol
     */
    public void setWtOrVol(String wtOrVol) {
        this.wtOrVol = wtOrVol;
    }

}
