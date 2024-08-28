package backend.enidades;

public class configuracion {

    public configuracion() {
    }

    public static Mapa configurarjuego() {
        Nivel nivel = new Nivel();
        MapaBuilder builder = new MapaBuilder();
        nivel.nivelDificil(builder);

        Mapa mapa = builder.getResultado();
        mapa.mostrarMapa();
        return mapa;
    }
}
