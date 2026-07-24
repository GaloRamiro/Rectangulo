package dom.Rectangulo;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cuadrado c1 = new Cuadrado();
	        c1.lado = 3.0;

	        Cuadrado c2 = new Cuadrado();
	        c2.lado = 5.0;

	        Cuadrado c3 = new Cuadrado();
	        c3.lado = 8.0;

	        System.out.println("Cuadrado 1");
	        System.out.println("Área: " + c1.calcularArea());
	        System.out.println("Perímetro: " + c1.calcularPerimetro());

	        System.out.println();

	        System.out.println("Cuadrado 2");
	        System.out.println("Área: " + c2.calcularArea());
	        System.out.println("Perímetro: " + c2.calcularPerimetro());

	        System.out.println();

	        System.out.println("Cuadrado 3");
	        System.out.println("Área: " + c3.calcularArea());
	        System.out.println("Perímetro: " + c3.calcularPerimetro());


	}

}
