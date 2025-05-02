package entities;

public class Rectangle implements Shape {

	private Double height;
	private double width;

	public Rectangle(Double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return width * height;
	}

}
