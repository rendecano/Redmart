
package com.mangjose.redmart.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Attributes {

    @Expose
    private List<Object> dag = new ArrayList<Object>();

    /**
     * @return The dag
     */
    public List<Object> getDag() {
        return dag;
    }

    /**
     * @param dag The dag
     */
    public void setDag(List<Object> dag) {
        this.dag = dag;
    }

}
