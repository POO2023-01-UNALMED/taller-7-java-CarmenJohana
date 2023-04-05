public class Alfabeto extends Pictograma{

	private static String[]letras;
	private String interpretacion;

	public Alfabeto(String origen,String[]letras, String interpretacion) {
		super(origen);
		Alfabeto.letras=letras;
		this.interpretacion=interpretacion;
	}

	public String interpretacion() {
		return interpretacion;
	}

	public String toString() {
		String cadena="";
		int i=0;
		do {
			cadena+=(letras[i]+", ");
			i++;
		}while(i!=(letras.length-1));


		return cadena+letras[i];

	}



	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[]letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return letras.length;
	}


}
