package com.wim.kalkulator;

public class KalkulatorEngine {

	double value, keep;
	char toDo;
	
	//method operasi
	public void operation(char op){
        keep = value;
        value = 0;
        toDo = op;
    }
	
	//method penjumlahan
    public void add(){
        operation('+');
    }

    //method pengurangan
    public void substract(){
        operation('-');
    }

    //method perkalian
    public void multiply(){
        operation('*');
    }

    //method pembagian
    public void divide(){
        operation('/');
    }

    //method perhitungan
    public void compute(){
        if(toDo == '+')
            value = keep + value;
        else if(toDo == '-')
            value = keep - value;
        else if(toDo == '*')
            value = keep * value;
        else if(toDo == '/')
            value = keep / value;
        keep = 0;
    }

    //mereset nilai
    public void clear(){
        value = 0;
        keep = 0;
    }

    //menentukan digit
    public void digit(int x){
        value = value*10 + x;
    }

    //method menampilkan
    public double display(){
        return (value);
    }
}
