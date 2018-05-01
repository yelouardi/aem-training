#AEM Training TP2

# Création du nouveau projet 6.0,6.1

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


Pour commencer à utiliser VLT, vous devez effectuer les opérations suivantes:
---------------------------------------------------
Installez VLT, mettez à jour les variables d'environnement et mettez à jour les fichiers subversion ignorés globaux.
Configurez le référentiel AEM (si vous ne l'avez pas déjà fait).
Découvrez le référentiel AEM.
Synchroniser avec le référentiel.
Testez si la synchronisation a fonctionné.


https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/ht-vlttool.html

Specifying CRX Host/Port
------------------------

The CRX host and port can be specified on the command line with:
mvn -Dcrx.host=otherhost -Dcrx.port=5502 <goals>


https://helpx.adobe.com/experience-manager/using/first-arch10.html



#Optional
=======

Création du nouveau projet 6.3,6.4
-----------------

**Setup Lazybones**

Lazybones est installé en utilisant un processus en deux étapes. Tout d'abord, installez sdkman, un système de gestion de Sofware Development Kit. Les instructions pour installer sdkman peuvent être trouvées à http://sdkman.io/install.html.
Dans une fenêtre Terminal, exécutez ces deux commandes:

`curl -s "https://get.sdkman.io" | bash`

`source ~/.sdkman/bin/sdkman-init.sh`

Once sdkman is installed, you can use it to install lazybones with the following command:

`sdk install lazybones`

**_Create a Lazybones project_**

Vous pouvez utiliser Lazybones pour créer un projet Experience Manager. Lazybones est un outil de création de projet qui utilise des modèles pour créer des projets. Une fois créé, vous pouvez importer le projet dans Eclipse.

Pour créer un projet Experience Manager à l'aide de Lazybones, procédez comme suit:

1. Ouvrez un autre Terminal (sous Windows, vous pouvez utiliser un outil comme Git Bash).

2. Accédez au dossier racine de l'utilisateur.

3. Entrez la commande suivante:

     lazybones créer aem-multimodule-projet mon-projet

Remarque: - Pour AEM 6.4, choisissez la version AEM cible [6.3]: Les choix sont [6.3, 6.4]: 6.4

4. Répondez aux questions avec les valeurs par défaut (entrez return pour toutes les questions).

5. Une fois le projet construit avec succès, vous verrez le message suivant.


```# AEM training

This a content package project generated using the AEM Multimodule Lazybones template.

## Building

This project uses Maven for building. Common commands:

From the root directory, run ``mvn -PautoInstallPackage clean install`` to build the bundle and content package and install to a CQ instance.

From the bundle directory, run ``mvn -PautoInstallBundle clean install`` to build *just* the bundle and install to a CQ instance.

## Using with AEM Developer Tools for Eclipse

To use this project with the AEM Developer Tools for Eclipse, import the generated Maven projects via the Import:Maven:Existing Maven Projects wizard. Then enable the Content Package facet on the _content_ project by right-clicking on the project, then select Configure, then Convert to Content Package... In the resulting dialog, select _src/main/content_ as the Content Sync Root.

## Using with VLT

To use vlt with this project, first build and install the package to your local CQ instance as described above. Then cd to `content/src/main/content/jcr_root` and run

    vlt --credentials admin:admin checkout -f ../META-INF/vault/filter.xml --force http://localhost:4502/crx

Once the working copy is created, you can use the normal ``vlt up`` and ``vlt ci`` commands.

## Specifying CRX Host/Port

The CRX host and port can be specified on the command line with:
mvn -Dcrx.host=otherhost -Dcrx.port=5502 <goals>
```

https://helpx.adobe.com/experience-manager/using/aem_lazybones.html


Good Learning 
