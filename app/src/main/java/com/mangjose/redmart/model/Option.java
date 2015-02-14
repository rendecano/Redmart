
package com.mangjose.redmart.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Option {

    @Expose
    private String name;
    @Expose
    private String uri;
    @Expose
    private List<Type> types = new ArrayList<Type>();

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
     * @return The types
     */
    public List<Type> getTypes() {
        return types;
    }

    /**
     * @param types The types
     */
    public void setTypes(List<Type> types) {
        this.types = types;
    }

}
