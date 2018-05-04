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
    <plugin>
        <groupId>org.apache.felix</groupId>
        <artifactId>maven-bundle-plugin</artifactId>
        <extensions>true</extensions>
        <configuration>
            <instructions>
                <_plugin>org.apache.sling.bnd.models.ModelsScannerPlugin</_plugin>
            </instructions>
        </configuration>
        <dependencies>
            <dependency>
                <groupId>org.apache.sling</groupId>
                <artifactId>org.apache.sling.bnd.models</artifactId>
                <version>1.0.0</version>
            </dependency>
        </dependencies>
    </plugin>
    
     <Sling-Model-Packages>
       org.apache.sling.models.it.models
     </Sling-Model-Packages>

  
Good Learning 
