package com.example.user.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PESANNYA = "com.example.user.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kirimPesan(View v){
        Intent frmPesan = new Intent(this,TampilkanPesanActivity.class);
        EditText txtPesan = (EditText)findViewById(R.id.txtPesan);
        String pesan = txtPesan.getText().toString();
        frmPesan.putExtra(PESANNYA,pesan);
        startActivity(frmPesan);
    }
}
