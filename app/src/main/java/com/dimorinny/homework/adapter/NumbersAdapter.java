package com.dimorinny.homework.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dimorinny.homework.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import pl.allegro.finance.tradukisto.ValueConverters;

/**
 * Created by Dimorinny on 11.10.15.
 */

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.ViewHolder> {
    private int mCount;
    private final ValueConverters mConverter = ValueConverters.RUSSIAN_INTEGER;

    public NumbersAdapter(int count) {
        mCount = count;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.number_item)
        protected TextView mNumberItemTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_number, viewGroup, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mNumberItemTextView.setText(mConverter.asWords(i + 1));
    }

    @Override
    public int getItemCount() {
        return mCount;
    }
}
