package com.kurutin.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onLogin(View view) {
       findViewById(R.id.textLabel).setVisibility(View.VISIBLE);
    }
}
