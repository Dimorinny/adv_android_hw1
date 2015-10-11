package com.dimorinny.homework.ui;

import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.dimorinny.homework.R;

/**
 * Created by Dimorinny on 11.10.15.
 */
public class NumberBackgroundDecoration extends RecyclerView.ItemDecoration {

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int number = parent.getChildAdapterPosition(view) + 1;
        int backgroundColorResource = number % 2 == 0 ? R.color.gray : R.color.white;
        int backgroundColor = ContextCompat.getColor(view.getContext(), backgroundColorResource);

        view.setBackgroundColor(backgroundColor);
    }
}
