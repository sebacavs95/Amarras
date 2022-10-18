package ar.unlam.edu.pb2.fondeadero;

public class Vela extends Yate {
	
	private Double alturaMastil;
	private Double superficieVelicMayor;
	private Double superficieTotal; //superficie velica mayor y foque
	
	public Vela(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Double superficieVelicMayor, Double superficieTotal) {
		super(nombre, dueño, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicMayor = superficieVelicMayor;
		this.superficieTotal = superficieTotal;
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Double getSuperficieVelicMayor() {
		return superficieVelicMayor;
	}

	public void setSuperficieVelicMayor(Double superficieVelicMayor) {
		this.superficieVelicMayor = superficieVelicMayor;
	}

	public Double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}
}
