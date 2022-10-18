package ar.unlam.edu.pb2.fondeadero;

import java.util.LinkedList;
import java.util.List;

public class Amarra {
	
	private Integer lugaresTotales;
	private List<Yate> yatesAmarrados;
	private final Double PRECIO_MENSUAL_DE_AMARRA_POR_TIPO_MOTOR = 10000.0;
	private final Double PRECIO_MENSUAL_DE_AMARRA_POR_TIPO_VELA = 9000.0;
	private final Double PRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_HASTA_20MTS = 2000.0;
	private final Double PRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_MAYORES_A_20MTS = 3000.0;
	
	public Amarra() {
		this.lugaresTotales = 70;
		this.yatesAmarrados = new LinkedList<>();
	}

	public Integer getLugaresTotales() {
		return lugaresTotales;
	}

	public void setLugaresTotales(Integer lugaresTotales) {
		this.lugaresTotales = lugaresTotales;
	}

	public List<Yate> getYatesAmarrados() {
		return yatesAmarrados;
	}

	public void setYatesAmarrados(List<Yate> yatesAmarrados) {
		this.yatesAmarrados = yatesAmarrados;
	}

	public Double getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_MOTOR() {
		return PRECIO_MENSUAL_DE_AMARRA_POR_TIPO_MOTOR;
	}

	public Double getPRECIO_MENSUAL_DE_AMARRA_POR_TIPO_VELA() {
		return PRECIO_MENSUAL_DE_AMARRA_POR_TIPO_VELA;
	}

	public Double getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_HASTA_20MTS() {
		return PRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_HASTA_20MTS;
	}

	public Double getPRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_MAYORES_A_20MTS() {
		return PRECIO_MENSUAL_DE_AMARRA_POR_ESLORA_MAYORES_A_20MTS;
	}
}
