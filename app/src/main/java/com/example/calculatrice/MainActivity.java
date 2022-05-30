package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView ecran;
    static String ZERO = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ecran = findViewById(R.id.ecran);
        ecran.setText(ZERO);

    }

    public void afficherChiffre(View view) {
        Button btn = (Button) view;
        String ecranText = ecran.getText().toString();
        String chiffre = btn.getText().toString();
        ecran.setText(ZERO.equals(ecranText) ?chiffre: ecranText+chiffre);
    }
    public void ce(View view) {
        ecran.setText(ZERO);
    }
}