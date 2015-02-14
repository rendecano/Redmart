
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;

public class Img {

    @Expose
    private long h;
    @Expose
    private String name;
    @Expose
    private long w;

    /**
     * @return The h
     */
    public long getH() {
        return h;
    }

    /**
     * @param h The h
     */
    public void setH(long h) {
        this.h = h;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The w
     */
    public long getW() {
        return w;
    }

    /**
     * @param w The w
     */
    public void setW(long w) {
        this.w = w;
    }

}
