package com.mycompany.app;

import com.mycompany.app.Interfaz.IMusica;

/**
 * Musica a contrar.
 */
public class MusicaFancy implements IMusica {
    /**
     * Musica a elegir.
     */
    private String musica;

    /**
     * Constructor.
     */
    public MusicaFancy() {
        musica = "Los angeles azules";
    }
    /**
     * Getter.
     *
     * @return nombre musica.
     */
    @Override
    public String getTipoDeMusica() {
        return "La musica que se eligio fue: " + musica;
    }

    /**
     * Setter comida.
     *
     * @param tipoDeMusica String
     */
    @Override
    public void setTipoDeMusica(final String tipoDeMusica) {
        musica = tipoDeMusica;
    }
}
