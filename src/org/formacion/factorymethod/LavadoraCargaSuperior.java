package org.formacion.factorymethod;

public class LavadoraCargaSuperior extends Lavadora {
	

    private String tipoCarga;

	public LavadoraCargaSuperior() {
    	    this.tipoCarga = "superior";
    }
    
    public String tipoCarga() {
   	 return this.tipoCarga;
    }
}
