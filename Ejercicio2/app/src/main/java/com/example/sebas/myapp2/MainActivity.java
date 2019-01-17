package com.example.sebas.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText Campo1;
    private EditText Campo2;
    private EditText Campo3;
    private EditText Campo4;
    private TextView Resultado_Final;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Campo1 = (EditText)findViewById(R.id.Nota1);
        Campo2 = (EditText)findViewById(R.id.Nota2);
        Campo3 = (EditText)findViewById(R.id.Nota3);
        Campo4 = (EditText)findViewById(R.id.Nota4);
        Resultado_Final = (TextView)findViewById(R.id.TxtResultado);
    }

    public void Promediar(View vista)
    {
        String Valor1 = Campo1.getText().toString();
        String Valor2 = Campo2.getText().toString();
        String Valor3 = Campo3.getText().toString();
        String Valor4 = Campo4.getText().toString();

        float numero1 = Float.parseFloat(Valor1);
        float numero2 = Float.parseFloat(Valor2);
        float numero3 = Float.parseFloat(Valor3);
        float numero4 = Float.parseFloat(Valor4);


        float Promedio = (numero1 + numero2 + numero3 + numero4) / 4;

        if(Promedio < 3)
        {
            Resultado_Final.setText("Promedio desaprobado con Nota " + Promedio);
        }
        else if(Promedio >= 3)
        {
            Resultado_Final.setText("Promedio Aprobado con Nota " + Promedio);
        }
    }
}
