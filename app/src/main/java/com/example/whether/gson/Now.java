package com.example.whether.gson;

//import android.test.MoreAsserts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by walle on 2/16/17.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}