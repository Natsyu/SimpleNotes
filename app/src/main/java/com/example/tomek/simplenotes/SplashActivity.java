package com.example.tomek.simplenotes;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.splashScreenTheme);
        super.onCreate(savedInstanceState);


        Intent intent = new Intent(this, NotesListActivity.class);
        startActivity(intent);
        finish();
    }
}
