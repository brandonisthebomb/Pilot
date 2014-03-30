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


public class quoteActivity extends Activity {

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

}
