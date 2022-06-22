package repasoobjetos;

public class Libro {
    String titulo ;
    String autor;


    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public String toString() {
        return "Libro [titulo=" + titulo + ", autor "+autor + "]";
    }
}
