package com.aem.training.impl.wcm.useclasses;

import javax.jcr.Node;

import com.adobe.cq.sightly.WCMUsePojo;

public class IdentiteTextComponent extends WCMUsePojo {

	private String identite;
	private String nom;
	private String preNom;

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPreNom() {
		return preNom;
	}

	public void setPreNom(String preNom) {
		this.preNom = preNom;
	}

	@Override
	public void activate() throws Exception {

		Node currentNode = getResource().adaptTo(Node.class);

		if (currentNode.hasProperty("identite")) {
			setIdentite(currentNode.getProperty("identite").getString());
		}
		if (currentNode.hasProperty("nom")) {
			setNom(currentNode.getProperty("nom").getString());
		}
		if (currentNode.hasProperty("preNom")) {
			setPreNom(currentNode.getProperty("preNom").getString());
		}

	}

}
