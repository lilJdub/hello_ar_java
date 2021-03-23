package com.google.ar.core.examples.java.helloar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scanning_Central extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning__central);
        Button scanTYbtn = (Button) findViewById(R.id.ty);
        Button anchorCloud=(Button)findViewById(R.id.anchorcloud);
        scanTYbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTY();
            }
        });
        anchorCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openAnchorcloud();
            }
        });
    }
    private void openTY(){
        Intent intent = new Intent(this, HelloArActivity.class);
        startActivity(intent);
    }
    //private void openAnchorcloud(){
       // Intent intent=new Intent(this, AnchorCloud.class);
        //startActivity(intent);
    //}
}
