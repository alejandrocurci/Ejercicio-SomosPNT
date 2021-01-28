package ejercicio;

public class Bebida extends Producto {

    private String unidad;

    public Bebida(String nombre, int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Litros: "+this.getUnidad()+" /// Precio: $"+this.getPrecio();
    }
    
    

}
