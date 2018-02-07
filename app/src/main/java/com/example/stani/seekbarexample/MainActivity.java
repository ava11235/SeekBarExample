package com.example.stani.seekbarexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements OnSeekBarChangeListener {

  //define instance variables
    private TextView textView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get references to widgets
        textView = (TextView) findViewById(R.id.textView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        //set listener
        seekBar.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
       // Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
       // Toast.makeText(getApplicationContext(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();
        textView.setText("Skill level " + progress);
    }


    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();

       // Toast.makeText(getApplicationContext(),"seekbar touch stopped!", Toast.LENGTH_SHORT).show();
        if (progress == 5) {

            Toast.makeText(getApplicationContext(),"Intermediate level!", Toast.LENGTH_LONG).show();

        }

        if (progress == 10) {

            Toast.makeText(getApplicationContext(),"Expert level!", Toast.LENGTH_LONG).show();

        }


    }
}
