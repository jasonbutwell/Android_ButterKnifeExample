package com.jasonbutwell.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // create our views with ButterKnife
    @BindView(R.id.textView) TextView title;
    @BindView(R.id.listView) ListView list;

    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind the views - ready for use
        ButterKnife.bind(this);

        // create adapter and set it to our list
        MyAdapter adapter = new MyAdapter(this, data);
        list.setAdapter(adapter);

        // change the text in the title textview
        title.setText("HELLO!");

        // create some data for our adapter and notify the data has changed
        createData();
        adapter.notifyDataSetChanged();
    }

    public void createData() {
        // Just some example test data for our array adapter to use
        data.add("Test 1");
        data.add("Test 2");
        data.add("Test 3");
        data.add("Test 4");
        data.add("Test 5");
    }
}
