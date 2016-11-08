package tn.esprit.sigma.sigmarket.services.interfaces;

import javax.ejb.Local;

import tn.esprit.sigma.sigmarket.persistence.Product;

@Local
public interface ProductServicesLocal {
	void addProduct(Product product);
	
	Product findProductById(Integer idProduct);
}