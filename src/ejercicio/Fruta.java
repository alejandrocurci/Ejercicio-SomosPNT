package ejercicio;

public class Fruta extends Producto {

    private String unidad;

    public Fruta(String nombre, int precio, String unidad) {
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
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.getUnidad();
    }
}
