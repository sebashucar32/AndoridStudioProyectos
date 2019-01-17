package com.example.sebas.projectfutbol;

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

        Toast.makeText(this, "Bienvenidos a la mejor apps de estadisticas de futbol", Toast.LENGTH_LONG).show();
    }
}
