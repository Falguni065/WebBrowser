package com.example.sharna.webbrowser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sharna on 8/31/2017.
 */

public class custom extends BaseAdapter {

    String[] s;
    int[] pic;
    Context ct;
    private static LayoutInflater inflater = null;

    public custom(MainActivity mainAct, String[] name, int[] im)
    {
        s = name;
        pic = im;
        ct = mainAct;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return s.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class holder
    {
        TextView t;
        ImageView ip;
    }
    @Override
    public View getView(int position, View convertview, ViewGroup parent) {

        holder h = new holder();
        View myview;
        myview = inflater.inflate(R.layout.lvlayout,null);
        h.t = (TextView) myview.findViewById(R.id.txtid);
        h.ip = (ImageView) myview.findViewById(R.id.myimage);

        h.t.setText(s[position]);
        h.ip.setImageResource(pic[position]);


        return myview;
    }
}
