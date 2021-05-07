package nLayeredDemo.dataAccess.abstracts;

import java.util.List; // List interface icin 

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	Product get (int id); // ürün aramada tek ürün dönme
	
	List<Product> getAll(); // ürün arama ürün listesi dönme dinamik yapi olmasi icin array list
		
}
