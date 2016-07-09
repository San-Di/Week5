package net.sandi.week5.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.sandi.week5.R;
import net.sandi.week5.utils.Constants;


public class PlaceDetailActivity extends AppCompatActivity {

    public static final String CITYNAME = "CITYNAME";
    public static final String CITYDESCRIPTION = "CITYDESCRIPTION";
    public static final String IMGTRASITION = "IMGTRASITION";

    ImageView cityImage;
//    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbar;
    TextView tvCityDesc;

    FloatingActionButton fab;
    private String title;
    private String description;

    public static Intent newIntent(String cityname,String description,Context context) {
        Intent intent = new Intent(context, PlaceDetailActivity.class);
        intent.putExtra(CITYNAME, cityname);
        intent.putExtra(CITYDESCRIPTION, description);

        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);
//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        title = getIntent().getExtras().getString(CITYNAME);
        description =  getIntent().getExtras().getString(CITYDESCRIPTION);

        cityImage = (ImageView) findViewById(R.id.img_city);

        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        tvCityDesc = (TextView) findViewById(R.id.tv_attraction_desc);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        tvCityDesc.setText(description);
        collapsingToolbar.setTitle(title);
        Glide.with(this)
                .load(Constants.getDrawable(title))
                .placeholder(R.drawable.bagan_02)
                .error(R.drawable.bagan_02)
                .into(cityImage);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            cityImage.setTransitionName(IMGTRASITION);
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//                Uri imguri = Uri.parse("android.resource://com.kaungkhantthu.padcattraction/drawable/" + Constants.getDrawable(title));
//                Drawable drawable = getResources().getDrawable(Constants.getDrawable(title));
//
//                sharingIntent.setType("image/jpeg");
//                sharingIntent.putExtra(Intent.EXTRA_STREAM, imguri);
//                startActivity(Intent.createChooser(sharingIntent, "Share image using"));
            }
        });
    }


}
