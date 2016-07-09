package net.sandi.week5.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.sandi.week5.R;
import net.sandi.week5.fragments.MainFragment;
import net.sandi.week5.utils.Constants;
import net.sandi.week5.vos.PlaceVO;

public class PlaceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    //@BindView(R.id.tv_event_title)
    private TextView tvPlaceTitle;
    private TextView tvPlaceDes;
    private ImageView imgPlacePhoto;
    private PlaceVO mPlace;

    private MainFragment.Controller mPlaceItemController;

    public PlaceViewHolder(View itemView,MainFragment.Controller controller) {
        super(itemView);

        this.mPlaceItemController = controller;

        itemView.setOnClickListener(this);

        this.tvPlaceTitle =(TextView) itemView.findViewById(R.id.txt_place_title);
        this.tvPlaceDes = (TextView) itemView.findViewById(R.id.txt_place_description);
        this.imgPlacePhoto = (ImageView) itemView.findViewById(R.id.img_city);
    }

    public void setData(PlaceVO place) {
        this.mPlace = place;

        tvPlaceTitle.setText(place.getPlaceTitle());
        tvPlaceDes.setText(place.getPlaceDescription());

        Glide.with(imgPlacePhoto.getContext())
                    .load(Constants.getDrawable(place.getPlaceTitle()))
                    .centerCrop()
                    .placeholder(R.drawable.kalaw_03)
                    .into(imgPlacePhoto);
    }

    @Override
    public void onClick(View view) {//when uer click the item
        mPlaceItemController.onTap(mPlace,imgPlacePhoto);
    }


}