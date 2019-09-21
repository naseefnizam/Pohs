package com.example.pohs.DashBoard.Adepters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pohs.DashBoard.Modals.femaleItemModal;
import com.example.pohs.DashBoard.Modals.kidsItemModal;
import com.example.pohs.R;

import java.util.ArrayList;

public class kidsItemAdepter extends ArrayAdapter<kidsItemModal> {

    private ArrayList<kidsItemModal> kidsItem;
    private LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    public kidsItemAdepter(Context context, int resource, ArrayList<kidsItemModal> kidsItem) {
        super(context, resource,kidsItem);
        this.kidsItem = kidsItem;
    }

    public View getView(int position, View view, ViewGroup parent) {

        View rowView= inflater.inflate(R.layout.kidsitemlayout, null, true);

        TextView productName = (TextView) rowView.findViewById(R.id.pname);
        productName.setText(kidsItem.get(position).getProductName());

        TextView productID = (TextView) rowView.findViewById(R.id.pid);
        productID.setText(kidsItem.get(position).getProductPrice());

        TextView price = (TextView) rowView.findViewById(R.id.price);
        price.setText(kidsItem.get(position).getProductSize());

        TextView productType = (TextView) rowView.findViewById(R.id.type);
        productType.setText(kidsItem.get(position).getDescreption());

        TextView productDisc = (TextView) rowView.findViewById(R.id.disc);
        productDisc.setText(kidsItem.get(position).getProductType());

        return rowView;
    }
}
