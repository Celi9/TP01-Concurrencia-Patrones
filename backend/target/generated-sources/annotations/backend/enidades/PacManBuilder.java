package backend.enidades;

public class PacManBuilder implements PersonajeBuilder {
	
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
	
	public PacMan build() {
		return new PacMan(this.cantVidas,this.velocidadActual, this.posicionX,this.posicionY);
	}
		

}
