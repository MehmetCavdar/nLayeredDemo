package nLayeredDemo.dataAccess.abstracts;

import java.util.List; // List interface icin 

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	Product get (int id); // �r�n aramada tek �r�n d�nme
	
	List<Product> getAll(); // �r�n arama �r�n listesi d�nme dinamik yapi olmasi icin array list
		
}
