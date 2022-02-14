package paquetes;

public class dado {
  private int valor;
  public dado(int n){
    this.valor=n;
  }
  public int obtenerValor(){
    return this.valor;
  }
  public void ponerValor(int n){
    this.valor=n;
  }
  public String toString(){
    String string="";
    string+="["+this.valor+"] ";
    return string;
  }
}
