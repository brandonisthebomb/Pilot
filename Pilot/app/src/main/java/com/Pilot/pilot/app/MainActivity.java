package com.Pilot.pilot.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    public void startGoalActivity(View view)
    {
        Intent intent = new Intent(this, createGoalActivity.class);
        startActivity(intent);
    }


    public void seeProgressScreen(View view)
    {
        Intent intent = new Intent(this, progressScreenActivity.class);
        startActivity(intent);
    }

    public void seeQuote(View view)
    {
        Intent intent = new Intent(this, quoteActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
