#AEM Training TP2

# Création du nouveau projet 

 mvn archetype:generate -DarchetypeRepository=https://repo.adobe.com/nexus/content/groups/public/ -DarchetypeGroupId=com.day.jcr.vault -DarchetypeArtifactId=multimodule-content-package-archetype -DarchetypeVersion=1.0.2 -DgroupId=com.aem.training -DartifactId=first -Dversion=1.0-SNAPSHOT -Dpackage=com.aem.training -DappsFolderName=first -DartifactName="My First Project" -DcqVersion="5.6.1" -DpackageGroup="AEM TRAINING"

My First Project
========

Ce projet de package de contenu généré à l'aide du multimodule-content-package-archetype.

Content
------
C'est la partie front du projet AEM (config, template, pages, composants ...)

Bundle
------
C'est la partie back du projet AEM (ClassUse, SlingModel, Services, Servlets ...)

Building
--------

Ce projet utilise Maven pour la construction. Commandes courantes:

À partir du répertoire racine, exécutez `` mvn -PautoInstallPackage clean install`` pour créer le paquetage de bundle et de contenu et l'installer sur une instance CQ.

A partir du répertoire du bundle, lancez `` mvn -PautoInstallBundle clean install`` pour construire * juste * le paquet et l'installer dans une instance CQ.

Using with VLT
--------------

Pour utiliser vlt avec ce projet, commencez par créer et installer le package sur votre instance CQ locale, comme décrit ci-dessus. Puis cd dans `content / src / main / content / jcr_root` et lancez

    vlt --credentials admin:admin checkout -f ../META-INF/vault/filter.xml --force http://localhost:4502/crx

Une fois la copie de travail créée, vous pouvez utiliser les commandes normales `` vlt up`` et `` vlt ci``.

https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/ht-vlttool.html

Specifying CRX Host/Port
------------------------

The CRX host and port can be specified on the command line with:
mvn -Dcrx.host=otherhost -Dcrx.port=5502 <goals>


https://helpx.adobe.com/experience-manager/using/first-arch10.html


Good Learning 
