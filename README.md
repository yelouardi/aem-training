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
    public class IdentiteTextComponent extends WCMUsePojo {
     /** The hero text bean. */
        private String identite;
     	private String nom;
     	private String preNom;
      
    @Override
    public void activate() throws Exception {
          
          ValueMap values = getResource().adaptTo(ValueMap.class);
          
          		if (values.containsKey("identite")) {
          			setIdentite(getProperties().get("identite", String.class));
          		}
          		if (getProperties().containsKey("nom")) {
          			setNom(getProperties().get("nom", String.class));
          		}
          		if (getProperties().containsKey("preNom")) {
          			setPreNom(getProperties().get("preNom", String.class));
          		}
          		this.messageDisply = String.format("BienVennue : %s %s %s dans la formation AEM", this.identite, this.nom,
          				this.preNom);
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

HTL
==

        <div data-sly-use.identiteUse="${'com.aem.training.components.use.IdentiteTextComponent'}">
			<h1>${identiteUse.messageDisply}</h1>
		</div>
   
   https://helpx.adobe.com/experience-manager/using/aem63_datasource.html
   
Excerice 1:
==
Repartir du TP1, pour ajouter un libellé qui affiche (dynamiquement) en plus les informations suivantes : 

Bienvenu Madamme/monsieur : XXXXX, XXXX à notre formation ADOBE AEM FRANCE !   


Good Learning 
