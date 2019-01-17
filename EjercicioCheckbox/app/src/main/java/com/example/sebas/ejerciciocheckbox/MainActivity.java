package com.example.sebas.ejerciciocheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText numero1, numero2;
    private CheckBox check1, check2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Bienvenidos a la mejor aplicacion de estadisticas de futbol", Toast.LENGTH_LONG).show();

        numero1 = (EditText) findViewById(R.id.id_numero1);
        numero2 = (EditText) findViewById(R.id.id_numero2);

        check1 = (CheckBox) findViewById(R.id.id_checkbox1);
        check2 = (CheckBox) findViewById(R.id.id_checkbox2);

        resultado = (TextView) findViewById(R.id.id_result);
    }

    public void Calcular(View view)
    {
        String valor1_String = numero1.getText().toString();
        String valor2_String = numero2.getText().toString();

        float valor1_Float = Float.parseFloat(valor1_String);
        float valor2_Float = Float.parseFloat(valor2_String);

        String Resultado = "";

        if(check1.isChecked() == true)
        {
            float suma =  valor1_Float + valor2_Float;
            Resultado = " la suma es: " + suma + " / ";
        }

        if(check2.isChecked() == true)
        {
            float resta =  valor1_Float - valor2_Float;
            Resultado = Resultado + " la resta es: " + resta;
        }
        resultado.setText(Resultado);
    }
}


