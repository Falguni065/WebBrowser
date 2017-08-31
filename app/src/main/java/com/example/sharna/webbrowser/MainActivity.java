package com.example.sharna.webbrowser;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {


    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView)findViewById(R.id.listview);
        String[] x = {"facebook","youtube"};
        int[] w = {R.drawable.facebook,R.drawable.youtube};
        custom adapter = new custom(this,x,w);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                if(pos == 0)
                {
                    Intent i1 =new Intent(view.getContext(),facebook.class);
                    startActivity(i1);
                }
                if(pos == 1)
                {
                    Intent i1 =new Intent(view.getContext(),youtube.class);
                    startActivity(i1);
                }
            }
        });

    }
}
