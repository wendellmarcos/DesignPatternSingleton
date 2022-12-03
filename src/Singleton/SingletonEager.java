package Singleton;

/**
 * Singleton "apressado"
 * @author wendellmarcos
 *
 *Singleton "preguiçoso"
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
