package com.example.kongdech.finalend;

/**
 * Created by Kongdech on 10/8/2560.
 */

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.TextView;


public class CustomerCursorAdapter extends CursorAdapter {

    public CustomerCursorAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.customer_layout, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        Customer c = (Customer) SqliteHelper.getObjectFromCursor(cursor, Customer.class);
        TextView tvUpdateDeleteTitle = (TextView) view.findViewById(R.id.tvUpdateDeleteTitle);
        TextView tvUpdateDeleteTitle1 = (TextView) view.findViewById(R.id.tvUpdateDeleteTitle1);
        ImageButton ibDeleteCustomer = (ImageButton) view.findViewById(R.id.ibDeleteCustomer);
        ImageButton ibUpdateCustomer = (ImageButton) view.findViewById(R.id.ibUpdateCustomer);
        ibDeleteCustomer.setTag("delete," + cursor.getPosition());
        ibUpdateCustomer.setTag("update," + cursor.getPosition());
        tvUpdateDeleteTitle.setText(c.getFirstName());
        tvUpdateDeleteTitle1.setText(c.getLastName());

    }
}

