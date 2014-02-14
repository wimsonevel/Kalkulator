package com.wim.kalkulator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	
	//membuat button
	Button satu, dua, tiga, empat, lima, 
		   enam, tujuh, delapan, sembilan, nol;
	
	Button add, sub, div, mull, samadengan, clear;
	//membuat textfield
	EditText display;
    
	KalkulatorEngine kalkulator = new KalkulatorEngine();
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //menginisialisasi button berdasarkan id di xml
        satu = (Button) findViewById(R.id.button1);
        dua = (Button) findViewById(R.id.button2);
        tiga = (Button) findViewById(R.id.button3);
        empat = (Button) findViewById(R.id.button4);
        lima = (Button) findViewById(R.id.button5);
        enam = (Button) findViewById(R.id.button6);
        tujuh = (Button) findViewById(R.id.button7);
        delapan = (Button) findViewById(R.id.button8);
        sembilan = (Button) findViewById(R.id.button9);
        nol = (Button) findViewById(R.id.button10);
        samadengan = (Button) findViewById(R.id.button12);
        clear = (Button) findViewById(R.id.button11);
        add = (Button) findViewById(R.id.button_tambah);
        sub = (Button) findViewById(R.id.button_kurang);
        mull = (Button) findViewById(R.id.button_kali);
        div = (Button) findViewById(R.id.button_bagi);
        
        display = (EditText) findViewById(R.id.text1);
        
        satu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(1);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        dua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(2);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        tiga.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(3);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        empat.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(4);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        lima.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(5);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        enam.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(6);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        tujuh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(7);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        delapan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(8);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        sembilan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(9);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        nol.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.digit(0);
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.add();
				display.setText("+");
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.substract();
				display.setText("-");
			}
		});
        mull.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.multiply();
				display.setText("*");
			}
		});
        div.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.divide();
				display.setText("/");
			}
		});
        samadengan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.compute();
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
        clear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				kalkulator.clear();
				String angka = String.valueOf(kalkulator.display());
				display.setText(angka);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
