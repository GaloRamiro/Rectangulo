package dom.Rectangulo;

public class Rectangulo {

	public double base;
	public double altura;

	public double calcularArea() {
		double area = base * altura;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

}