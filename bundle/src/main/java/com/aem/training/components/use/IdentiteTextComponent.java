package com.aem.training.components.use;

import javax.jcr.Node;

import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.training.model.IdenditeModel;

public class IdentiteTextComponent extends WCMUsePojo {
	

	private String messageDisply;

	public String getMessageDisply() {
		return messageDisply;
	}

	

	public void activate() throws Exception {
		this.messageDisply = getResource().adaptTo(IdenditeModel.class).getMessageDisplay();
	}

}
