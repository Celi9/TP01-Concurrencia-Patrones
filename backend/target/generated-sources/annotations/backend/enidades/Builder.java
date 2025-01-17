package backend.enidades;

public interface Builder {
	                            
	void setAlto(int alto);               
	void setAncho(int ancho);               
	void setMapa( Celda [][] mapa);               
	void setDificultad(NivelDificultad nivel);
	void setCantFantasmasMax(int cantFantasmasMax);
	void setCantFantasmasInicial(int cantFantasmasInicial);
	void setPuntaje(int puntaje);  	
	void setPacman(PacMan pacman);
	void setFantasmas(Fantasma [] fantasmas);

}
