package Example;

public class Triangle extends Shape{
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int area() {
		
		int a = 1/2 * (base*height);
		return a;
		
	}
	
	
	
}
