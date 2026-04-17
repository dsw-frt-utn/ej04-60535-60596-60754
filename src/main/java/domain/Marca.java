package domain;

public class Marca {
    private String descripcion;

    public Marca(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return this.descripcion;
    }
}
