package lab_padroes_projeto.gof.singleton;

/**
 * 
 * 
 * 
 * 
 */

public class SingletonLazyHolder {
	
	private static class Holder{
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return Holder.instancia;
	}

}
