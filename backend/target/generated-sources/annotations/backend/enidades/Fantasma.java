package backend.enidades;

import javax.swing.JPanel;

public class Fantasma extends JPanel implements Runnable {
	
	private int cantVidas;
	private int velocidadActual;	
	private int posicionX;
	private int posicionY;

	public Fantasma(int cantVidas, int velocidadActual, int posicionX, int posicionY) {
		this.cantVidas = cantVidas;
		this.velocidadActual = velocidadActual;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	@Override
	public void run() {
		
		
	}

}
