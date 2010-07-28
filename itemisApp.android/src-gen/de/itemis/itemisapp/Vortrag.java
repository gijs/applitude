package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class Vortrag implements Serializable {

	@Element(required = false)
	private String titel;

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Element(required = false)
	private String untertitel;

	public String getUntertitel() {
		return untertitel;
	}

	public void setUntertitel(String untertitel) {
		this.untertitel = untertitel;
	}

	@Element(required = false)
	private String sprecher;

	public String getSprecher() {
		return sprecher;
	}

	public void setSprecher(String sprecher) {
		this.sprecher = sprecher;
	}

	@Element(required = false)
	private String beschreibung;

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	@Element(required = false)
	private String zeit;

	public String getZeit() {
		return zeit;
	}

	public void setZeit(String zeit) {
		this.zeit = zeit;
	}

	@Element(required = false)
	private Vortrag fortsetzung;

	public Vortrag getFortsetzung() {
		return fortsetzung;
	}

	public void setFortsetzung(Vortrag fortsetzung) {
		this.fortsetzung = fortsetzung;
	}

}
