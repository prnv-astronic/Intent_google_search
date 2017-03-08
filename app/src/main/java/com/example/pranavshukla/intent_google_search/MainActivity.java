package com.example.pranavshukla.intent_google_search;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button search_button =(Button)findViewById(R.id.button); // register button
        final EditText search_for =(EditText)findViewById(R.id.editText);// register edit text object
        // set on click listner activity on search button
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_for.getText().toString();// get string from entered text
                Intent open_google=new Intent(Intent.ACTION_WEB_SEARCH); // create new intent
                open_google.putExtra(SearchManager.QUERY, search_for.getText().toString());//pass data to intent
                startActivity(open_google);// start intent
            }
        });
    }
}
