package msproducto.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import msproducto.entity.Productos;
import msproducto.repository.ProductoRepository;
import msproducto.request.ProductoRequest;
import msproducto.service.ProductoService;

@Service
public class ProductoImplement implements ProductoService{

	
	//Inyeccion de dependencias
	@Autowired
	ProductoRepository repo; //inyeccion de dependencias por atributo
    //2 - por setter
	//3 - por constructor
	
	
	
	
	
	@Override
	public Productos guardar(ProductoRequest request) {
		Productos producto= new Productos();
		
		producto.setDeptoid(request.getDeptoid());
		producto.setNombre(request.getNombre());
		producto.setFechacad(request.getFechacad());
		producto.setPreciocompra(request.getPreciocompra());
		producto.setPrecioventa(request.getPrecioventa());
		producto.setRefrigerado(request.getRefrigerado());
		
		repo.save(producto);
		return producto;
	}
//ORM
	@Override
	public Productos actualizar(ProductoRequest request) {
	Productos producto= repo.findById(request.getProductoId()).get();
		//
		producto.setDeptoid(request.getDeptoid());
		producto.setNombre(request.getNombre());
		producto.setFechacad(request.getFechacad());
		producto.setPreciocompra(request.getPreciocompra());
		producto.setPrecioventa(request.getPrecioventa());
		producto.setRefrigerado(request.getRefrigerado());
		
		repo.save(producto);
		return producto;
		
	}

	@Override
	public Productos buscar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		
		return repo.findAll();
	}
	
	

}

