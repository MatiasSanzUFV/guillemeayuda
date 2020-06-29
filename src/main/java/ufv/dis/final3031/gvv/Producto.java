package ufv.dis.final3031.gvv;

public class Producto {
	public String nombre;
	public String categoria;
	public float precio;
	public String ean13;
	
	public Producto(String nombre, String categoria, float precio, String ean13) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.ean13 = ean13;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getEan13() {
		return ean13;
	}
	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}
	
	
}
