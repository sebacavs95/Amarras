package ar.unlam.edu.pb2.fondeadero;

public class Yate {
	
	protected String nombre;
	protected String dueño;
	protected Double manga; //ancho
	protected Double calado;
	protected Double eslora; //largo
	protected Integer tripulacion;
	protected Double peso;
	
	public Yate(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso) {
		this.nombre = nombre;
		this.dueño = dueño;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Double getManga() {
		return manga;
	}

	public void setManga(Double manga) {
		this.manga = manga;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
