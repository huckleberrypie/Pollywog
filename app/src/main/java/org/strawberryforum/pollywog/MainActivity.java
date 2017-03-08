package org.strawberryforum.pollywog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.content.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // Declare stuff because Android says so
    ImageButton imgBtnApps;
    ImageButton imgBtnLock;
    ImageButton imgBtnDeveloper;
    ImageButton imgBtnWLAN;
    ImageButton imgBtnResources;
    ImageButton imgBtnEngr;
    ImageButton imgBtnCustHlp;
    ImageButton imgBtnAbout;

    private Intent about = new Intent();
    private Intent resources = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
        initListener();

        // setTitle only affects the app bar. This is so that MainActivity uses the short name "app_name"
        // instead of the overly long "about" string on other launchers
        setTitle(R.string.about);
    }

    public void initButtons() {
        imgBtnApps = (ImageButton) findViewById(R.id.imgBtnApps);
        imgBtnLock = (ImageButton) findViewById(R.id.imgBtnLock);
        imgBtnDeveloper = (ImageButton) findViewById(R.id.imgBtnDeveloper);
        imgBtnWLAN = (ImageButton) findViewById(R.id.imgBtnWLAN);
        imgBtnResources = (ImageButton) findViewById(R.id.imgBtnResources);
        imgBtnEngr = (ImageButton) findViewById(R.id.imgBtnEngr);
        imgBtnCustHlp = (ImageButton) findViewById(R.id.imgBtnCustHlp);
        imgBtnAbout = (ImageButton) findViewById(R.id.imgBtnAbout);
    }

    public void initListener() {
        imgBtnApps.setOnClickListener(onClickListener);
        imgBtnLock.setOnClickListener(onClickListener);
        imgBtnDeveloper.setOnClickListener(onClickListener);
        imgBtnWLAN.setOnClickListener(onClickListener);
        imgBtnResources.setOnClickListener(onClickListener);
        imgBtnEngr.setOnClickListener(onClickListener);
        imgBtnCustHlp.setOnClickListener(onClickListener);
        imgBtnAbout.setOnClickListener(onClickListener);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.imgBtnWLAN:
                    Intent intWLAN = new Intent(Intent.ACTION_MAIN);
                    intWLAN.setComponent(new ComponentName("com.android.settings", "com.android.settings.wifi.WifiSettings"));
                    startActivity(intWLAN);
                    break;
                case R.id.imgBtnApps:
                    Intent intApps = new Intent(Intent.ACTION_MAIN);
                    intApps.setComponent(new ComponentName("com.leapfrog.contentmanager", "com.leapfrog.contentmanager.MainActivity"));
                    startActivity(intApps);
                    break;
                case R.id.imgBtnDeveloper:
                    Intent intDeveloper = new Intent(Intent.ACTION_MAIN);
                    intDeveloper.setComponent(new ComponentName("com.android.settings", "com.android.settings.DevelopmentSettings"));
                    startActivity(intDeveloper);
                    break;
                case R.id.imgBtnLock:
                    Intent intLock = new Intent(Intent.ACTION_MAIN);
                    intLock.setComponent(new ComponentName("com.android.settings", "com.android.settings.ChooseLockGeneric"));
                    startActivity(intLock);
                    break;
                case R.id.imgBtnResources:
                    resources.setClass(getApplicationContext(), ResourcesActivity.class);
                    startActivity(resources);
                    break;
                case R.id.imgBtnEngr:
                    Intent intEngr = new Intent(Intent.ACTION_MAIN);
                    intEngr.setComponent(new ComponentName("com.mediatek.engineermode", "com.mediatek.engineermode.EngineerMode"));
                    startActivity(intEngr);
                    break;
                case R.id.imgBtnCustHlp:
                    Intent intSupport = new Intent(Intent.ACTION_MAIN);
                    intSupport.setComponent(new ComponentName("com.quanta.leapfrog.support", "com.quanta.leapfrog.support.MainActivity"));
                    startActivity(intSupport);
                    break;
                case R.id.imgBtnAbout:
                    about.setClass(getApplicationContext(), AboutActivity.class);
                    startActivity(about);
                break;
            }
        }

    };
}