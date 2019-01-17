package com.example.sebas.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText Valor1, Valor2;
    private TextView Resultado;
    private RadioButton Rb1, Rb2, Rb3, Rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor1 = (EditText)findViewById(R.id.Txt_Numero1);
        Valor2 = (EditText)findViewById(R.id.Txt_Numero2);
        Resultado = (TextView)findViewById(R.id.Txt_Resultado);
        Rb1 = (RadioButton)findViewById(R.id.Radiobut1);
        Rb2 = (RadioButton)findViewById(R.id.RadioBut2);
        Rb3 = (RadioButton)findViewById(R.id.RadioBut3);
        Rb4 = (RadioButton)findViewById(R.id.RadioBut4);
    }

    public void Resolver(View view)
    {
        String String_Valor1 = Valor1.getText().toString();
        String String_Valor2 = Valor2.getText().toString();

        float Valor1_int = Float.parseFloat(String_Valor1);
        float Valor2_int = Float.parseFloat(String_Valor2);

        if(Rb1.isChecked() == true)
        {
            float Suma = Valor1_int + Valor2_int;
            String resultado = String.valueOf(Suma);
            Resultado.setText(resultado);
        }
        else if(Rb2.isChecked() == true)
        {
            float Resta = Valor1_int - Valor2_int;
            String resultado = String.valueOf(Resta);
            Resultado.setText(resultado);
        }
        else if(Rb3.isChecked() == true)
        {
            float Multiplicacion = Valor1_int * Valor2_int;
            String resultado = String.valueOf(Multiplicacion);
            Resultado.setText(resultado);
        }
        else if(Rb4.isChecked() == true)
        {
            if(Valor2_int == 0)
            {
                Toast.makeText(this, "El segundo valor debe ser diferente de cero", Toast.LENGTH_LONG).show();
            }
            else
            {
                float Division = Valor1_int / Valor2_int;
                String resultado = String.valueOf(Division);
                Resultado.setText(resultado);
            }
        }
    }
}




















