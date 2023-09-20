package one.digitalinnovation.gof.strategy.route;

public class RoadStrategy implements RouteStrategy {

	@Override
	public void buildRoute(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Rota gerada para locomoção por estrada.\nPartida: " + a + "\nChegada: " + b);
	}

}
