package com.estartegia;

import com.calculadores.CalculaIRFaixa1;
import com.calculadores.CalculaIRFaixa2;
import com.calculadores.CalculaIRFaixa3;
import com.calculadores.CalculaIRFaixa4;
import com.calculadores.CalculaIRFaixa5;
import com.calculadores.CalculadorImpostoStrategy;

public class Pessoa {
	CalculadorImpostoStrategy calculadorImposto;
	double renda;
	
	public Pessoa(){

	}
	
	public double calculaImpostoRenda(){
		return calculadorImposto.calculaImposto(this);
	}
	
	public void setRenda(double renda){
		if(renda < 1710.78)
			calculadorImposto = new CalculaIRFaixa1();
		else if(renda < 2563.91)
			calculadorImposto = new CalculaIRFaixa2();
		else if(renda < 3418.59)
			calculadorImposto = new CalculaIRFaixa3();
		else if(renda < 4271.59)
			calculadorImposto = new CalculaIRFaixa4();
		else
			calculadorImposto = new CalculaIRFaixa5();
			
		this.renda = renda;
	}
	
	public double getRenda(){
		return renda;
	}
}
