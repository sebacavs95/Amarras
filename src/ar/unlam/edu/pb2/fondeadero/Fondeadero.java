package ar.unlam.edu.pb2.fondeadero;

import java.util.LinkedList;
import java.util.List;

public class Fondeadero {
	
	private final Integer MAXIMA_CANTIDAD_DE_AMARRAS;
	private List<Yate> yates;
	private Amarra amarras;
	
	public Fondeadero() {
		this.MAXIMA_CANTIDAD_DE_AMARRAS = 70;
		this.yates = new LinkedList<>();
		this.amarras = new Amarra();
	}

	public Integer getMAXIMA_CANTIDAD_DE_AMARRAS() {
		return MAXIMA_CANTIDAD_DE_AMARRAS;
	}

	public List<Yate> getYates() {
		return yates;
	}

	public void setYates(List<Yate> yates) {
		this.yates = yates;
	}

	public Amarra getAmarras() {
		return amarras;
	}

	public void setAmarras(Amarra amarras) {
		this.amarras = amarras;
	}
	
	public void agregarUnYateAlFondeadero(Yate yate) {
		this.yates.add(yate);
	}

	public void amarrarYate(Yate yate) {
		// primero fijarme que el yate esta disponible
		// segundo fijarme que haya espacio en las amarras
		// tercero amarrar el yate y ocupar un lugar en el fondeadero
		Boolean existeElYate = false;
		
		for (Yate yateBuscado : yates) {
			if(yate == yateBuscado) {
				existeElYate = true;
			}
		}
		if(!existeElYate) {
			System.out.println("No existe el yate");
			return;
		}
		if(amarras.getYatesAmarrados().size() <= MAXIMA_CANTIDAD_DE_AMARRAS) {
			this.amarras.setLugaresTotales(amarras.getLugaresTotales()-1);
			this.amarras.getYatesAmarrados().add(yate);
		}
		
	}

	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.amarras.getYatesAmarrados().size();
	}

	public void desamarrarYate(Yate yate) {
		Boolean existeElYate = false;
		
		for (Yate yateBuscado : yates) {
			if(yate == yateBuscado) {
				existeElYate = true;
			}
		}
		if(!existeElYate) {
			System.out.println("No existe el yate");
			return;
		}
		if(amarras.getYatesAmarrados().size() <= MAXIMA_CANTIDAD_DE_AMARRAS) {
			this.amarras.setLugaresTotales(amarras.getLugaresTotales()+1);
			this.amarras.getYatesAmarrados().remove(yate);
		}
		
	}

	public Double obtenerElPrecioDeAmarre(Yate yate) {
		if(yate.getEslora() > 20.0) {
			if(yate instanceof Vela) {	
				return amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_MAYORES_A_20MTS() + amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_VELA();
			} else {
				return amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_MAYORES_A_20MTS() + amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_MOTOR();
			}
		} else if(yate instanceof Motor) {
			return amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_HASTA_20MTS() + amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_MOTOR();
		}
		return amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_HASTA_20MTS() + amarras.getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_VELA();
	}

	public Double obtenerRecaudacionTotal() {
		Double total = 0.0;
		List<Yate> yatesAmarrados = this.amarras.getYatesAmarrados();
		for (Yate yate : yatesAmarrados) {
			total+= this.obtenerElPrecioDeAmarre(yate);
		}
		return total;
	}
	
}
