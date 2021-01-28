package ejercicio;

public class Higiene extends Producto {

    private String unidad;

    public Higiene(String nombre, int precio, String unidad) {
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
        return "Nombre: " + this.getNombre() + " /// Contenido: " + this.getUnidad() + "ml /// Precio: $" + this.getPrecio();
    }
}
