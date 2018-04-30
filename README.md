#AEM Training TP1

# Architecture 
 AEM ce compose d’une série des Frameworks Open Source comme : 

Apache  Sling 
---------------
        Est un framework pour les applications web RESTful basé sur un arbre de contenu extensible.
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

JCR 
-----
        Gestion des contenus : Java Content Repository 'API d'entrepôt documentaire standard appelée aussi JSR 283 
        (anciennement appelée JSR 170).
        Java Content Repository est un espace de stockage de données semi-structuré sous la forme d’une arborescence de nœuds. 
        Chaque élément (Item) est soit un nœud (Node), soit une propriété (Property). Une Property stocke l’information
         (nom et valeur associée). Un Node structure le contenu.

Apache Jackrabbit Oak 
-----------------------
        comme implémentation de JCR. Les versions précédentes,jusqu’à la version 5.6, utilisaient Adobe CRX.
         Oak et CRX apportent notamment une API pour interagir plus facilement avec JCR.
 
OSGI
----
        est une plateforme Java permettant d’installer, démarrer, modifier des composants de code, nommés « bundles », à chaud, c’est-à-dire sans redémarrer le serveur.
        Une solution OSGI apporte de nombreux bénéfices :
            - Le code devient plus facile à écrire et à tester grâce au découpage en composants
            - La réutilisation de composants est améliorée (facilité d’utilisation)
            - Les déploiements de bundles sont aisés (fichiers Zip normés à installer via une console d’administration
            - Les bugs sont détectés plus tôt
            - Le moteur OSGI permet de voir en direct quels sont les composants actifs et visualiser les dépendances entre eux.

Apache Felix
--------------
        qui est une implémentation de la plateforme OSGI fournissant une console d’administration 
        et une API permettant notamment de créer facilement des bundles OSGI et d’interagir avec 
        le code déployés (notions de servlets, de services, etc.).


Good Learning 
