package Builder;

public class Nivel {
    public void nivelFacil(Builder builder){
        builder.setTesoro(1);
        builder.setObstaculos(5);
    }

    public void nivelMedio(Builder builder){
        builder.setTesoro(1);
        builder.setObstaculos(5);
        builder.setVillano();
        builder.setPozos(2);
    }

    public void nivelDificil(Builder builder){
        builder.setTesoro(1);
        builder.setObstaculos(5);
        builder.setVillano();
        builder.setPozos(2);
        builder.setZonaContaminada(5);
    }
}
