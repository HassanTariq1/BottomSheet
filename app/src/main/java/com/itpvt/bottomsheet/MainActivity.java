package com.itpvt.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

   private LinearLayout bottom;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom=(LinearLayout)findViewById(R.id.bottomsheet);
        img=(ImageView) findViewById(R.id.share);

        bottomSheetBehavior= BottomSheetBehavior.from(bottom);

      //  bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
      //  bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);


            }
        });




    }
}
