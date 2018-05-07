package com.aem.training.components.use;

import javax.jcr.Node;

import com.adobe.cq.sightly.WCMUsePojo;
import com.aem.training.model.IdenditeModel;
import com.aem.training.model.IdentiteModelHttp;

public class IdentiteTextComponent extends WCMUsePojo {
	

	private String messageDisply;

	public String getMessageDisply() {
		return messageDisply;
	}


	private String messageDisplyHttp;

	public String getMessageDisplyHttp() {
		return messageDisplyHttp;
	}


	public void activate() throws Exception {
		this.messageDisply = getResource().adaptTo(IdenditeModel.class).getMessageDisplay();
		this.messageDisplyHttp = getRequest().adaptTo(IdentiteModelHttp.class).getMessageDisplay();
	}

}
