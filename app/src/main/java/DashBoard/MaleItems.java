package DashBoard;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



import com.example.pohs.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaleItems extends Fragment {


    public MaleItems() {
        // Required empty public constructor
    }

    final int maleItemImg[] = {R.drawable.man, R.drawable.menaaa, R.drawable.menm,R.drawable.mens, R.drawable.menaaa, R.drawable.mens};

    final String MaleItemName[] ={"Dress1","Dress2","Dress3","Dress4","Dress5","Dress6"};

    final String MaleItemSize[] = {"23","24","34","32","23","31"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View  views = inflater.inflate(R.layout.fragment_male_items,container,false);



        ListView listView = (ListView)views.findViewById(R.id.MaleItemLV);

        MaleItemAdepter maleItemAdepter = new MaleItemAdepter();

        listView.setAdapter(maleItemAdepter);

        return views;
    }

    class MaleItemAdepter extends BaseAdapter{



        @Override
        public int getCount() {
            return maleItemImg.length;
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

            View view = getLayoutInflater().inflate(R.layout.custom_male_item_view,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.miimageView);
            TextView textView_miName = (TextView)view.findViewById(R.id.textView_miname);
            TextView textView_miSize = (TextView)view.findViewById(R.id.textView_misize);

            imageView.setImageResource(maleItemImg[position]);
            textView_miName.setText(MaleItemName[position]);
            textView_miSize.setText(MaleItemSize[position]);

            return view ;
        }
    }



}
