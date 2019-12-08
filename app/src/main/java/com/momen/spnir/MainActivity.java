package com.momen.spnir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class MainActivity extends AppCompatActivity {

//    ArrayList<String> rooll =new ArrayList<>();
    ArrayList<String> name =new ArrayList<>();
    SpinnerDialog spinnerDialog;
   Button btnShow;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     //   initItems();
        nameItem();

        spinnerDialog=new SpinnerDialog(MainActivity.this,name,"Select Item");
        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String s, int position) {

                Toast.makeText(MainActivity.this, "Roll:  2"+position, Toast.LENGTH_SHORT).show();

            }
        });

        btnShow=findViewById(R.id.btn_show);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDialog.showSpinerDialog();
            }
        });


    }

    private void nameItem() {

        name.add("Harun");
        name.add("Mizba");
        name.add("Momen");
        name.add("proloy");
        name.add("Mridul");
        name.add("Shovo");
        name.add("Melon");
        name.add("Momen");
        name.add("Mithun");
        name.add("Mridul");


    }


}






