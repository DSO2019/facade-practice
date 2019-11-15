package com.mycompany.app.impl;

import com.mycompany.app.Fotografo;

public class SujetoConCamara implements Fotografo {

	@Override
	public void fotografoActivo() {
	System.out.println("Sujeto tomando fotos");
	}

	@Override
	public void fotografoInactivo() {
	System.out.println("Sujeto terminó de tomar fotos");
		
	}

}
