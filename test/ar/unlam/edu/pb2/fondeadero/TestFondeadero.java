package ar.unlam.edu.pb2.fondeadero;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFondeadero {

	@Test
	public void queSePuedaCrearUnFondeaderoCon70Amarras() {
		Fondeadero fondeadero = new Fondeadero();
		assertNotNull(fondeadero);
	}
	
	@Test
	public void queSePuedaAmarraUnYateAUnFondeaderoCon70Amarras() {
		Fondeadero fondeadero = new Fondeadero();
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		fondeadero.agregarUnYateAlFondeadero(vela);
		fondeadero.amarrarYate(vela);
		Integer ve = fondeadero.obtenerCantidadDeYatesAmarrados();
		Integer vo = 1;
		
		assertEquals(ve,vo);
	}
	
	@Test
	public void queSePuedaDesamarrarUnYateAUnFondeaderoCon70Amarras() {
		Fondeadero fondeadero = new Fondeadero();
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		fondeadero.agregarUnYateAlFondeadero(vela);
		fondeadero.amarrarYate(vela);
		fondeadero.desamarrarYate(vela);
		Integer ve = fondeadero.getAmarras().getLugaresTotales();
		Integer vo = 70;
		
		assertEquals(ve,vo);
	}
	
	@Test
	public void queSePuedaCalcularElPrecioDeAmarrarUnYateAUnFondeaderoCon70Amarras() {
		Fondeadero fondeadero = new Fondeadero();
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		fondeadero.agregarUnYateAlFondeadero(vela);
		fondeadero.amarrarYate(vela);
		fondeadero.obtenerElPrecioDeAmarre(vela);
		Double ve = fondeadero.obtenerElPrecioDeAmarre(vela);
		Double vo = 11000.0;
		
		assertEquals(ve,vo);
	}
	
	@Test
	public void queSePuedaCalcularElPrecioTotalDeTodosLosYatesAmarradosAUnFondeaderoCon70Amarras() {
		Fondeadero fondeadero = new Fondeadero();
		Amarra amarras = new Amarra();
		Yate vela = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate motor = new Motor("AZ1", "Sebastian Tarifa", 18.87, 5.15, 119.0, 37, 5500.0, 5959, "2 motores diesel", 9000, 23, 6500);
		fondeadero.agregarUnYateAlFondeadero(vela);
		fondeadero.agregarUnYateAlFondeadero(motor);
		fondeadero.amarrarYate(vela);
		fondeadero.amarrarYate(motor);
		fondeadero.obtenerElPrecioDeAmarre(vela);
		fondeadero.obtenerElPrecioDeAmarre(motor);
		Double ve = fondeadero.obtenerRecaudacionTotal();
		Double vo = 24000.0;
		
		assertEquals(ve,vo);
	}
	
	
	
}
