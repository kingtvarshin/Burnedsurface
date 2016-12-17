package com.kingtvarshin.burnedsurface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MyActivity";
    ImageView body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        body = (ImageView)findViewById(R.id.body);


        load_image(R.drawable.burns);
        body.setOnClickListener(this);
//        image_location();


    }

    private void load_image(Integer pic) {
        Picasso.with(this).load(pic).into(body);
    }


//    private void image_location() {
//        body.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    int loc[] = new int[2];
//                    v.getLocationOnScreen(loc);
//                    Log.d(TAG, "loc[0]: " + loc[0] + ", loc[1]: " + loc[1] +
//                            ", event.getX(): " + (int)event.getX() +
//                            ", event.getY(): " + (int)event.getY());
//                }
//                return true;
//            }
//        });
//    }


    @Override
    public void onClick(View view) {

        Intent in = new Intent(this,Burnedparts_estimate.class);
        startActivity(in);
    }
}
