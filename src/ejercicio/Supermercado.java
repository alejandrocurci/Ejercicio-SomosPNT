package ejercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {

    private ArrayList<Producto> stock;

    public Supermercado() {
        stock = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        stock.add(p);
    }
    
    public void imprimirStock() {
        for(Producto p : stock) {
            System.out.println(p);
        }
        System.out.println("=============================");
    }
    
    public void compararPrecios() {
        Collections.sort(stock);
        System.out.println("Producto más caro: "+stock.get(stock.size()-1).getNombre());
        System.out.println("Producto más barato: "+stock.get(0).getNombre());
    }
}
