package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}



	public String getEnsenanza() {
		return ensenanza;
	}



	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*palabrasPagina;
	}

	public String interpretacion() {

		return interpretacion;

	}

	public String toString() {
		String cadena=String.format("%s\n%s\n%s\n%s\n%s", this.getOrigen(), this.getTitulo(), this.getAutor(), this.getPaginas(), ensenanza);
		return cadena;
	}



}
