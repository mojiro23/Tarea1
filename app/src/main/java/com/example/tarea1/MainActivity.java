package com.example.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    Double numero1 = 0.0,numero2= 0.0,resultado= 0.0;
    String operador = "";

    public void onClickIgual(View mEditText) {
        EditText et = (EditText) findViewById(R.id.edittext);
        if (et.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Debe efectuar al menos un cálculo", Toast.LENGTH_SHORT).show();
        }
        else {

            numero2 = Double.parseDouble(et.getText().toString());


            if (operador.equals("+")) {
                resultado = numero1 + numero2;
            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("×")) {
                resultado = numero1 * numero2;
            } else if (operador.equals("÷")) {
                resultado = numero1 / numero2;
            } else if (operador.equals("")) {
                resultado = 0.0;
                Toast.makeText(getApplicationContext(), "Debe efectuar al menos un cálculo", Toast.LENGTH_SHORT).show();
            }

            Intent intent = new Intent();
            intent.setClass(getApplicationContext(),Main2Activity.class);
            intent.putExtra("result",resultado.toString());
            startActivity(intent);

        }

    }

    public void onClickSuma(View mEditText)
    {
        operador="+";
        onClickOperacionCapturaNumero1(mEditText);
    }
    public void onClickResta(View mEditText)
    {
        operador="-";
        onClickOperacionCapturaNumero1(mEditText);
    }
    public void onClickMultiplicacion(View mEditText)
    {
        operador="×";
        onClickOperacionCapturaNumero1(mEditText);
    }
    public void onClickDivision(View mEditText)
    {
        operador="÷";
        onClickOperacionCapturaNumero1(mEditText);
    }

    public void onClickOperacionCapturaNumero1(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        numero1 = Double.parseDouble(et.getText().toString());
        et.setText("");
    }

    public void onClickLimpia(View mEditText)
    {
        numero1=0.0;
        numero2=0.0;
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText("");
    }

    public void onClickBtn1(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "1");
    }
    public void onClickBtn2(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "2");
    }
    public void onClickBtn3(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "3");
    }
    public void onClickBtn4(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "4");
    }
    public void onClickBtn5(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "5");
    }
    public void onClickBtn6(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "6");
    }
    public void onClickBtn7(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "7");
    }
    public void onClickBtn8(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "8");
    }
    public void onClickBtn9(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "9");
    }
    public void onClickBtn0(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + "0");
    }
    public void onClickBtnPunto(View mEditText)
    {
        EditText et = (EditText) findViewById(R.id.edittext) ;
        et.setText(et.getText() + ".");


    }
    }
