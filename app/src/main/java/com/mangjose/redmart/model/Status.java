
package com.mangjose.redmart.model;

import com.google.gson.annotations.Expose;

public class Status {

    @Expose
    private String msg;
    @Expose
    private long code;

    /**
     * @return The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return The code
     */
    public long getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(long code) {
        this.code = code;
    }

}
