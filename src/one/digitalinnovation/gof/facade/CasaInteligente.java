package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsytem.Luzes;
import one.digitalinnovation.gof.facade.subsytem.Sons;

public class CasaInteligente {
	private Luzes luzes;
	private Sons som;

	public CasaInteligente() {
		this.luzes = new Luzes();
		this.som = new Sons();
	}

	public void ligarCasa() {
		luzes.ligar();
		som.ligar();
	}

	public void desligarCasa() {
		luzes.desligar();
		som.desligar();
	}
}
