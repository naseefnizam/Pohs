package com.example.pohs.DashBoard.Adepters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pohs.DashBoard.Modals.femaleItemModal;
import com.example.pohs.DashBoard.Modals.storeItemModal;
import com.example.pohs.R;

import java.util.ArrayList;

public class femaleItemAdepter extends ArrayAdapter<femaleItemModal> {

    private ArrayList<femaleItemModal> femaleItem;
    private LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    public femaleItemAdepter(Context context, int resource, ArrayList<femaleItemModal> femaleItem) {
        super(context, resource,femaleItem);
        this.femaleItem = femaleItem;
    }

    public View getView(int position, View view, ViewGroup parent) {

        View rowView= inflater.inflate(R.layout.femaleitemlayout, null, true);

        TextView productName = (TextView) rowView.findViewById(R.id.pname);
        productName.setText(femaleItem.get(position).getProductName());

        TextView productID = (TextView) rowView.findViewById(R.id.pid);
        productID.setText(femaleItem.get(position).getProductPrice());

        TextView price = (TextView) rowView.findViewById(R.id.price);
        price.setText(femaleItem.get(position).getProductSize());

        TextView productType = (TextView) rowView.findViewById(R.id.type);
        productType.setText(femaleItem.get(position).getDescreption());

        TextView productDisc = (TextView) rowView.findViewById(R.id.disc);
        productDisc.setText(femaleItem.get(position).getProductType());

        return rowView;
    }
}
