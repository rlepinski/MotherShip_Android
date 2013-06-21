package com.urbanairship.mothership;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    private static final String CALENDAR_URL = "http://calendar.google.com/";
    private static final String TWITTER_URL = "http://twitter.com/urbanairship/";
    private static final String LAKEHURT_LEDGER_URL = "https://urbanairship.jiveon.com/groups/lakehurst-ledger/";
    private static final String CONTACTS_URL = "https://www.google.com/contacts/";
    private static final String EGENCIA_URL = "https://www.egencia.com/en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_screen);
        

        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CALENDAR_URL));
				startActivity(browserIntent);
				
			}
		});
        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(TWITTER_URL));
				startActivity(browserIntent);
				
			}
		});
        findViewById(R.id.button3).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(LAKEHURT_LEDGER_URL));
				startActivity(browserIntent);
				
			}
		});
        findViewById(R.id.button4).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(CONTACTS_URL));
				startActivity(browserIntent);
				
			}
		});
        findViewById(R.id.button5).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(EGENCIA_URL));
				startActivity(browserIntent);
				
			}
		});
    }
}
