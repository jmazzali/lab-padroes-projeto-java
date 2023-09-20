package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.CasaInteligente;

public class ClientFacade {
	public static void main(String[] args) {
		CasaInteligente casa = new CasaInteligente();
		//ligarCasa() e desligarCasa() são métodos que utilizam subsistemas (luzes.java e sons.java)
		casa.ligarCasa();
		System.out.println("\n");
		casa.desligarCasa();
	}
}
