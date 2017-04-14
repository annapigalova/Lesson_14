package by.epam.library.dao;

import by.epam.library.bean.Product;

public interface ProductDao {
	void addProduct(Product product);
	void deleteProduct (int productId);
	void delete (Product product);
	

}
