package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/7/5.
 */

public class AQI {             //当前空气质量的情况
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
