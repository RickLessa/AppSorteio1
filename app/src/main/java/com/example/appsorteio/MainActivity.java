package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //criando variaveis para "conectar" com objetos XML
    private Button btPlay;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //metodo onCreate
        super.onCreate(savedInstanceState);              //
        setContentView(R.layout.activity_main);          //

        //relacionando widgets com objetos XML
        btPlay = findViewById(R.id.playXML);
        textResultado = findViewById(R.id.textResultadoXML);

        //Adicionando metodo Listener para botao play
        //em vez adicionar propriedade "onClick" no XML
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = new Random().nextInt(11);
                textResultado.setText(Integer.toString(num));
            }
        });
    }}


