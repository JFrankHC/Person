package com.ms_productos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table (name="PRODUCTOS")

public class Productos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Aqui no es necesario los constructores
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTOS_SEQ", allocationSize=1)
	
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoId;
	
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	private int deptoid;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	 private String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	private Date fechacad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER")
	private double preciocompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER")
	private double precioventa;
	@Column(name="REFRIGERADO", columnDefinition="CHAR")
	private String refrigerado;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Productos [productoId=" + productoId + ", deptoid=" + deptoid + ", nombre=" + nombre + ", fechacad="
				+ fechacad + ", preciocompra=" + preciocompra + ", precioventa=" + precioventa + ", refrigerado="
				+ refrigerado + "]";
	}
	
	
}