package com.mycompany.app;
import com.mycompany.app.Bebidas;


public class facade {

	Bebidas bebida;
	Comida comida;
	Decoracion decoracion;
	Fotografo fotografo;
	Mesas mesa;
	Musica musica;
	PistaBaile pista;
	Seguridad seguridad;
	
	public facade(final Bebidas be,
			final Comida com, 
			final Decoracion dec,
			final Fotografo fot,
			final Mesas me,
			final Musica mus,
			final PistaBaile pis,
			final Seguridad segu
			) {
		this.bebida=be;
		this.comida=com;
		this.decoracion=dec;
		this.fotografo=fot;
		this.mesa=me;
		this.musica=mus;
		this.pista=pis;
		this.seguridad=segu;
	}
	

	public void StartGraduation(){
		System.out.println("Empezó la fiesta ");
		bebida.servirBebidas();
		comida.servirComida();
		decoracion.decorar();
		fotografo.fotografoActivo();
		mesa.acomodarMesas();
		musica.MusicOn();
		pista.danceOn();
		seguridad.seguridadActiva();
		
	}
	
	public void FinishGraduation() {
		System.out.println("\n\nTerminó la fiesta ");
		fotografo.fotografoInactivo();
		musica.MusicOff();
		pista.danceOff();
		seguridad.seguridadInactiva();
	}
}
