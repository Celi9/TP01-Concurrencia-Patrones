package Builder;

public class Mapa {
    private final char[][] mapa;
    private final int filas;
    private final int columnas;
    
    public Mapa(char[][] mapa, int filas, int columnas){
        this.filas=filas;
        this.columnas=columnas;
        this.mapa=mapa;
    }

    public void getMapa(){
        return mapa;
    }

    public void mostrarMapa(){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(mapa[i][j]+" ");
            }
            System.out.println();
        }
    }
}
