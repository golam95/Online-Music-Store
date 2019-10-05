package com.emusicstore.service;

import java.util.List;
import com.emusicstore.model.Product;

public interface ProductService {

	Product getProductById(int id);

	List<Product> getProductList();

	void addProduct(Product product);

	void editProduct(Product product);

	void deleteProduct(Product product);
}
