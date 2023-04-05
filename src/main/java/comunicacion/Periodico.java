package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.fecha=fecha;
		this.primicia=primicia;
		this.interpretacion=interpretacion;
	}

	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas()*palabrasPagina*10;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPrimicia() {
		return primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String interpretacion() {

		return interpretacion;

	}

	public String toString() {
		String cadena=String.format("%s\n%s\n%s\n%s\n%s\n%s", this.getOrigen(), this.getTitulo(), this.getAutor(), this.getPaginas(),fecha,primicia);
		return cadena;
	}
}
