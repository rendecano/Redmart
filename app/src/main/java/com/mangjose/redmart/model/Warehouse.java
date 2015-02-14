
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;

public class Warehouse {

    @Expose
    private Measure measure;

    /**
     * @return The measure
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * @param measure The measure
     */
    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

}
