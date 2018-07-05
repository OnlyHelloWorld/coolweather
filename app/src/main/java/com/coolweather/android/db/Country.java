package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/7/5.
 */

public class Country extends DataSupport {

    private int id;
    private String countryName;
    private String weatherId;             //对应的天气id
    private int cityId;

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {

        this.weatherId = weatherId;
    }

    public void setCountryName(String countryName) {

        this.countryName = countryName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getCityId() {

        return cityId;
    }

    public String getWeatherId() {

        return weatherId;
    }

    public String getCountryName() {

        return countryName;
    }

    public int getId() {

        return id;
    }
}
