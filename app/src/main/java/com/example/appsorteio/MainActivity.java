package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jogar(View view) {
        TextView textResultado;
        textResultado = findViewById(R.id.textResultadoXML);

        btPlay = (Button) view.findViewById(R.id.playXML);

        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num;
                num = new Random().nextInt(11);

                textResultado.setText("Your Random Number is: " + num);
            }
        });

    }

}