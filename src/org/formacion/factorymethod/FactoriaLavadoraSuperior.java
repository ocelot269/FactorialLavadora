package org.formacion.factorymethod;

public class FactoriaLavadoraSuperior extends FactoriaLavadora {
	
	@Override
	public Lavadora creaLavadora() {
		return new LavadoraCargaFrontal();

	}
}
