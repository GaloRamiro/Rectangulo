package dom.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo rec = new Rectangulo();
		rec.base = 4;
		rec.altura = 3;

		double resultadoArea = rec.calcularArea();
		System.out.println("El área es: " + resultadoArea);

		Rectangulo rec2 = new Rectangulo();
		rec2.base = 4;
		rec2.altura = 2;

		double resultadoArea2 = rec2.calcularArea();
		System.out.println("El área es: " + resultadoArea2);

		double perimetro = rec2.calcularPerimetro();
		System.out.println("El perímetro es: " + perimetro);

	}

}