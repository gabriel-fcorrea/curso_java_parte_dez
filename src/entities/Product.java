package entities;

public class Product implements Comparable<Product> {

	private String productName;
	private Double productPrice;

	public Product(String productName, Double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String toString() {
		return productName + String.format(", R$ %.2f", productPrice);
	}

	@Override
	public int compareTo(Product otherProduct) {
		return productPrice.compareTo(otherProduct.getProductPrice());
	}

}
