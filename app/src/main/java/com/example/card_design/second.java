package com.example.card_design;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void delete(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(second.this);
        builder.setMessage("DO you want to delete?");
        builder.setTitle("Alert!!!");
        builder.setCancelable(true);
        builder.setPositiveButton("yes",(DialogInterface.OnClickListener)(dialog,which)->{
           finish();
        });
        builder.setPositiveButton("no",(DialogInterface.OnClickListener)(dialog,which)->{
          dialog.cancel();
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}