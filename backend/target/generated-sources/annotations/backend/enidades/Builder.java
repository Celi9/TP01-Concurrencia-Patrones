package backend.enidades;

public interface Builder {
    void mostrarMapa();

    void setTamaño(int filas, int columnas);

    void setVillano();

    void setZonaContaminada(int cant);

    void setPozos(int cant);

    void setTesoro(int cant);

    void setObstaculos(int cant);
}
