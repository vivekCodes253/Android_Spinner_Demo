package com.andromin.rvive.andromin_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp();
    }

    public void sp()
    {
        Spinner sp = (Spinner)findViewById(R.id.sp);
        ArrayList<String> al = new ArrayList<String>();

        al.add("English");
        al.add("Physics");
        al.add("Chemistry");

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,al);

        sp.setAdapter(aa);

    }

    public void showSelected(View v)
    {
        Spinner sp = (Spinner)findViewById(R.id.sp);
        String selected = sp.getSelectedItem().toString();

        Toast.makeText(this, "You have selected "+selected, Toast.LENGTH_SHORT).show();
    }

}
