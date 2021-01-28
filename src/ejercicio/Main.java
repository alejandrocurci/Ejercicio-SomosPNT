
package ejercicio;


public class Main {


    public static void main(String[] args) {
        
        Producto cocaZero = new Bebida("Coca-Cola Zero", 20, "1.5");
        Producto cocaComun = new Bebida("Coca-Cola", 18, "1.5");
        Producto shampoo = new Higiene("Shampoo Sedal", 19, "500");
        Producto frutillas = new Fruta("Frutillas", 64, "kilo");
        
        Supermercado almacen = new Supermercado();
        almacen.agregarProducto(cocaZero);
        almacen.agregarProducto(cocaComun);
        almacen.agregarProducto(shampoo);
        almacen.agregarProducto(frutillas);
        
        almacen.imprimirStock();
        almacen.compararPrecios();    
        
    }
    
}
