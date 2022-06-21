package repaso ;



public class coche {
    private String matricula;
    private String marca; 
    private String modelo;
    private int numKm;

    public coche(String matricula, String marca,String modelo,int numKm) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numKm = numKm;

    }


    public int getnumKm() {
        return numKm;
    }

    public String getMatricula() {

        return matricula;
    }

    public String getMarca() {
        
        return matricula;
    }

    public void setKm(int km){
        this.numKm = km;

    }
    public void setMarca(String m){
        this.marca = m;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setMatricula(String m){
        this.matricula = m;
    }


    public String toString() {
        String result = "";
        result += "\n Matricula : "+ matricula; 
        result += "\n Marca : "+ marca;
        result += "\n Modelo : "+ modelo;
        result += "\n Km : "+ numKm;
        return result;
    }
}
