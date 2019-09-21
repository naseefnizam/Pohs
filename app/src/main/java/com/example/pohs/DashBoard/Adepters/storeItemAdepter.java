package com.example.pohs.DashBoard.Adepters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pohs.DashBoard.Modals.storeItemModal;
import com.example.pohs.DashBoard.Store;
import com.example.pohs.R;

import java.util.ArrayList;
import java.util.List;

public class storeItemAdepter extends ArrayAdapter<storeItemModal> {

    private ArrayList<storeItemModal> storeItem;
    private LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    public storeItemAdepter(Context context, int resource, ArrayList<storeItemModal> storeItem) {
        super(context, resource,storeItem);
        this.storeItem = storeItem;
    }

    public View getView(int position, View view, ViewGroup parent) {

        View rowView= inflater.inflate(R.layout.storeitemlayout, null, true);

        TextView productName = (TextView) rowView.findViewById(R.id.pname);
        productName.setText(storeItem.get(position).getProductName());

        TextView productID = (TextView) rowView.findViewById(R.id.pid);
        productID.setText(storeItem.get(position).getProductPrice());

        TextView price = (TextView) rowView.findViewById(R.id.price);
        price.setText(storeItem.get(position).getProductSize());

        TextView productType = (TextView) rowView.findViewById(R.id.type);
        productType.setText(storeItem.get(position).getDescreption());

        TextView productDisc = (TextView) rowView.findViewById(R.id.disc);
        productDisc.setText(storeItem.get(position).getProductType());

        return rowView;
    }
}
