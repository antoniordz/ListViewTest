package com.tumundo.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

/**
 * Created by antoniorodriguez on 9/25/14.
 */
public class StringArrayAdapter extends BaseAdapter {

    String[] names;
    Context cntx;
    LayoutInflater infl;

    public StringArrayAdapter(String[] arr, Context c)  {
        names = arr;
        cntx = c;
        infl = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = infl.inflate(android.R.layout.simple_list_item_1, parent, false);
        TextView name = (TextView)convertView.findViewById(android.R.id.text1);
        name.setText(names[position]);
        return convertView;
    }
}
