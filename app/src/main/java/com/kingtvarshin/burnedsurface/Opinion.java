package com.kingtvarshin.burnedsurface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.kingtvarshin.burnedsurface.CircularSeekBar;

public class Opinion extends AppCompatActivity {

//    private static final String TAG = "MyActivity";
    TextView percent,text;
    int bsa;
    CircularSeekBar cir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);

        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            bsa = (Integer) bd.get("bsa");
//            Log.d(TAG,Integer.toString(bsa));
        }

        percent = (TextView)findViewById(R.id.bsapercent);
        text = (TextView)findViewById(R.id.text);
        cir = (CircularSeekBar)findViewById(R.id.circularSeekBar2);

        percent.setText("C'est votre BSA : "+Integer.toString(bsa)+"%");

        if ( bsa >=0 && bsa < 20){
            text.setText("bla");
        }
        else
            text.setText("blatoo");

        cir.setProgress(bsa);

    }
}
