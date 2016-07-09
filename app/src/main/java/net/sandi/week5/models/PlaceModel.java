package net.sandi.week5.models;

import com.google.gson.reflect.TypeToken;

import net.sandi.week5.utils.CommonInstances;
import net.sandi.week5.utils.JsonUtils;
import net.sandi.week5.vos.PlaceVO;

import org.json.JSONException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by UNiQUE on 7/7/2016.
 */
public class PlaceModel {

    private static final String DUMMY_PLACE_LIST = "place_list.json";

    private List<PlaceVO> placeVOList;

    private static PlaceModel objInstance;

    public static PlaceModel getInstance(){
        if (objInstance == null)
            objInstance = new PlaceModel();

        return objInstance;
    }
    public PlaceModel(){this.placeVOList = initializePlaceList();}

    private List<PlaceVO> initializePlaceList(){
        List<PlaceVO> placeList = new ArrayList<>();


            try {
                String dummyEventList = JsonUtils.getInstance().loadDummyData(DUMMY_PLACE_LIST);
                Type listType = new TypeToken<List<PlaceVO>>() {
                }.getType();
                placeList = CommonInstances.getGsonInstance().fromJson(dummyEventList, listType);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

        return placeList;
    }

    public List<PlaceVO> getPlaceList() {
        return placeVOList;
    }


}
