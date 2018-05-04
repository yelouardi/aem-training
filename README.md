#AEM Training TP5

# AEM WCMUse

C'est le Controleur d'un composant 

Il s'execute côté serveur 

Contrôleur : 
--
Module qui traite les actions de l'utilisateur, modifie les données du modèle et de la vue



https://docs.adobe.com/content/docs/en/aem/6-1/ref/javadoc/com/adobe/cq/sightly/WCMUsePojo.html

Exemple d'une class WCMUsePojo
--
    public class HeroTextComponent extends WCMUsePojo {
     /** The hero text bean. */
     
      
    @Override
    public void activate() throws Exception {
          
          private String description ; 
          private String headingText ; 

        Node currentNode = getResource().adaptTo(Node.class);
         
          
        if(currentNode.hasProperty("jcr:Heading")){
            setHeadingText(currentNode.getProperty("./jcr:Heading").getString());
        }
        if(currentNode.hasProperty("jcr:description")){
            setDescription(currentNode.getProperty("./jcr:description").getString());
        }
          
    }
      
      
      
        public String getsetDescription() {
        return this.description;
        }
         public String getsetHeadingText() {
          return this.headingText;
        }
        
    }

Dependence Maven à ajouter 
-
        <dependency>
               <groupId>com.adobe.aem</groupId>
               <artifactId>uber-jar</artifactId>
               <version>6.2.0</version>
               <!-- for AEM6.1 use this version     : <version>6.1.0</version> -->
               <!-- for AEM6.1 SP1 use this version : <version>6.1.0-SP1-B0001</version> -->
               <!-- for AEM6.1 SP2 use this version : <version>6.1.0-SP2</version> -->
               <!-- for AEM6.2 use this version     : <version>6.2.0</version> -->
               <classifier>obfuscated-apis</classifier>
               <scope>provided</scope>
           </dependency>
            
           <dependency>
               <groupId>org.apache.geronimo.specs</groupId>
               <artifactId>geronimo-atinject_1.0_spec</artifactId>
               <version>1.0</version>
               <scope>provided</scope>
           </dependency>


HTL
==

    <div data-sly-use.heroTextObject="com.foo.service.core.HeroTextComponent" data-sly-test="${heroTextObject}">
       <h1>${heroTextObject.headingText}</h1>
       <p>${heroTextObject.description}</p>    
    </div>
    
   
   https://helpx.adobe.com/experience-manager/using/aem63_datasource.html
   
Excerice 1: 
==
Repartir du TP1, pour ajouter un libellé qui affiche (dynamiquement) en plus les informations suivantes : 

Bienvenu Madamme/monsieur : XXXXX, XXXX à notre formation ADOBE AEM FRANCE !   


Good Learning 
