package one.digitalinnovation.gof.strategy.route;

//Class Context
public class Navigator {
	
	//Campo para armazenar referência à uma estratégia
	private RouteStrategy strategy;
	

	public void setRota(RouteStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void rota(int a, int b) {
		strategy.buildRoute(a, b);
	}
}
