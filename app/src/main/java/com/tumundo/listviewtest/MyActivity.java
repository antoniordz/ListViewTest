package com.tumundo.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.List;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        String[] nm = {"Antonio", "Lulu", "Lucrecia", "Sofía", "Andrea", "Toño",
                "Antonio", "Lulu", "Lucrecia", "Sofía", "Andrea", "Toño",
                "Antonio", "Lulu", "Lucrecia", "Sofía", "Andrea", "Toño",
        };
        ListView lv = (ListView)findViewById(R.id.listView);
        StringArrayAdapter ad = new StringArrayAdapter(nm, this);
        lv.setAdapter(ad);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
