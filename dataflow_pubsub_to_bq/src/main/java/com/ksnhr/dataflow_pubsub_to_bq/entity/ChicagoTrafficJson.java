package com.ksnhr.dataflow_pubsub_to_bq.entity;

import com.google.gson.annotations.SerializedName;


public class ChicagoTrafficJson {
    @SerializedName("segmentid")
    public int segment_id;
    @SerializedName("_last_updt")
    public String last_update;
    @SerializedName("street")
    public String street;
    @SerializedName("_strheading")
    public String street_heading;
    @SerializedName("_direction")
    public String direction;
    @SerializedName("_fromst")
    public String from_street;
    @SerializedName("_tost")
    public String to_street;
    @SerializedName("_traffic")
    public int current_speed;
    @SerializedName("_comments")
    public String comments;
    @SerializedName("_lif_lat")
    public float start_latitude;
    @SerializedName("_lit_lat")
    public float end_latitude;
    @SerializedName("start_lon")
    public float start_longitude;
    @SerializedName("_lit_lon")
    public float end_longitude;
    @SerializedName("_length")
    public float length;
}
