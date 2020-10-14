package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt_numero1 =null;
    private EditText edt_numero2 = null;
    private TextView txt_resultado =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 =findViewById(R.id.edt_numero1);
        edt_numero2 =findViewById(R.id.edt_numero2);
        txt_resultado=findViewById(R.id.txt_resultado);
    }
    public void sumar(View view){
        String texto_numero1= edt_numero1.getText().toString();
        String texto_numero2= edt_numero2.getText().toString();
        //-------------------------------------------------------
        double doble_numero1 = Double.valueOf(texto_numero1);
        double doble_numero2 = Double.valueOf(texto_numero2);
        double operacion_suma = doble_numero1 + doble_numero2;
        //--------------------------------------------------------
        operacion_suma=Math.round(operacion_suma*1000.0)/1000.0;
        //----------------------------------------------------
        String texto_operacion_suma=String.valueOf(operacion_suma);
        //----------------------------------------------------
        txt_resultado.setText(texto_operacion_suma);
    }
    public void multiplicar(View view){
        String texto_numero1= edt_numero1.getText().toString();
        String texto_numero2= edt_numero2.getText().toString();
        //-------------------------------------------------------
        double doble_numero1 = Double.valueOf(texto_numero1);
        double doble_numero2 = Double.valueOf(texto_numero2);
        double operacion_multiplicar = doble_numero1 * doble_numero2;
        //--------------------------------------------------------
        operacion_multiplicar=Math.round(operacion_multiplicar*1000.0)/1000.0;
        //----------------------------------------------------
        String texto_operacion_multiplicar=String.valueOf(operacion_multiplicar);
        //----------------------------------------------------
        txt_resultado.setText(texto_operacion_multiplicar);
    }
    public void dividir(View view){
        String texto_numero1= edt_numero1.getText().toString();
        String texto_numero2= edt_numero2.getText().toString();
        //-------------------------------------------------------
        double doble_numero1 = Double.valueOf(texto_numero1);
        double doble_numero2 = Double.valueOf(texto_numero2);
        double operacion_dividir = 0.0;
        if(doble_numero2!=0){
            operacion_dividir=doble_numero1/doble_numero2;
        }else{
            edt_numero2.setError("no puedes poner 0");
        }
        //--------------------------------------------------------
        operacion_dividir=Math.round(operacion_dividir*1000.0)/1000.0;
        //----------------------------------------------------
        String texto_operacion_dividir=String.valueOf(operacion_dividir);
        //----------------------------------------------------
        txt_resultado.setText(texto_operacion_dividir);
    }

    public void restar(View view) {
        String texto_numero1= edt_numero1.getText().toString();
        String texto_numero2= edt_numero2.getText().toString();
        //-------------------------------------------------------
        double doble_numero1 = Double.valueOf(texto_numero1);
        double doble_numero2 = Double.valueOf(texto_numero2);
        double operacion_restar = doble_numero1 - doble_numero2;
        //--------------------------------------------------------
        operacion_restar=Math.round(operacion_restar*1000.0)/1000.0;
        //----------------------------------------------------
        String texto_operacion_resta=String.valueOf(operacion_restar);
        //----------------------------------------------------
        txt_resultado.setText(texto_operacion_resta);
    }
}