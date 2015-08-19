package io.github.movax10.calorizer.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")
@NamedQuery(name="Product.findAll", query="SELECT a FROM Product a")
public class Product extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8821921272769286646L;
	@Id
	@SequenceGenerator(name = "PRODUCT_GENERATOR", sequenceName = "PRODUCT_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_GENERATOR")
	@Column(name = "id_product", unique = true, nullable = false)
	private Long idProduct;
	@Column(nullable = false, length = 120)
	private String name; // name product
	private double protein; // белки, г
	private double fat; // жиры, г
	private double carbohydrate; // углеводы, г
	private double kcal; // калории, ккал

	public Product() {
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	@Override
	public Serializable getId() {
		return getIdProduct();
	}
}