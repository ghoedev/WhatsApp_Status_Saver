package com.ghoedev.statussaver;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;
import statussaver.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        CardView contact = findViewById(R.id.contact);
        contact.setOnClickListener(v -> {



        });

        CardView email = findViewById(R.id.email);
        email.setOnClickListener(v -> {

        });

        TextView app_version = findViewById(R.id.app_version);
        app_version.setText(getAppVersion());

    }

    private String getAppVersion(){

        String result = "";
        try {
            result = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(),0)
                    .versionName;
            result = result.replaceAll("[a-zA-Z]|-","");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

}
