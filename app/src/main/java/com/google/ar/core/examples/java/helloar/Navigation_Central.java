package com.google.ar.core.examples.java.helloar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Navigation_Central extends Activity {
    private Button GPSbtn;
    private Button GCLbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation__central);
        GPSbtn=(Button)findViewById(R.id.Button_GPS);
        GPSbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGPS();
            }
        });
        GCLbtn=(Button)findViewById(R.id.GetCurrentLocation);
        GCLbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGCL();
            }
        });
    }
    public void openGPS(){
        Intent inte = new Intent(this, GPS_Activity.class);
        startActivity(inte);
    }
    public void openGCL(){
        Intent in=new Intent(this, GetCurrentLocation.class);
        startActivity(in);
    }
}
