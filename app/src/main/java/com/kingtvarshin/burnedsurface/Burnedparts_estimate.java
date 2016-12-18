package com.kingtvarshin.burnedsurface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.kingtvarshin.burnedsurface.CircularSeekBar;
import com.kingtvarshin.burnedsurface.CircularSeekBar.OnCircularSeekBarChangeListener;

public class Burnedparts_estimate extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

//    private static final String TAG = "MyActivity";
    CircularSeekBar cir;
    SeekBar s1,s2,s3,s4,s5,s6,s7,s8,s9;
    TextView tv,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    String bsa="0";
    int total,total1,total2,total3,total4,total5,total6,total7,total8,total9;
    int blahead,blachest,blaabdomen,blaback,blaltarm,blartarm,blagroin,blaltleg,blartleg;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burnedparts_estimate);

        cir = (CircularSeekBar)findViewById(R.id.circularSeekBar1);
        s1 = (SeekBar)findViewById(R.id.seek1);
        s2 = (SeekBar)findViewById(R.id.seek2);
        s3 = (SeekBar)findViewById(R.id.seek3);
        s4 = (SeekBar)findViewById(R.id.seek4);
        s5 = (SeekBar)findViewById(R.id.seek5);
        s6 = (SeekBar)findViewById(R.id.seek6);
        s7 = (SeekBar)findViewById(R.id.seek7);
        s8 = (SeekBar)findViewById(R.id.seek8);
        s9 = (SeekBar)findViewById(R.id.seek9);

        tv = (TextView)findViewById(R.id.bsapercent);
        t1 = (TextView)findViewById(R.id.headper);
        t2 = (TextView)findViewById(R.id.chestper);
        t3 = (TextView)findViewById(R.id.abdomenper);
        t4 = (TextView)findViewById(R.id.backper);
        t5 = (TextView)findViewById(R.id.ltarmper);
        t6 = (TextView)findViewById(R.id.rtarmper);
        t7 = (TextView)findViewById(R.id.groinper);
        t8 = (TextView)findViewById(R.id.ltlegper);
        t9 = (TextView)findViewById(R.id.rtlegper);

        b1 = (Button)findViewById(R.id.get_opinion);

        s1.setOnSeekBarChangeListener(this);
        s2.setOnSeekBarChangeListener(this);
        s3.setOnSeekBarChangeListener(this);
        s4.setOnSeekBarChangeListener(this);
        s5.setOnSeekBarChangeListener(this);
        s6.setOnSeekBarChangeListener(this);
        s7.setOnSeekBarChangeListener(this);
        s8.setOnSeekBarChangeListener(this);
        s9.setOnSeekBarChangeListener(this);

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        opinion_window(total);
                    }
                }
        );
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar == s1){
            blahead = s1.getProgress();
            total1 = blahead*9/100;
            bsa = Integer.toString(blahead);
            t1.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s2){
            blachest = s2.getProgress();
            total2 = blachest*9/100;
            bsa = Integer.toString(blachest);
            t2.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s3){
            blaabdomen = s3.getProgress();
            total3 = blaabdomen*9/100;
            bsa = Integer.toString(blaabdomen);
            t3.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s4){
            blaback = s4.getProgress();
            total4 = blaback*18/100;
            bsa = Integer.toString(blaback);
            t4.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s5){
            blaltarm = s5.getProgress();
            total5 = blaltarm*9/100;
            bsa = Integer.toString(blaltarm);
            t5.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s6){
            blartarm = s6.getProgress();
            total6 = blartarm*9/100;
            bsa = Integer.toString(blartarm);
            t6.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s7){
            blagroin = s7.getProgress();
            total7 = blagroin*1/100;
            bsa = Integer.toString(blagroin);
            t7.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s8){
            blaltleg = s8.getProgress();
            total8 = blaltleg*18/100;
            bsa = Integer.toString(blaltleg);
            t8.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }
        if(seekBar == s9){
            blartleg = s9.getProgress();
            total9 = blartleg*18/100;
            bsa = Integer.toString(blartleg);
            t9.setText(bsa+"%");
            total = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9;
            cir.setProgress(total);
            tv.setText(total+"%");
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private void opinion_window(int value) {
        Intent in = new Intent(this,Opinion.class);
        in.putExtra("bsa",value);
        startActivity(in);
    }
}
