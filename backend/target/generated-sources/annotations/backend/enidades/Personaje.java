package backend.enidades;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import java.awt.event.KeyEvent;

public class Personaje {
    private int[][] plano;
    private Random random = new Random();
    private int x = 0;
    private int y = 0;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;

    public Personaje(Mapa mapa) {
        plano = mapa.getMapa();
        x = 40;
        y = 40;
        /*
         * do { // Quise agregar esto para que no quedara el persoaje arriba de una
         * celda pero
         * // no funciona por que los random no siguen el x e y de las celdas 40x40 creo
         * :)
         * x = random.nextInt(mapa.getFilas());
         * y = random.nextInt(mapa.getColumnas());
         * } while (plano[x][y] != 0);
         */
    }

    public void paint(Graphics grafico) {
        grafico.setColor(Color.pink);
        grafico.fillOval(x, y, ancho, alto);
    }

    public void teclaPrecionada(KeyEvent evento) {

        switch (evento.getKeyCode()) {
            case 37: // izquierda
                // verificarCelda(plano[x/40-1][y/40],x-movimiento); //implementar
                // verificarCelda

                x = x - movimiento;
                break;
            case 39: // derecha
                // verificarCelda(plano[x/40+1][y/40], x - movimiento); // implementar
                // verificarCelda

                x = x + movimiento;
                break;
            case 40: // abajo
                // verificarCelda(plano[x/40][y/40-1], x - movimiento); // implementar
                // verificarCelda

                y = y + movimiento;
                break;
            case 38: // arriba
                // verificarCelda(plano[x/40][y/40+1], x - movimiento); // implementar
                // verificarCelda

                y = y - movimiento;
                break;

            default:
                break;
        }
    }
}
