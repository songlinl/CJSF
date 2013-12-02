package com.example.hellotabwidget;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("CJSF Radio for Android\n\n" +
        		"Version: 1.0.0001\n\n" +
        		"CJSF broadcasts from the Burnaby mountain campus of Simon Fraser University at 90.1 FM to most of Greater Vancouver, from Langley to Point Grey and from the North Shore to the US Border. It is also available on 93.9 FM cable in the communities of SFU, Burnaby, New Westminister, Coquitlam, Port Coquitlam, Port Moody, Surrey and Delta, in British Columbia Canada and through MP3 streaming and through a speaker located just outside the station. CJSF is on 7 days a week between the hours of 8AM-2AM. \n\n" +
        		"Kevin Li, Marc-Olivier Harvey, Magnus Thyvold.\n" +
        		"Copyrigh © 2011-12 CJSF Radio Station.\n" +
        		"All Rights Reserved.\n");
        setContentView(textview);
    }
}