package com.Pilot.pilot.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class quoteActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        String text = new String();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("quotes.txt")));

            int numlines = new Integer(9);
            Random r = new Random();
            int desiredLine = r.nextInt(numlines);

            int lineCtr = 0;
            while ((text = reader.readLine()) != null)   {
                if (lineCtr == desiredLine) {
                    break;
                }
                lineCtr++;
            }


            reader.close();


            TextView quoteDisplay = (TextView)findViewById(R.id.quoteDisplay);
            quoteDisplay.setText('"'+text+'"');
            quoteDisplay.setTextSize(30);
            quoteDisplay.setGravity(Gravity.CENTER);


        }
        catch (IOException e)
        {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quote, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
