package net.sandi.week5.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.sandi.week5.AttractionApp;
import net.sandi.week5.R;
import net.sandi.week5.fragments.MainFragment;
import net.sandi.week5.views.holders.PlaceViewHolder;
import net.sandi.week5.vos.PlaceVO;

import java.util.List;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceViewHolder> {

    private LayoutInflater inflater;
    private List<PlaceVO> placeList;
    private MainFragment.Controller mPlaceController;

    public PlaceAdapter(List<PlaceVO> placeList , MainFragment.Controller placeItemController) {
        inflater = LayoutInflater.from(AttractionApp.getContext());
        this.placeList = placeList;
        mPlaceController = placeItemController;
    }

    @Override
    public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_item_place, parent, false);
        final PlaceViewHolder placeViewHolder = new PlaceViewHolder(view, mPlaceController);
        return placeViewHolder;
    }



    @Override
    public void onBindViewHolder(PlaceViewHolder holder, int position) {
        holder.setData(placeList.get(position));
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }
}
