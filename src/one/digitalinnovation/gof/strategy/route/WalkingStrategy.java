package one.digitalinnovation.gof.strategy.route;

public class WalkingStrategy implements RouteStrategy {

	@Override
	public void buildRoute(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Rota gerada para percurso a pé.\nPartida: " + a + "\nChegada: " + b);
	}

}
