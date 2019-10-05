package com.emusicstore.dao;

import com.emusicstore.model.Product;
import java.util.List;

public interface ProductDao {

	Product getProductById(int id);

	List<Product> getProductList();

	void addProduct(Product product);

	void editProduct(Product product);

	void deleteProduct(Product product);
}
