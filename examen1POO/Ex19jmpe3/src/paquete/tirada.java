package paquete;


public class tirada {
    private dado[] dado;
    private int numcaras;
    private int numtiradas;
    private int trucado ;
    public tirada(int n, int n2){
      dado=new dado[n];
      this.numcaras=n2;
      this.numtiradas=n;
      if (n2 >= 8) {
        this.numcaras = 8 ;
      }
      if (n2 <= 1) {
        this.numcaras = 1;
      } 
      if ((n2 / 2) != 0 ) {
        this.numcaras = n2-1 ;
      }
      
      trucado=(int)(Math.random()*(this.numcaras)+1);
      
    }


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
            string += this.dado[i]+" ";  
          }
          else{
              this.dado[i]=new dado((int)(Math.random()*(this.numcaras)+1));
              
          if(this.dado[i].obtenerValor()==this.trucado){
                do{
                  this.dado[i]=new dado((int)(Math.random()*(this.numcaras)+1));
              }
              while(this.dado[i].obtenerValor()==this.trucado);
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


    public int obtenerValorTrucado() {
      return trucado ;
    }
}
