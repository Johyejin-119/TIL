package ch08;
 
public class GenericPrinter<T extends Material> { // T에 대한 제한

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
