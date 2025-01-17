package backend.enidades;

public class MapaBuilder implements Builder {
	
	private int ancho;
	private int alto;
	private Celda [][] mapa;
	private NivelDificultad dificultad;
	private int canFantasmasMax;
	private int canFantasmasInicial;
	private int puntaje;
	private PacMan pacman;
	private Fantasma [] fantasmas;
	
	
	@Override
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	@Override
	public void setMapa(Celda[][] mapa) {
		this.mapa = mapa;
	}
	
	@Override
	public void setDificultad(NivelDificultad dificultad) {
		this.dificultad = dificultad;
	}
	
	@Override
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	@Override
	public void setPacman(PacMan pacman) {
		this.pacman = pacman;
	}
	
	@Override
	public void setFantasmas(Fantasma[] fantasmas) {
		this.fantasmas = fantasmas;
	}
	
	@Override
	public void setCantFantasmasMax(int cantFantasmasMax) {
		this.canFantasmasMax = canFantasmasMax;
		
	}
	@Override
	public void setCantFantasmasInicial(int cantFantasmasInicial) {
		this.canFantasmasInicial = canFantasmasInicial;
		
	}
	
	public Mapa build() {
		return new Mapa(ancho, alto, mapa,dificultad,canFantasmasMax,canFantasmasInicial,puntaje,pacman,fantasmas);
	}
	
	

}
