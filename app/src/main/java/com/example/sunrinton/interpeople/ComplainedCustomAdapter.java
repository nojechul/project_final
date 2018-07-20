package com.example.sunrinton.interpeople;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ComplainedCustomAdapter extends BaseAdapter {

    ArrayList<ComplainedData> items;
    Context mContext;

    public ComplainedCustomAdapter(ArrayList<ComplainedData> items, Context mContext) {
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
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_list_complained, null);

        TextView dateandaddr = v.findViewById(R.id.dataandaddr);
        TextView complain = v.findViewById(R.id.complain);

        ComplainedData data = items.get(position);

        dateandaddr.setText(data.getDateandaddr());
        complain.setText(data.getComplain());

        return v;
    }
}
