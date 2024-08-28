package Builder;

public  class Main {
    public static void main(String[] args){
        Nivel nivel = new Nivel();
        MapaBuilder builder = new MapaBuilder();
        nivel.nivelFacil(builder);

        Mapa mapa = builder.getResultado();
        mapa.mostrarMapa();
    }
}
