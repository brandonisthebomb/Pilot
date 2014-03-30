package com.Pilot.pilot.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Handler;


public class quoteActivity extends Activity {
    int[] imageArray = {R.drawable.antelope_quote1, R.drawable.pond_quote2, R.drawable.brushes_quote3, R.drawable.desert_quote4,
    R.drawable.ducks_quote5, R.drawable.moon_quote6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        String text = new String();
        String author = new String();
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(getAssets().open("quotes.txt")));



            int numlines = new Integer(9);
            int numimages = new Integer(6);
            Random r = new Random();
            int desiredLine = r.nextInt(numlines);
            int desiredImage = r.nextInt(numimages);

            int lineCtr = 0;
            while ((text = reader.readLine()) != null)   {
                author = reader.readLine();
                if (lineCtr == desiredLine) {
                    break;
                }
                lineCtr++;
            }


            reader.close();
            ImageView backDisplay = (ImageView)findViewById(R.id.imageView1);
            backDisplay.setBackgroundResource(imageArray[desiredImage]);


            TextView quoteDisplay = (TextView)findViewById(R.id.quoteDisplay);
            quoteDisplay.setText('"'+text+'"');
            quoteDisplay.setGravity(Gravity.CENTER);
            quoteDisplay.setTextColor(Color.WHITE);
            quoteDisplay.setTextSize(35);

            TextView authorDisplay = (TextView)findViewById(R.id.authorDisplay);
            authorDisplay.setText("-" + author);
            authorDisplay.setGravity(Gravity.RIGHT);
            authorDisplay.setTextColor(Color.WHITE);
        }
        catch (IOException e)
        {
            System.err.println("FileNotFoundException: " + e.getMessage());
        }


    }

}
