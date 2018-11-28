package com.example.samirsarosh.myapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        RecyclerView gridview = (RecyclerView) findViewById(R.id.grid);
        // data to populate the RecyclerView with
        String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"};
//        String[] data = {"1", "", ""};
        // set up the RecyclerView
        final RecyclerView recyclerView = findViewById(R.id.grid);
        int numberOfColumns = 6;
        int cardViewWidth = (int) getResources().getDimension(R.dimen.item_layout_width);
        final GridAutofitLayoutManager mLayoutManager = new GridAutofitLayoutManager(this, cardViewWidth);
        recyclerView.setLayoutManager(mLayoutManager);
        ImageAdapter adapter = new ImageAdapter(this, data);
//        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

//        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(
//                new ViewTreeObserver.OnGlobalLayoutListener() {
//                    @Override
//                    public void onGlobalLayout() {
//                        recyclerView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
//                        int viewWidth = recyclerView.getMeasuredWidth();
//                        float cardViewWidth = getResources().getDimension(R.dimen.cardview_layout_width);
//                        Resources r = getResources();
////                        float px = TypedValue.applyDimension(
////                                TypedValue.COMPLEX_UNIT_DIP,
////                                59,
////                                r.getDisplayMetrics()
////                        );
//                        int newSpanCount = (int) Math.floor(viewWidth / cardViewWidth);
//                        mLayoutManager.setSpanCount(newSpanCount);
//                        mLayoutManager.requestLayout();
//                    }
//                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
