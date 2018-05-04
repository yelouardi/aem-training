package com.aem.training.model;



import java.util.Map;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Model(adaptables=Resource.class)
@Model(adaptables = { SlingHttpServletRequest.class, Resource.class })
public class IdentiteModelHttp {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IdenditeModel.class);

    @Self
    private SlingHttpServletRequest request;
    
    public String  getMessageDisplay (){
    
    Map<String, String[]> mapParam = request.getParameterMap();
    	LOGGER.debug("{} , ------------------ IDENTITE -------------------------",				mapParam.get("toto"));
		return String.format("BienVennue : %s  dans la formation AEM, avec le parametre -----: :---", mapParam.get("toto"));
	}
    	
    

}
