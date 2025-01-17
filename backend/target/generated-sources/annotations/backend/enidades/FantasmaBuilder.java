package backend.enidades;

public class FantasmaBuilder implements PersonajeBuilder {

	private int cantVidas;
	private int velocidadActual;
	private int posicionX;
	private int posicionY;

	@Override
	public void setCantVidas(int cantVidas) {
		this.cantVidas = cantVidas;
	}

	@Override
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	@Override
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	@Override
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public Fantasma build() {
		return new Fantasma(cantVidas, velocidadActual, posicionX, posicionY);
	}

}
