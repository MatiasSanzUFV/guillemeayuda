package ufv.dis.final3031.gvv;

import java.util.ArrayList;

public class Inventario {
	
	private  ArrayList<Producto> productos;
	public Inventario()
    {
		productos = new ArrayList<Producto>();
    }
	public void addProducto(Producto p)
    {
        productos.add(p);
    }
	public void removeProducto(Producto p)
    {
        productos.remove(p);
    }
}
