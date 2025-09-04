package bodega;

public class LISTA {
private String Nombre;
private double precio;
private int stock;
public LISTA(String nombre, double precio, int stock) {
	super();
	Nombre = nombre;
	this.precio = precio;
	this.stock = stock;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}


}


