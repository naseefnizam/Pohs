package com.example.pohs.DashBoard;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pohs.DashBoard.Adepters.kidsItemAdepter;
import com.example.pohs.DashBoard.Modals.UploadModal;
import com.example.pohs.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class KidsItems extends Fragment {


    public KidsItems() {
        // Required empty public constructor
    }

    ArrayList<UploadModal> kidsitem = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_kids_items, container, false);


        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("UploadItems");
        dbRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.hasChildren()){
                    kidsitem.clear();

                    for (DataSnapshot ds : dataSnapshot.getChildren())
                    {
                        UploadModal spacecraft=ds.getValue(UploadModal.class);
                        assert spacecraft != null;
                        if("Kids Items".equals(spacecraft.getProductType()))
                        kidsitem.add(spacecraft);
                    }

                    kidsItemAdepter listAdapter = new kidsItemAdepter(KidsItems.this.getContext(),R.id.female_listview,kidsitem );
                    ListView list=(ListView)view.findViewById(R.id.kids_listview);
                    list.setAdapter(listAdapter);


//                    vegetables.add((Vegetables) dataSnapshot.getValue());
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return view;
    }

}
