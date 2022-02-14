package paquetes;

public class tirada {
  private dado[] dado;
  private int numcaras;
  private int numtiradas;
  private int trucado;
  public tirada(int n, int n2, int trucado){
    dado=new dado[n];
    this.numcaras=n2;
    this.numtiradas=n;
    if(trucado<1||trucado>n){
    // Si el numero trucado no está en el rango, se eligirá uno al azar
      this.trucado=(int)(Math.random()*(this.numcaras)+1);
    }
    else{
      this.trucado=trucado;  
    }
   
  }
  @Override
  public String toString() {
    String string="";
    int repeticiones;
    do{
      repeticiones=0;
      for(int i=0;i<this.numtiradas;i++){
        int opcion;
        opcion=(int)(Math.random()*2);
        if(opcion==0){
        this.dado[i]=new dado(this.trucado);
        string=string+this.dado[i]+" ";  
        }
        else{
        this.dado[i]=new dado((int)(Math.random()*(this.numcaras)+1));
        // Aqui controlo que el otro numero que salga del 50% que no es trucado no salga con el valor del trucado ya que si no no sería 50% y 50% de posibilidades
          if(this.dado[i].obtenerValor()==this.trucado){
            do{
              this.dado[i]=new dado((int)(Math.random()*(this.numcaras)+1));
            }while(this.dado[i].obtenerValor()==this.trucado);
          }
           string=string+this.dado[i]+" ";  
        }
      }
      string=string+"\n";
      for(int i=0;i<this.numtiradas-1;i++){
        if(this.dado[i].obtenerValor()==this.dado[i+1].obtenerValor()){
          repeticiones++;
        }
      }
    }while(repeticiones!=this.numtiradas-1);
    return string;
  }
}
