package br.com.calc;

import java.io.PrintStream;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings.System;
import android.widget.*;
import android.view.*;


public class CalculadoraActivity extends Activity {
    /** Called when the activity is first created. */
    
	EditText etNro1, etNro2, etResultado; 
	double nro1, nro2, resultado;
	Button btnSomar, btnDividir, btnMultiplicar, btnSubtrair;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        etNro1         = (EditText) findViewById(R.calculo.numero1);
        etNro2         = (EditText) findViewById(R.calculo.numero2);
        etResultado    = (EditText) findViewById(R.calculo.resultado);
        btnSomar       = (Button) findViewById(R.botao.btnSomar);
        btnDividir     = (Button) findViewById(R.botao.btnDividir);
        btnMultiplicar = (Button) findViewById(R.botao.btnMultiplicar);
        btnSubtrair    = (Button) findViewById(R.botao.btnSubtrair);
	
        btnSomar.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nro1      = Double.parseDouble(etNro1.getText().toString());
				nro2      = Double.parseDouble(etNro2.getText().toString());
				resultado = nro1 + nro2;
				etResultado.setText(String.valueOf(resultado));
			}
		});
        
        btnDividir.setOnClickListener(new View.OnClickListener() {
    		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nro1      = Double.parseDouble(etNro1.getText().toString());
				nro2      = Double.parseDouble(etNro2.getText().toString());
				resultado = nro1 / nro2;
				etResultado.setText(String.valueOf(resultado));
			}
		});
        
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
    		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nro1      = Double.parseDouble(etNro1.getText().toString());
				nro2      = Double.parseDouble(etNro2.getText().toString());
				resultado = nro1 * nro2;
				etResultado.setText(String.valueOf(resultado));
			}
		});
        
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
    		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nro1      = Double.parseDouble(etNro1.getText().toString());
				nro2      = Double.parseDouble(etNro2.getText().toString());
				resultado = nro1 - nro2;
				etResultado.setText(String.valueOf(resultado));
			}
		});
        
        
	}
}