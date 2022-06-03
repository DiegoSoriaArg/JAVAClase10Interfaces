package interfacesConGeometria;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(Punto inferiorIzquierdo, Double lado) throws InvalidCuadradoException {
		super(inferiorIzquierdo);
		setLado(lado);
	}
	
	private void setLado(double lado) {
		if (lado <= 0)
			throw new InvalidCuadradoException("Lado negativo o cero");
		this.lado = lado;
	}
	
	public Double getArea() {
		return lado * lado;
	}
	
}
