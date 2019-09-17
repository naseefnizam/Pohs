package DashBoard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.pohs.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;





public class Upload extends AppCompatActivity {

    private Toolbar mtoolbar;


    ImageButton imageButton ;
    private int Gallary_intent =2;

    EditText Pname;
    EditText Pid;
    EditText Psize;
    Spinner Ptype;
    EditText Pprice;
    EditText Descrip;
    Button addb;

    DatabaseReference databaseRefUploadItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        mtoolbar = (Toolbar)findViewById(R.id.Upload_dashboard_toolbar);
        //setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("UPLOAD");

        databaseRefUploadItem = FirebaseDatabase.getInstance().getReference("UploadItems");
        imageButton = (ImageButton)findViewById(R.id.imgbtn);

        Pname =(EditText)findViewById(R.id.pName);
        Pid =(EditText)findViewById(R.id.pId);
        Psize = (EditText)findViewById(R.id.pSize);
        Ptype = (Spinner)findViewById(R.id.dresstype);
        Pprice =(EditText)findViewById(R.id.pPrice) ;
        Descrip = (EditText)findViewById(R.id.pDescription);
        addb = (Button)findViewById(R.id.addbtn);

        //dropdown for dress type



        addb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItems();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    public void imgbutton(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,Gallary_intent);
    }

    public void addItems(){

        String ProName = Pname.getText().toString().trim();
        String ProID = Pid.getText().toString().trim();
        String ProSize = Psize.getText().toString().trim();
        String ProType = Ptype.getSelectedItem().toString();
        String ProPrice = Pprice.getText().toString().trim();
        String Des = Descrip.getText().toString().trim();

        if (!TextUtils.isEmpty(ProName) && !TextUtils.isEmpty(ProID) && !TextUtils.isEmpty(ProSize) && !TextUtils.isEmpty(ProType) && !TextUtils.isEmpty(ProPrice) && !TextUtils.isEmpty(Des)){
                String id = databaseRefUploadItem.push().getKey();
                UploadModal uploadModal = new UploadModal(ProName,ProID,ProSize,ProType,ProPrice,Des,id);
                databaseRefUploadItem.child(id).setValue(uploadModal);
             Toast.makeText(this,"Product Added",Toast.LENGTH_LONG).show();






        }else {
            Toast.makeText(this,"All Field Should be Fill",Toast.LENGTH_LONG).show();
        }
    }
}
