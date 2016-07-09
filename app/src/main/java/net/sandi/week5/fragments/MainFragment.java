package net.sandi.week5.fragments;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import net.sandi.week5.R;
import net.sandi.week5.adapters.PlaceAdapter;
import net.sandi.week5.models.PlaceModel;
import net.sandi.week5.vos.PlaceVO;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

    private Controller mPlaceController;
    private PlaceAdapter mPlaceAdapter;
    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlaceAdapter= new PlaceAdapter(PlaceModel.getInstance().getPlaceList(),mPlaceController);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView rvEvent = (RecyclerView) view.findViewById(R.id.rv_places);
        rvEvent.setAdapter(mPlaceAdapter);
        rvEvent.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        return view;
    }
    public interface Controller{
        public void onTap(PlaceVO place, ImageView placeImage);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mPlaceController = (Controller) context;
    }

}
