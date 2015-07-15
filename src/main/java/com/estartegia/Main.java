package com.estartegia;

public class Main 
{
    public static void main( String[] args ){

    	Pessoa pessoa = new Pessoa();
    	
    	pessoa.setRenda(2000);
    	
    	System.out.println(pessoa.calculaImpostoRenda());

    }
}
