package backend.enidades;

import javax.swing.JPanel;

public class PacMan extends JPanel implements Runnable {
	
	private int cantVidas;
	private int velocidadActual;	
	private int posicionX;
	private int posicionY;
	
	

	public PacMan(int cantVidas, int velocidadActual, int posicionX, int posicionY) {
		this.cantVidas = cantVidas;
		this.velocidadActual = velocidadActual;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}



	@Override
	public void run() {
		
	}

}
