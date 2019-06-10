package org.formacion.factorymethod;

public class LavadoraCargaFrontal extends Lavadora {

     public LavadoraCargaFrontal() {
    	    this.tipoCarga = "frontal";
     }
     
     public String nombreCarga() {
    	 return this.tipoCarga;
     }
	
}
