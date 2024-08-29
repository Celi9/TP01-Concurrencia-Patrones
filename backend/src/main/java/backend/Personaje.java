package backend;
public class Personaje {
   private int vida;
   private int[] posicion; 

   public Personaje(){
    this.vida=10;
    this.posicion = new int[2];
    this.posicion[0] = 0;
    this.posicion[1] = 0;
   }

   public void restarVida(){
        vida--;
   }

   public void mover(char m){
        switch(m){
            case 'S':posicion[0]+=1;//Abajo
                break;
            case 'A':posicion[1]+=1;//Derecha
                break;
            case 'W':posicion[0]-=1;//Arriba
                break;
            case 'D':posicion[1]-=1;//Izquierda
                break;
        }
   }

}
