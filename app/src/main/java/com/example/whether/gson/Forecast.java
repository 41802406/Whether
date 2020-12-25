package com.example.whether.gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by walle on 2/16/17.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("wind")
    public Wind wind;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

    public class Wind {
        @SerializedName("dir")
        public String windDir;
        @SerializedName("sc")
        public String windLevel;
    }
}