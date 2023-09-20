package one.digitalinnovation.gof.strategy.route;

public class PublicTransportStrategy implements RouteStrategy {

	@Override
	public void buildRoute(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Rota gerada para uso de transporte público.\nPartida: " + a + "\nChegada: " + b);
	}

}
