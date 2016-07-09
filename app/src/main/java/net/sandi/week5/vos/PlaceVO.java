package net.sandi.week5.vos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by UNiQUE on 7/7/2016.
 */
public class PlaceVO {


    @SerializedName("title")
    private String placeTitle;

    @SerializedName("desc")
    private String placeDescription;

    @SerializedName("images")
    private ArrayList<String> images;


    public String getPlaceTitle() {
        return placeTitle;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public ArrayList<String> getImages() {
        return images;
    }
}
