package com.example.harshanalluri.datavisualizationapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executor;


public class MainActivity extends AppCompatActivity {

    private Button PlotButton;
    private Button BarButton;
    private Button LineButton;
    private Button SinButton;
    private Button PointButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PlotButton = (Button) findViewById(R.id.button);
        BarButton = (Button) findViewById(R.id.button3);
        LineButton = (Button) findViewById(R.id.button2);
        SinButton = (Button) findViewById(R.id.button4);
        PointButton = (Button) findViewById(R.id.button5);
        PlotButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, PlotApp.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        BarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, BarGraph.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        LineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, LineGraph.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        SinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, SineGraph.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

        PointButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, PointsGraph.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
}


