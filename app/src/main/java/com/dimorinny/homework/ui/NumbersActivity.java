package com.dimorinny.homework.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dimorinny.homework.adapter.NumbersAdapter;
import com.dimorinny.homework.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Dimorinny on 11.10.15.
 */

public class NumbersActivity extends AppCompatActivity {

    private static final int NUMBERS_COUNT = 1000;

    @Bind(R.id.numbers_recycler)
    protected RecyclerView mRecyclerView;

    private NumbersAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ButterKnife.bind(this);

        initRecyclerView();
    }

    private void initRecyclerView() {
        mAdapter = new NumbersAdapter(NUMBERS_COUNT);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new NumberBackgroundDecoration());
    }
}
