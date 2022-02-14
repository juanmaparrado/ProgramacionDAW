package paquetes;

public class dado {
    private int valor;
    
    public  dado(int n){
      valor=n;
    }
    public int obtenerValor(){
      return valor;
    }
    public String toString(){
      return "["+this.valor+"] ";
    }
}
