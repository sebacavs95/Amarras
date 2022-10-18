package ar.unlam.edu.pb2.fondeadero;

public class Motor extends Yate {
	
	private Integer desplazamiento;
	private String propulsion;
	private Integer potencia;
	private Integer velocidad;
	private Integer autonomia;
	
	public Motor(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Integer desplazamiento, String propulsion, Integer potencia, Integer velocidad,
			Integer autonomia) {
		super(nombre, dueño, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	public Integer getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Integer desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}
	
}

