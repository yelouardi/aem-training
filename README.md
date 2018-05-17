#AEM Training TP1

# Architecture 

Granit
======

 AEM ce compose d’une série des Frameworks Open Source comme : 


OSGI (Le noyeau) 
-----
        est une plateforme Java permettant d’installer, démarrer, modifier des composants de code, nommés « bundles », à chaud, c’est-à-dire sans redémarrer le serveur.
        Une solution OSGI apporte de nombreux bénéfices :
            - Le code devient plus facile à écrire et à tester grâce au découpage en composants
            - La réutilisation de composants est améliorée (facilité d’utilisation)
            - Les déploiements de bundles sont aisés (fichiers Zip normés à installer via une console d’administration
            - Les bugs sont détectés plus tôt
            - Le moteur OSGI permet de voir en direct quels sont les composants actifs et visualiser les dépendances entre eux.

https://t-templier.developpez.com/tutoriel/java/osgi/osgi1/

https://t-templier.developpez.com/tutoriel/java/osgi/osgi1/

Apache Felix (Son implémentation dans AEM)
--------------
        Qui est l'implémentation de la plateforme OSGI dans AEM, fournissant une console d’administration 
        et une API permettant notamment de créer facilement des bundles OSGI et d’interagir avec 
        le code déployés (notions de servlets, de services, etc.).
        
https://www.slideshare.net/mikeyhendy/adobe-meetup-aem-architecture-sydney-2015 

JCR (Le noyeau) 
-----
        Gestion des contenus : Java Content Repository 'API d'entrepôt documentaire standard appelée aussi JSR 283 
        (anciennement appelée JSR 170).
        Java Content Repository est un espace de stockage de données semi-structuré sous la forme d’une arborescence de nœuds. 
        Chaque élément (Item) est soit un nœud (Node), soit une propriété (Property). Une Property stocke l’information
         (nom et valeur associée). Un Node structure le contenu.
         
https://www.slideshare.net/bdelacretaz/rapid-jcr-applications-development-with-sling-1196003 

Apache Jackrabbit Oak (Son implémentation dans AEM)
-----------------------
        C'est l'implémentation du JCR dans AEM (Dpuis la version : AEM6.1). Les versions précédentes (depuis la version 5.6) utilisaient Adobe CRX.
        Oak et CRX apportent notamment une API pour interagir plus facilement avec JCR.

 https://www.slideshare.net/ehsavoie/java-content-repository-avec-jackrabbit?qid=fd039c36-2f39-4b6d-85fd-ba71baebd8a5&v=&b=&from_search=3
 
Apache  Sling 
---------------
        Est un framework pour les applications web RESTful basé sur un arbre de contenu extensible. Il a pour principale fonction d'exposer nos resources disponibles dans notre référentiel: Java Content Repository (JCR).
        Sling mappe les URL de requête HTTP aux ressources de contenu en fonction du chemin, de l'extension et des sélecteurs de la requête. 
        Les principes d’une architecture Web RESTful sont :
            - Orienté ressources : chaque bribe d’informations comme un libellé, une actualité, une description de produit,
             un fichier ou une image par exemple est une ressource (« everything is content »)
            - Les ressources sont adressables et accessibles en REST via le protocole http. Chaque ressource possède une URI spécifique.
            - REST est un protocole normé, on utilise simplement les méthodes fournies comme GET, POST, PUT ou DELETE pour interagir avec le contenu.
            - Orienté représentation : un objet est référencé par une unique URI mais avoir différents formats de représentation 
            disponible. Par exemple, une requête AJAX réclame du JSON, une application Java demande du XML, un navigateur Web veut du HTML.
             Pour répondre à ceci, on pourra créer différents services de représentation et rendu pour chaque type de ressource.

            - Communication sans état (stateless). REST est lui-même stateless,
             il n’utilise pas de cookies et ses clients doivent se ré-authentifier à chaque requête.

https://sling.apache.org/documentation/tutorials-how-tos.html https://sling.apache.org/docs/ApacheConEU08_JCR_Meetup_Sling_Architecture.pdf

Environments
============

Author
------------

Ceux-ci interagissent pour vous permettre de rendre le contenu disponible sur votre site Web afin que vos visiteurs puissent le lire.

L'environnement auteur fournit les mécanismes pour créer, mettre à jour et réviser ce contenu avant de le publier:

Un auteur crée et examine le contenu (il peut être de plusieurs types, par exemple, des pages, des éléments, des publications, etc.)
qui, à un moment donné, sera publié sur votre site Web.


Publish
------------

Pour l'environnement de publication, vous concevez tout l'aspect de l'interface mise à la disposition de vos utilisateurs.

Dispatcher
---------------

Pour optimiser les performances des visiteurs de votre site Web, le répartiteur implémente l'équilibrage de la charge et la mise en cache.


https://helpx.adobe.com/experience-manager/6-3/sites/authoring/using/author.html



Good Learning 
