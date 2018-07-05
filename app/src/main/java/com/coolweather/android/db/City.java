package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/7/5.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityCode(int cityCode) {

        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getProvinceId() {

        return provinceId;
    }

    public int getCityCode() {

        return cityCode;
    }

    public String getCityName() {

        return cityName;
    }

    public int getId() {

        return id;
    }
}
