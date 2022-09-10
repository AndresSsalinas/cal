package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_Ran;

    private TextView espuesta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        espuesta = (TextView) findViewById(R.id.respuesta);

        btn_Ran = (Button) findViewById(R.id.button_Ran);
        btn_Ran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                espuesta.setText(cadenaAleatoria(6));

            }
        });

    }

    public  String cadenaAleatoria(int longitud){

        char[] banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int x = 0; x < longitud; x++) {
            char caracterAleatorio = banco[random.nextInt(banco.length)];
            stringBuilder.append(caracterAleatorio);
        }
        return stringBuilder.toString();

    }
}
