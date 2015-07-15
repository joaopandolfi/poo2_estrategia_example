package com.calculadores;

import com.estartegia.Pessoa;

public class CalculaIRFaixa4 implements CalculadorImpostoStrategy{

	public double calculaImposto(Pessoa pessoa) {
		return pessoa.getRenda() * 0.225;
	}
}
