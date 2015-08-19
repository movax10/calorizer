package io.github.movax10.calorizer.dao.impl;

import io.github.movax10.calorizer.dao.ProductDao;
import io.github.movax10.calorizer.entities.Product;


public class ProductDaoImpl extends AbstractEntityDao<Product> implements ProductDao {

	@Override
	protected Class<Product> getEntityClass() {
		return Product.class;
	}

}
