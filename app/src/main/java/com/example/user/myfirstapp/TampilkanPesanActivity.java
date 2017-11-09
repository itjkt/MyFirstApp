package com.example.user.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.user.myfirstapp.R.id.txtPesan;

public class TampilkanPesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan_pesan);

        Intent frmMain = getIntent();
        String pesanditerima = frmMain.getStringExtra(MainActivity.PESANNYA);

        TextView txtpesannya = (TextView)findViewById(txtPesan);
        txtpesannya.setText(pesanditerima);
   }
}
