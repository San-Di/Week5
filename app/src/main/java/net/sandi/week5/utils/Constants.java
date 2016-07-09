package net.sandi.week5.utils;

import android.util.Log;

import net.sandi.week5.R;

import java.util.HashMap;

/**
 * Created by UNiQUE on 7/9/2016.
 */
public class Constants  {
        private static HashMap<String,Integer> imageHashMap;
        static{
            imageHashMap = new HashMap<>();
            imageHashMap.put("Yangon", R.drawable.yangon_01);
            imageHashMap.put("Mandalay", R.drawable.mandalay_01);
            imageHashMap.put("Bagan", R.drawable.bagan_02);
            imageHashMap.put("Inle Lake", R.drawable.inlelake_01) ;
            imageHashMap.put("Mrauk U", R.drawable.mrauku_01);
            imageHashMap.put("Pyin O Lwin", R.drawable.pyinolwin_01);
            imageHashMap.put("Kalaw", R.drawable.kalaw_01);
            imageHashMap.put("Kyaing Tong", R.drawable.kyaing_tong_01);
            imageHashMap.put("Monywa", R.drawable.monywa_01);
            imageHashMap.put("The Irrawaddy", R.drawable.the_irrawaddy_01);
            imageHashMap.put("Myeik", R.drawable.myeik_01);
            imageHashMap.put("Ngapali Beach", R.drawable.ngapali_beach_01);
            imageHashMap.put("Ngwe Saung Beach", R.drawable.ngwesaung_beach_01);
            imageHashMap.put("Pindaya", R.drawable.pindaya_01);
            imageHashMap.put("KyaikHtiYo",R.drawable.kyaikhtiyo_01);
            imageHashMap.put("Mawlamying",R.drawable.mawlamying_01);
            imageHashMap.put("Mawlamying",R.drawable.mawlamying_01);


        }
        public static int getDrawable(String cityName){
            Log.e( "getDrawable: ",cityName );
            return  imageHashMap.get(cityName);
        }
}
