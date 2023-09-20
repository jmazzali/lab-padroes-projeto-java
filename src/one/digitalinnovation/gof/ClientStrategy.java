package one.digitalinnovation.gof;

import one.digitalinnovation.gof.strategy.route.Navigator;
import one.digitalinnovation.gof.strategy.route.PublicTransportStrategy;
import one.digitalinnovation.gof.strategy.route.RoadStrategy;
import one.digitalinnovation.gof.strategy.route.RouteStrategy;
import one.digitalinnovation.gof.strategy.route.WalkingStrategy;

public class ClientStrategy {
	public static void main(String[] args) {
		RouteStrategy road = new RoadStrategy();
		RouteStrategy walking = new WalkingStrategy();
		RouteStrategy publicTransport = new PublicTransportStrategy();
		
		Navigator nav = new Navigator();
		
		nav.setRota(publicTransport);
		nav.rota(40, 1200);
		nav.rota(80, 1600);
		System.out.println("\n");
		nav.setRota(walking);
		nav.rota(8, 160);
		System.out.println("\n");
		nav.setRota(road);
		nav.rota(420, 7200);
	}
}
