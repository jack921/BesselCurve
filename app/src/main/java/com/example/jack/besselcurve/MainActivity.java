package com.example.jack.besselcurve;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BesselCurveView mBesselCurveView;
    private List<Integer> listStop=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mBesselCurveView=(BesselCurveView)findViewById(R.id.besselCurveView);
        listStop.add(1254);
        listStop.add(8551);
        listStop.add(6352);
        listStop.add(4000);
        listStop.add(5210);
        listStop.add(2390);
        listStop.add(3094);
        mBesselCurveView.setListStep(listStop);
//        mBesselCurveView.setFriendAverageStep(6752);
//        mBesselCurveView.setAverageStep(2603);
//        mBesselCurveView.setChampion("JACK");
//        mBesselCurveView.setAllStop(9765);
//        mBesselCurveView.setTime("17:26");
//        mBesselCurveView.setRanking("15");
        mBesselCurveView.setChampion_icon(BitmapFactory.
                decodeResource(getResources(), R.drawable.icon));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
