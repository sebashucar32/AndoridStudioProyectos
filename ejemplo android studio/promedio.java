package com.example.sebas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int Matematicas = 2;
        int Fisica = 2;
        int Quimica = 2;
        int Promedio = 0;

        Promedio = (Matematicas + Fisica + Quimica)/3;

        if(Promedio >= 3)
        {
            Toast.makeText(this, "Promedio aprobado", Toast.LENGTH_SHORT).show();
        }
        else if(Promedio < 3)
        {
            Toast.makeText(this, "Promedio Desaprobado", Toast.LENGTH_LONG).show();
        }
    }
}