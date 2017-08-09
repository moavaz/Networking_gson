package com.example.moavaz.networking_gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Moavaz on 8/9/2017.
 */

public class countryinfoclass {
    @Expose
    private int id;

    @SerializedName("c_name")
    @Expose
    private String c_name;

    @SerializedName("c_code")
    @Expose
    private String cCode;

    @Expose
    private String currencyrate;

    @Expose
    private String flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getCurrencyrate() {
        return currencyrate;
    }

    public void setCurrencyrate(String currencyrate) {
        this.currencyrate = currencyrate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
