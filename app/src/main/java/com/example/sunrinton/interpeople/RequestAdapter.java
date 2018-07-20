package com.example.sunrinton.interpeople;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class RequestAdapter extends BaseAdapter {
    
    private ArrayList<RequestData> items = new ArrayList<>();
    private Context mcontext;

    public RequestAdapter(ArrayList<RequestData> items, Context mcontext) {
        this.items = items;
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.item_request_type, null);

        TextView TV = v.findViewById(R.id.request_item_content);
        TV.setText(items.get(position).getContent());

        return v;
    }
}