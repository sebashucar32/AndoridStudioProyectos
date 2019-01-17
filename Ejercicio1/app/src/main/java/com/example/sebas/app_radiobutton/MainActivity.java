package com.example.sebas.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText Valor1, Valor2;
    private TextView Resultado;
    private RadioButton Rb1, Rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor1 = (EditText)findViewById(R.id.Numero1);
        Valor2 = (EditText)findViewById(R.id.Numero2);
        Resultado = (TextView)findViewById(R.id.Txt_Resultado);
        Rb1 = (RadioButton)findViewById(R.id.Txt_Sumar);
        Rb2 = (RadioButton)findViewById(R.id.Txt_Restar);
    }

    public void Resolver(View view)
    {
        String String_Valor1 = Valor1.getText().toString();
        String String_Valor2 = Valor2.getText().toString();

        int Valor1_int = Integer.parseInt(String_Valor1);
        int Valor2_int = Integer.parseInt(String_Valor2);

        if(Rb1.isChecked() == true)
        {
            int Suma = Valor1_int + Valor2_int;
            String resultado = String.valueOf(Suma);
            Resultado.setText(resultado);
        }
        else if(Rb2.isChecked() == true)
        {
            int Resta = Valor1_int - Valor2_int;
            String resultado = String.valueOf(Resta);
            Resultado.setText(resultado);
        }
    }
}
