package com.ms_productos.request;

import java.sql.Date;

import javax.persistence.Column;

public class ProductoRequest {

	
	
	private int productoId;
	private int deptoid;
	private String nombre;
	private Date fechacad;
	private double preciocompra;
	private double precioventa;
	private String refrigerado;
	
	public ProductoRequest() {
		
	}
	
	public ProductoRequest(int productoId, int deptoid, String nombre, Date fechacad, double preciocompra,
			double precioventa, String refrigerado) {
		
		this.productoId = productoId;
		this.deptoid = deptoid;
		this.nombre = nombre;
		this.fechacad = fechacad;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.refrigerado = refrigerado;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public int getDeptoid() {
		return deptoid;
	}
	public void setDeptoid(int deptoid) {
		this.deptoid = deptoid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechacad() {
		return fechacad;
	}
	public void setFechacad(Date fechacad) {
		this.fechacad = fechacad;
	}
	public double getPreciocompra() {
		return preciocompra;
	}
	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}
	public double getPrecioventa() {
		return precioventa;
	}
	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}
	public String getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	@Override
	public String toString() {
		return "ProductoRequest [productoId=" + productoId + ", deptoid=" + deptoid + ", nombre=" + nombre
				+ ", fechacad=" + fechacad + ", preciocompra=" + preciocompra + ", precioventa=" + precioventa
				+ ", refrigerado=" + refrigerado + "]";
	}
	

	
	
	

}
