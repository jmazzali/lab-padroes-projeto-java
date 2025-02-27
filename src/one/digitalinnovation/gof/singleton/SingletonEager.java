package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static synchronized SingletonEager getInstancia() {
		return instancia;
	}
}
