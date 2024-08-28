package backend.enidades;

public class Main {
    public static void main(String[] args) {
        Nivel nivel = new Nivel();
        MapaBuilder builder = new MapaBuilder();
        builder.setTamaño(20, 20);
        nivel.nivelFacil(builder);

        Mapa mapa = builder.getResultado();
        mapa.mostrarMapa();
    }
}
