package backend.enidades;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

public class Mapa extends JPanel implements KeyListener {

	private final int ancho;
	private final int alto;
	private final Celda[][] mapa;
	private final NivelDificultad dificultad;
	private final int canFantasmasMax;
	private final PacMan pacman;
	private final Fantasma[] fantasmas;
	private int canFantasmasInicial;
	private int puntaje;
	private Timer timer;

	public Mapa(int ancho, int alto, Celda[][] mapa, NivelDificultad dificultad, int canFantasmasMax,
			int canFantasmasInicial, int puntaje, PacMan pacman, Fantasma[] fantasmas) {

		this.ancho = ancho;
		this.alto = alto;
		this.mapa = mapa;
		this.dificultad = dificultad;
		this.canFantasmasMax = canFantasmasMax;
		this.canFantasmasInicial = canFantasmasInicial;
		this.puntaje = puntaje;
		this.pacman = pacman;
		this.fantasmas = fantasmas;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

	public Celda[][] getMapa() {
		return mapa;
	}

	public NivelDificultad getDificultad() {
		return dificultad;
	}

	public int getCanFantasmasMax() {
		return canFantasmasMax;
	}

	public int getCanFantasmasInicial() {
		return canFantasmasInicial;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public PacMan getPacman() {
		return pacman;
	}

	public Fantasma[] getFantasmas() {
		return fantasmas;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public class Builder {
		private int ancho;
		private int alto;
		private Celda[][] mapa;
		private NivelDificultad dificultad;
		private int canFantasmasMax;
		private int canFantasmasInicial;
		private int puntaje;
		private PacMan pacman;
		private Fantasma[] fantasmas;

		public Mapa.Builder setAncho(int ancho) {
			this.ancho = ancho;
			return this;
		}

		public Mapa.Builder setAlto(int alto) {
			this.alto = alto;
			return this;
		}

		public Mapa.Builder setMapa(Celda[][] mapa) {
			this.mapa = mapa;
			return this;
		}

		public Mapa.Builder setDificultad(NivelDificultad dificultad) {
			this.dificultad = dificultad;
			return this;
		}

		public Mapa.Builder setPuntaje(int puntaje) {
			this.puntaje = puntaje;
			return this;
		}

		public Mapa.Builder setPacman(PacMan pacman) {
			this.pacman = pacman;
			return this;
		}

		public Mapa.Builder setFantasmas(Fantasma[] fantasmas) {
			this.fantasmas = fantasmas;
			return this;
		}

		public Mapa.Builder setCantFantasmasMax(int cantFantasmasMax) {
			this.canFantasmasMax = canFantasmasMax;
			return this;

		}

		public Mapa.Builder setCantFantasmasInicial(int cantFantasmasInicial) {
			this.canFantasmasInicial = canFantasmasInicial;
			return this;
		}

		public Mapa build() {
			return new Mapa(ancho, alto, mapa, dificultad, canFantasmasMax, canFantasmasInicial, puntaje, pacman,
					fantasmas);
		}
	}

}
