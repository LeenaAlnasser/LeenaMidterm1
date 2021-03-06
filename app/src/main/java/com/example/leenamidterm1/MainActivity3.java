package com.example.leenamidterm1;


import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        String[] attraction = {
                "First Item",
                "Second Item",
                "GO TO ACT 1",
                "GO TO ACT 2"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main3, R.id.travel, attraction));

    }

    protected void onListItemClick(
            ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(MainActivity3.this, Item2.class));
                break;

            case 2:
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
                break;

            case 3:
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
                break;

        }

    }
}
