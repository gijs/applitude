package de.itemis.itemisapp;

import java.io.Serializable;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@SuppressWarnings("serial")
@Root(strict = false)
public class Sprecher implements Serializable {

	@Element(required = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Element(required = false)
	private String blog;

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	@Element(required = false)
	private String fotourl;

	public String getFotourl() {
		return fotourl;
	}

	public void setFotourl(String fotourl) {
		this.fotourl = fotourl;
	}

	@Element(required = false)
	private String vortraege;

	public String getVortraege() {
		return vortraege;
	}

	public void setVortraege(String vortraege) {
		this.vortraege = vortraege;
	}

}
