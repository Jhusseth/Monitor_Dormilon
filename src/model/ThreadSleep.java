package model;


/**
 * 
 * @author Jhusseth
 *
 */
public class ThreadSleep {
	
	/*
	 * indice para el generador de numeros aleatorios
	 */
	private static final int NAP_TIME = 5;

	/**
	 * da la aletoriedad para la espera en los hilos
	 */
	public static void nap() {
		nap(NAP_TIME);
	}

	/**
	 * Metodo para generar numeros aleatorios
	 * @param duration
	 */
	private static void nap(int duration) {
		int sleeptime = (int) (duration * Math.random() );
//		Random genRandom = new Random(duration);
	    try {
	    	Thread.sleep(sleeptime * 1000);
//	    	Thread.sleep(Math.abs(genRandom.nextInt()) % 1000); 
	    } catch (InterruptedException ie) {
	    	ie.printStackTrace();
	    }
	}

}
