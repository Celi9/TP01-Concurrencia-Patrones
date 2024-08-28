package Builder;

public class Nivel {
    public void nivelFacil(Builder builder){
        builder.setTamaño(5,5);
        builder.setTesoro(1);
        builder.setObstaculos(5);
    }

    public void nivelMedio(Builder builder){
        builder.setTamaño(10,10);
        builder.setTesoro(1);
        builder.setObstaculos(5);
        builder.setVillano();
        builder.setPozos(2);
    }

    public void nivelDificil(Builder builder){
        builder.setTamaño(20,20);
        builder.setTesoro(1);
        builder.setObstaculos(5);
        builder.setVillano();
        builder.setPozos(2);
        builder.setZonaContaminada(5);
    }
}
