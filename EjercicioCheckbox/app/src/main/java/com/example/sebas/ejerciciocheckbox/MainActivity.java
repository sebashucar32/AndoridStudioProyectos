package com.example.sebas.ejerciciocheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

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

        numero1 = (EditText) findViewById(R.id.id_numero1);
        numero2 = (EditText) findViewById(R.id.ID_numero2);

        check1 = (CheckBox) findViewById(R.id.ID_check1);
        check2 = (CheckBox) findViewById(R.id.ID_check2);

        resultado = (TextView) findViewById(R.id.ID_resultado);
    }


}


