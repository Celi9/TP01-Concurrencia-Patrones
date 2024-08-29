package backend.enidades;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Juego {
	private int[][] mapa;
	private int fila = 0;
	private int columna = 0;
	private int numeroFilas; // asignar con la fila del mapa
	private int numeroColumnas; // asignar con la columna de la columna
	private final int anchoBloque = 40;
	private final int altoBloque = 40;

	public Juego(Mapa mapa) {
		this.mapa = mapa.getMapa();
		this.numeroFilas = mapa.getFilas();
		this.numeroColumnas = mapa.getColumnas();
	}

	public void paint(Graphics grafico) {
		for (fila = 0; fila < numeroFilas; fila++) {
			for (columna = 0; columna < numeroColumnas; columna++) {

				switch (mapa[fila][columna]) {
					case 1: // 1 = Villano
						grafico.setColor(Color.red);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
						break;
					case 2: // 2 = Zona contaminada
						grafico.setColor(Color.green);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
						break;
					case 3:// 3 = Pozo
						grafico.setColor(Color.gray);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
						break;
					case 4:// 4 = Tesoro
						grafico.setColor(Color.yellow);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
						break;
					case 5: // 5 = Obstaculo, no deja pasar al personaje por esa celda, no resta
						// puntos de vida
						grafico.setColor(Color.black);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
						break;
					default:
						grafico.setColor(Color.white);
						grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);

						break;
				}

				// grafico.setColor(Color.white);
				// grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
			}

		}
	}
}
