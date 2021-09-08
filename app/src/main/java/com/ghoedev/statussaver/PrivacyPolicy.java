package com.ghoedev.statussaver;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import statussaver.R;

public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        Toolbar toolbar = findViewById(R.id.toolbarPolicy);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.policy_view);

        textView.setText("\n" +
                "\n" +
                "We value your privacy very much. Regarding any information we may acquire from you through this software, Status Saver, it is our policy to protect your privacy.\n" +
                "\n" +
                "We only ask for personal information when it is absolutely necessary to provide you with a service. With your knowledge and consent, we collect it in a fair and lawful manner. We also explain why we're collecting it and how we'll use it.\n" +
                "\n" +
                "We only keep the information we collect for as long as it's necessary to provide you with the service you've requested. We'll protect the data we hold using commercially reasonable safeguards to prevent loss and theft, as well as unauthorized access, disclosure, copying, use, or alteration.\n" +
                "\n" +
                "Except as required by law, we do not share any personally identifiable information publicly or with third parties.\n" +
                "\n" +
                "This app may contain links to third-party websites that are not under our control. Please understand that we have no responsibility for the content or practices of these websites, and we thus cannot accept liability for their privacy policies.\n" +
                "\n" +
                "You are allowed to decline our request for your personal information, with the knowledge that we may be unable to offer you with some of your requested services.\n" +
                "\n" +
                "Continued use of our app will be seen as acceptance of our privacy and personal information policies. Please contact us if you have any queries regarding how we manage user data and personal information.\n" +
                "\n" +
                "This policy is effective as of 10 August 2021.\n");

    }
}