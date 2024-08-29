package backend.enidades;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.awt.Graphics;

public class Main extends JPanel {
    // configuracion config = new configuracion();
    // static Mapa mapa = configuracion.configurarjuego();
    // Juego juego = new Juego(mapa);
    // Personaje personaje = new Personaje(mapa);
    static Juego juego;
    static Personaje personaje;
    static JButton bFacil, bMedio, bDificil;

    public void paint(Graphics grafico) {
        juego.paint(grafico);
        personaje.paint(grafico);
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
        MapaBuilder builder = new MapaBuilder();
        JFrame ventana = new JFrame("Juego");
        JButton bFacil = new JButton("Fácil");
        JButton bMedio = new JButton("Medio");
        JButton bDificil = new JButton("Dificil");
        JPanel panel = new JPanel();
        Nivel nivel = new Nivel();

        bFacil.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nivel.nivelFacil(builder);
                Mapa mapa = builder.getResultado();
                mapa.mostrarMapa();
                ventana.remove(panel);
                iniciarJuego(ventana, mapa);
            }
        });

        bMedio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nivel.nivelMedio(builder);
                Mapa mapa = builder.getResultado();
                mapa.mostrarMapa();
                ventana.remove(panel);
                iniciarJuego(ventana, mapa);
            }
        });

        bDificil.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nivel.nivelDificil(builder);
                Mapa mapa = builder.getResultado();
                mapa.mostrarMapa();
                ventana.remove(panel);
                iniciarJuego(ventana, mapa);
            }
        });

        panel.add(bFacil);
        panel.add(bMedio);
        panel.add(bDificil);

        ventana.add(panel);

        ventana.setSize(200, 100);
        ventana.setLocation(300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void iniciarJuego(JFrame ventana, Mapa mapa) {
        juego = new Juego(mapa);
        personaje = new Personaje(mapa);

        final Main game = new Main();

        ventana.add(game);
        ventana.setSize(mapa.getFilas() * 43, mapa.getColumnas() * 43);
        ventana.setLocation(300, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            game.repaint();
        }, 1, 10, TimeUnit.MILLISECONDS);
    }

}
