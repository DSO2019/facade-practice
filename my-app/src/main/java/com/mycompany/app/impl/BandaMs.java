package com.mycompany.app.impl;

import com.mycompany.app.Musica;

public class BandaMs implements Musica{

	@Override
	public void MusicOn() {
		System.out.println("Banda MS tocando");
	}

	@Override
	public void MusicOff() {
		System.out.println("Banda MS terminó");
	}

}
