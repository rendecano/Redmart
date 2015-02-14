
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;

public class Image {

    @Expose
    private long h;
    @Expose
    private long w;
    @Expose
    private String name;
    @Expose
    private long position;

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
     * @return The position
     */
    public long getPosition() {
        return position;
    }

    /**
     * @param position The position
     */
    public void setPosition(long position) {
        this.position = position;
    }

}
