
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;

public class Type {

    @Expose
    private String uri;
    @Expose
    private String name;
    @Expose
    private long count;

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
     * @return The count
     */
    public long getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    public void setCount(long count) {
        this.count = count;
    }

}
