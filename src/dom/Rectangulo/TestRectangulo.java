package dom.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo rec = new Rectangulo();
		rec.altura = 3;
		rec.base = 4;
		int resultadoArea = rec.area();
		System.out.println("El area es: " + resultadoArea);
	}

}
