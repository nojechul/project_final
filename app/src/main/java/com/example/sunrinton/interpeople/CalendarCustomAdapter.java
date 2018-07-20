package com.example.sunrinton.interpeople;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CalendarCustomAdapter extends BaseAdapter {

    ArrayList<CalendarData> items;
    Context mContext;

    public CalendarCustomAdapter(ArrayList<CalendarData> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_list_calendar, null);

        TextView date = v.findViewById(R.id.date);
        TextView work = v.findViewById(R.id.work);

        CalendarData data = items.get(position);

        date.setText(data.getDate());
        work.setText(data.getWork());

        return v;
    }
}
