package interfacesConGeometria;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo {
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Segmento(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public Double getLargo() {
		return this.puntoA.distancia(puntoB);
	}
	
	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.puntoA.desplazar(deltaX, deltaY);
		this.puntoB.desplazar(deltaX, deltaY);
	}
	
	@Override
	public int compareTo(Segmento o) {
		return this.getLargo().compareTo(o.getLargo());
	}
	
	@Override
	public boolean esParaleloAX() {
		return this.puntoA.getY() == this.puntoB.getY();
	}
	
	@Override
	public boolean esParaleloAY() {
		return this.puntoA.getY() == this.puntoB.getY();
	}
	
	public boolean esParalelo(EsParalelo s) {
		if (s instanceof Segmento) {
			Segmento otro = (Segmento) s;
			
			double a = this.puntoA.getY() - this.puntoA.getY();
			double b = this.puntoA.getX() - this.puntoA.getX();
			double c = otro.puntoA.getY() - otro.puntoA.getY();
			double d = otro.puntoA.getX() - otro.puntoA.getX();
			return (a / b == c / d);
		}
		return false;
	}

}
