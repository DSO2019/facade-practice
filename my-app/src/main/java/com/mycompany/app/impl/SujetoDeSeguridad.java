package com.mycompany.app.impl;

import com.mycompany.app.Seguridad;

public class SujetoDeSeguridad implements Seguridad {

	@Override
	public void seguridadActiva() {
		System.out.println("Sujeto cuidando la seguridad");
	}

	@Override
	public void seguridadInactiva() {
		System.out.println("Sujeto de seguridad se va");
	}

}
