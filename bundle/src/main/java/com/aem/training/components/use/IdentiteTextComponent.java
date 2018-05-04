package com.aem.training.components.use;

import javax.jcr.Node;

import org.apache.sling.api.resource.ValueMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUsePojo;

public class IdentiteTextComponent extends WCMUsePojo {
	private static final Logger LOGGER = LoggerFactory.getLogger(IdentiteTextComponent.class);
	private String identite;
	private String nom;
	private String preNom;

	private String messageDisply;

	public String getMessageDisply() {
		return messageDisply;
	}

	public String getIdentite() {
		return identite;
	}

	private void setIdentite(String identite) {
		this.identite = identite;
	}

	public String getNom() {
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}

	public String getPreNom() {
		return preNom;
	}

	private void setPreNom(String preNom) {
		this.preNom = preNom;
	}

	public void activate() throws Exception {

		ValueMap values = getResource().adaptTo(ValueMap.class);

		if (values.containsKey("identite")) {
			LOGGER.debug("{} , ------------------ IDENTITE -------------------------",
					values.get("identite", String.class));

			setIdentite(getProperties().get("identite", String.class));
		}
		if (getProperties().containsKey("nom")) {
			LOGGER.debug("{} , ------------------ NAME -------------------------", values.get("nom", String.class));

			setNom(getProperties().get("nom", String.class));
		}
		if (getProperties().containsKey("preNom")) {
			LOGGER.debug("{} , ------------------ PRENOM -------------------------",
					values.get("preNom", String.class));

			setPreNom(getProperties().get("preNom", String.class));
		}

		this.messageDisply = String.format("BienVennue : %s %s %s dans la formation AEM", this.identite, this.nom,
				this.preNom);
	}

}
