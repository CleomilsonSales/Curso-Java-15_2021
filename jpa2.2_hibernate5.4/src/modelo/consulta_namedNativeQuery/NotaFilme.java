package modelo.consulta_namedNativeQuery;

//classe apenas para receber os resultado da consulta, não é um entidade
public class NotaFilme {
	private double media;

	public NotaFilme(double media) {
		super();
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
