package com.Pilot.pilot.app;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class createGoalActivity extends Activity {

    private Spinner spinner;
    public String category;
    public String title;
    public int year;
    public int month;
    public int day;
    public String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_goal);
        CheckBox myCheckBox = (CheckBox)findViewById(R.id.checkBox);
        final DatePicker myDatePicker = (DatePicker)findViewById(R.id.datePicker);

        myCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    myDatePicker.setVisibility(View.VISIBLE);
                } else {
                    myDatePicker.setVisibility(View.GONE);
                }
            }
        });


    }

    public void collectData(View view)
    {
        spinner = (Spinner)findViewById(R.id.spinner1);
        category = String.valueOf(spinner);

        CheckBox myCheckBox = (CheckBox)findViewById(R.id.checkBox);
        if(myCheckBox.isChecked())
        {
            DatePicker myDatePicker = (DatePicker)findViewById(R.id.datePicker);
            year = myDatePicker.getYear();
            month = myDatePicker.getMonth();
            day = myDatePicker.getDayOfMonth();
        }

        EditText descriptionField = (EditText)findViewById(R.id.editText2);
        EditText titleField = (EditText)findViewById(R.id.editText);

        title = titleField.getText().toString();
        description = descriptionField.getText().toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_goal, menu);
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
