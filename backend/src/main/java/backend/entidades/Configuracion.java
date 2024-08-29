package backend.entidades;

import backend.Builder.Mapa;
import backend.Builder.MapaBuilder;
import backend.Builder.Nivel;

public class Configuracion {

    public Configuracion() {
    }

    public static Mapa configurarjuego() {
        Nivel nivel = new Nivel();
        MapaBuilder builder = new MapaBuilder();
        nivel.nivelFacil(builder);

        Mapa mapa = builder.getResultado();
        mapa.mostrarMapa();
        return mapa;
    }
}
