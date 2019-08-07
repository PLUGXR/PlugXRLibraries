package com.app.plugxrwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.plugxr.widgets.PlugXRWidgets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Call Url , Need to pass url here

        Button callUrlBtn = (Button)findViewById(R.id.callUrl);
        callUrlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlugXRWidgets widgets = new PlugXRWidgets();
                widgets.CallUrl(MainActivity.this,"https://www.facebook.com/surya.nadiminti.7");
            }
        });





    }
}
