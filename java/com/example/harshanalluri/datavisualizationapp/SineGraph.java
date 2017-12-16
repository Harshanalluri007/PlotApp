package com.example.harshanalluri.datavisualizationapp;

/**
 * Created by harshanalluri on 12/8/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class SineGraph extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);

        double y,x;
        x = -5.0;

        GraphView graph = (GraphView) findViewById(R.id.graph2);
        series = new LineGraphSeries<DataPoint>();
        for(int i =0; i<100; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new DataPoint(x, y), true, 100);
        }
        graph.addSeries(series);
    }


}