package backend.entidades;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;

import javax.swing.JLabel;

import backend.Builder.Mapa;
import backend.entidades.Juego;
import backend.entidades.Main;
import backend.entidades.Configuracion;

public class Main extends JPanel {
    static Configuracion config = new Configuracion();
    static Mapa mapa = config.configurarjuego();
    Juego juego = new Juego(mapa);
    Personaje personaje = new Personaje(mapa);

    public void paint(Graphics grafico) {
        juego.paint(grafico);
        personaje.paint(grafico);
    }

    public boolean verificarFin(){
        return personaje.fin();
    }

    public Main() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Personaje
                personaje.teclaPrecionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
            }
        });
        setFocusable(true);
    }

    public static void main(String[] args) {

        Main game = new Main();
        JFrame ventana = new JFrame("Juego");
        ventana.add(game);
        ventana.setSize(mapa.getFilas() * 43, mapa.getColumnas() * 43);
        ventana.setLocation(300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Fin:"+game.verificarFin());
            game.repaint();
        }
    }
}
