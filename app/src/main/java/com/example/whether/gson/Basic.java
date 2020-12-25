package com.example.whether.gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by walle on 2/16/17.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
