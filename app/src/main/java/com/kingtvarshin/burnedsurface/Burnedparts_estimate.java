package com.kingtvarshin.burnedsurface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.kingtvarshin.burnedsurface.CircularSeekBar;
import com.kingtvarshin.burnedsurface.CircularSeekBar.OnCircularSeekBarChangeListener;

public class Burnedparts_estimate extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    CircularSeekBar cir;
    SeekBar s1,s2,s3,s4,s5,s6,s7,s8,s9;
    TextView tv,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    String bsa="0";

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

        s1.setOnSeekBarChangeListener(this);
        s2.setOnSeekBarChangeListener(this);
        s3.setOnSeekBarChangeListener(this);
        s4.setOnSeekBarChangeListener(this);
        s5.setOnSeekBarChangeListener(this);
        s6.setOnSeekBarChangeListener(this);
        s7.setOnSeekBarChangeListener(this);
        s8.setOnSeekBarChangeListener(this);
        s9.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(seekBar == s1){
            int bla = s1.getProgress();
            bsa = Integer.toString(bla);
            t1.setText(bsa+"%");
        }
        if(seekBar == s2){
            int bla = s2.getProgress();
            bsa = Integer.toString(bla);
            t2.setText(bsa+"%");
        }
        if(seekBar == s3){
            int bla = s3.getProgress();
            bsa = Integer.toString(bla);
            t3.setText(bsa+"%");
        }
        if(seekBar == s4){
            int bla = s4.getProgress();
            bsa = Integer.toString(bla);
            t4.setText(bsa+"%");
        }
        if(seekBar == s5){
            int bla = s5.getProgress();
            bsa = Integer.toString(bla);
            t5.setText(bsa+"%");
        }
        if(seekBar == s6){
            int bla = s6.getProgress();
            bsa = Integer.toString(bla);
            t6.setText(bsa+"%");
        }
        if(seekBar == s7){
            int bla = s7.getProgress();
            bsa = Integer.toString(bla);
            t7.setText(bsa+"%");
        }
        if(seekBar == s8){
            int bla = s8.getProgress();
            bsa = Integer.toString(bla);
            t8.setText(bsa+"%");
        }
        if(seekBar == s9){
            int bla = s9.getProgress();
            bsa = Integer.toString(bla);
            t9.setText(bsa+"%");
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
