package com.aem.training.model;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables=Resource.class)
public class IdenditeModel {
	
	
	

	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IdenditeModel.class);

    @Self
    private Resource identite;
    
    
    
    public String  getMessageDisplay (){

    	
    	ValueMap values = identite.adaptTo(ValueMap.class);
    	LOGGER.error("{} , ------------------ IDENTITE -------------------------",					values.get("identite", String.class));
    	LOGGER.error("{} , ------------------ NOM -------------------------",					values.get("nom", String.class));
    	LOGGER.error("{} , ------------------ PRENOM -------------------------",					values.get("preNom", String.class));
		return String.format("BienVennue : %s %s %s dans la formation AEM", values.get("identite", String.class), values.get("nom", String.class),
				values.get("preNom", String.class));
	}
    	
    

}
