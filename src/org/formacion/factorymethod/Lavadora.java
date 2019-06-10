package org.formacion.factorymethod;

public class Lavadora {

	protected boolean tieneTambor;
	protected boolean tieneMandos;
	protected String tipoCarga;

	public Lavadora() {

	}

	public void ponerTambor() {
		tieneTambor = true;
	}

	public void ponerMandos() {
		tieneMandos = true;
	}

}
