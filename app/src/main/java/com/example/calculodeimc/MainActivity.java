package com.example.calculodeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editPeso;
    private EditText editAltura;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        resultado = findViewById(R.id.resultado);


    }

    public void calcularIMC(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso/(altura*altura);

        if(imc >= 18.5 && imc <= 24.99){

            resultado.setText("PESO NORMAL! Seu IMC é: "+ imc);

        } else if (imc >= 25 && imc <= 29.99){

            resultado.setText("ACIMA DO PESO!! Seu IMC é: "+ imc);

        } else if (imc >= 30 && imc <= 34.99){

            resultado.setText("OBESIDADE I! Seu IMC é: "+ imc);

        } else if (imc >= 35 && imc <= 39.99){

            resultado.setText("OBESIDADE II! Seu IMC é: "+ imc);

        } else if (imc > 40) {

            resultado.setText("OBESIDADE III! Seu IMC é: "+ imc);
        }

    }

}