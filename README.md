#AEM Training TP6

# AEM Sling Model

- De nombreux projets Sling veulent être en mesure de créer des objets modèles 
- des POJO qui sont automatiquement mappés à partir d'objets Sling,
    généralement des ressources, mais aussi des objets de requête.
    Parfois, ces POJO ont également besoin de services OSGi.


#Objectifs de conception 

- OOTB, propriétés de ressource  (via ValueMap), SlingBindings, services OSGi, attributs de demande

- Adapter plusieurs objets - ressources minimales requises et SlingHttpServletRequest

https://sling.apache.org/documentation/bundles/models.html


Exemple d'une class SLingModel
--
    package org.apache.sling.models.it.models;
    @Model(adaptables=Resource.class)
    public class MyModel {
    
        @Inject
        private String propertyName;
    }

Dependence Maven à ajouter 
-
            
            <dependency>
				<groupId>org.apache.sling</groupId>
				<artifactId>org.apache.sling.models.api</artifactId>
				<version>1.1.0</version>
				<scope>provided</scope>
			</dependency>    

            <plugin>
				<groupId>org.apache.felix</groupId>
				<artifactId>maven-bundle-plugin</artifactId>
				<extensions>true</extensions>
				<configuration>
					<instructions>
					<Export-Package>
							com.aem.training.model
					</Export-Package>
						<Bundle-SymbolicName>com.aem.trainig.first-bundle</Bundle-SymbolicName>
						<Sling-Model-Packages>
							com.aem.training.model
						</Sling-Model-Packages>
					</instructions>
				</configuration>
			</plugin>
    


Exercice 1
--
Developper un model qui adapt une reource jcr (Composant) à un message de retour String 

Exemple : 
Je contribue dans mon composant du TP5 nom et prénom et sexe mon contrôleur (WcmUse adapte ma ressource avec mon modèle qui affiche un seul message)
Bienvenu Madamme/monsieur : XXXXX, XXXX à notre formation ADOBE AEM FRANCE !


Exercice 2
--
Developper un model qui adapt une requet HTTP url de ma (page) à un message de retour String 

Exemple : 
J'envoi un url de tyle localhost:4502/content/aem-training/index.html?toto=SLING MODEL
Bienvenu Madamme/monsieur : SLING MODEL à notre formation ADOBE AEM FRANCE !



Good Learning 
