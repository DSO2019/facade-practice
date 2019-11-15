package com.mycompany.app.impl;

import com.mycompany.app.PistaBaile;

public class PistaBailePrincipal implements PistaBaile {

	@Override
	public void danceOn() {
		System.out.println("Pista principal libre para bailar");
	}

	@Override
	public void danceOff() {
		System.out.println("Se acabó el baile");
	}

}
