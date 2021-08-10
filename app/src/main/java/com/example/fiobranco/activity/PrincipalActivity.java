package com.example.fiobranco.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fiobranco.R;

public class PrincipalActivity extends AppCompatActivity {

    private TextView campoFrequencia, campoSangue, campoTemperatura, campoQueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        campoFrequencia = findViewById(R.id.textFrequencia);
        campoSangue = findViewById(R.id.textSangue);
        campoTemperatura = findViewById(R.id.textTemperatura);
        campoQueda = findViewById(R.id.textQueda);
    }
}