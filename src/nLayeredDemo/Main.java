package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager; 
import nLayeredDemo.core.JLoggerManagerAdapter;    // ADIM 22
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
	 // Todo IOC ile cözülecek
	 // Business Abstract cinsinden Business Concrete Class newledik. 
	 // Deger olarak DataAccess.Concete Class newledik. 
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter()); 
		
		Product product = new Product (1,2,"Elma",12,50); //Kategori 1 iken kritere takildi, sonra 2 yapinca ürün eklendi
		productService.add(product);

	}

}
