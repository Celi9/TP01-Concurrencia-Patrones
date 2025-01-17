package backend.enidades;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JFrame implements Runnable {
	private ScheduledExecutorService executor;
	private Mapa mapa;
	private PacMan pacman;
	private Fantasma[] fantasma;
	private JPanel panelMenu;
	private JButton bFacil, bMedio, bDificil;
	private NivelDificultad nivel;

	public Juego() {
		this.setTitle("PacMan");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		executor = Executors.newSingleThreadScheduledExecutor();
		this.inicializarMenu();
		this.add(panelMenu);
	}

	private void inicializarMenu() {
		panelMenu = new JPanel();
		panelMenu.setLayout(new GridLayout(3, 1));
		panelMenu.setPreferredSize(new Dimension (100,200));
		bFacil = new JButton("Fácil");
		bMedio = new JButton("Medio");
		bDificil = new JButton("Dificil");

		bFacil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nivel = NivelDificultad.FACIL;
				iniciarJuego();
			}
		});

		bMedio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nivel = NivelDificultad.MEDIO;
				iniciarJuego();
			}
		});

		bDificil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nivel = NivelDificultad.DIFICIL;
				iniciarJuego();
			}
		});
		
		panelMenu.add(bFacil);
		panelMenu.add(bMedio);
		panelMenu.add(bDificil);
	}

	private void iniciarJuego() {
		executor.scheduleAtFixedRate(this, (long) 0, (long) 16, TimeUnit.MILLISECONDS);
	}

	private void actualizarJuego() {

	}

	@Override
	public void run() {

	}
}
