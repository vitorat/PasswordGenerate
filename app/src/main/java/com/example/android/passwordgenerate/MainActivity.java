package com.example.android.passwordgenerate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private PasswordGenerator generator = new PasswordGenerator();
    private TextView tamanho;
    private TextView minuscula;
    private TextView maiuscula;
    private TextView numero;
    private TextView simbolo;
    private TextView senhagerada;
    private TextView gerada;
    private EditText digitartamanho;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private Button buttongerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText digitartamanho = (EditText) findViewById(R.id.digitartamanho);
        final TextView tamanho = (TextView) findViewById(R.id.tamanho);
        final TextView minuscula = (TextView) findViewById(R.id.minuscula);
        final TextView maiuscula = (TextView) findViewById(R.id.maiuscula);
        final TextView numero = (TextView) findViewById(R.id.numero);
        final TextView simbolo = (TextView) findViewById(R.id.simbolo);
        final TextView senhagerada = (TextView) findViewById(R.id.senhagerada);
        final TextView gerada = (TextView) findViewById(R.id.gerada);
        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        final CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        final CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        final CheckBox checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        final Button buttongerar = (Button) findViewById(R.id.buttongerar);


            gerada.setText("");

            buttongerar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (checkbox1.isChecked()) {
                        generator.setIncludeLowerCase(true);
                    }
                    else{
                        generator.setIncludeLowerCase(false);
                    }

                    if (checkbox2.isChecked()) {
                        generator.setIncludeUpperCase(true);
                    }
                    else{
                        generator.setIncludeUpperCase(false);
                    }

                    if (checkbox3.isChecked()) {
                        generator.setIncludeNumbers(true);
                    }
                    else{
                        generator.setIncludeNumbers(false);
                    }

                    if (checkbox4.isChecked()) {
                        generator.setIncludeSymbols(true);
                    }
                    else{
                        generator.setIncludeSymbols(false);
                    }



                    generator.setSize(Integer.parseInt(digitartamanho.getText().toString()));

                    gerada.setText(generator.generate());
                }
            });
        }
    }
