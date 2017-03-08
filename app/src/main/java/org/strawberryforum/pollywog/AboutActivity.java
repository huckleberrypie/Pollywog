package org.strawberryforum.pollywog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.content.*;
import android.widget.*;

public class AboutActivity extends AppCompatActivity {

    Button btnLicences;
    private Intent licences = new Intent();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        loadButton();
        loadListener();
    }

    public void loadButton() {
        btnLicences = (Button) findViewById(R.id.btnLicences);
    }

    public void loadListener() {
        btnLicences.setOnClickListener(onClickListener);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        public void onClick(View _v) {
            licences.setClass(getApplicationContext(), Licences.class);
            startActivity(licences);
        }
    };
}