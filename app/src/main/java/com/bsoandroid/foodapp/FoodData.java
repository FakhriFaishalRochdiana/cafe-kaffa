package com.bsoandroid.foodapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Kopi Hitam", "Kopi Hitam Racikan khas barista kami. Rasa kopi hitam yang otentik akan memberikan pengalaman ngopi anda semakin berharga", 10000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Cappuchino", "Kopi Cappuchino dengan racikan khas yang dibuat agar anda dapat menikmati Cappuchino dengan maksimal", 15000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Donut", "Donut manis dengan berbagai macam topping yang bisa anda nikmati bersama dengan secangkir kopi pilihan anda", 5000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Cita rasa Sparkling Tea yang tidak akan anda lupakan.", 25000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Sparkling Tea", "Cheesecake ini merupakan kebanggaan salah satu pegawai kami. sepotong cheesecake lembut dengan saus beri diatasnya akan memanjakan lidah anda para pecinta cheesecake.", 7000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
