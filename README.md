#AEM Training TP4

# AEM Components

Développer vos propres composants

Type des Composants
=============================================
Composants ClassicUI
-----------------------------
Interface utilisateur basée sur la technologie ExtJS introduite avec CQ 5.1.

Composants TouchUI
-----------------------------
L'interface utilisateur standard introduite dans AEM 5.6.0 en tant qu'aperçu et étendue dans 6.x. Il est basé sur l'expérience utilisateur unifiée pour Adobe Marketing Cloud, en utilisant les technologies sous-jacentes de Coral UI et de Granite UI.


HTL
------------
HTL est un langage de template HTML, introduit avec AEM 6.0.

HTL est maintenant le langage de script recommandé pour AEM.


Structure
------------------

La structure d'un composant AEM est puissante et flexible, les principales considérations sont les suivantes:

_Type de ressource_

_Définition du composant_

_Propriétés et nœuds enfants d'un composant_

_Dialogues_

_Dialogues de conception_

_Disponibilité des composants_

_Composants et le contenu qu'ils créent_

Exemple
---
 
     /apps/fisrt
           /components
                      /content
                              /title-h2
                                    /_cq_dialog
                                    
                                                /.content.xml
                                    /.content.xml
                                    /_cq_editConfig.xml
                                    /title-h2.html

Les propriétés d'intérêt particulier comprennent:
============================
jcr: title
 ----------
titre du composant; cela peut être utilisé pour identifier le composant, par exemple, il apparaît dans la liste des composants dans le navigateur ou l'accessoire

jcr: description 
----------------
description pour le composant; peut être utilisé comme indicateur de survol de la souris dans la liste des composants de l'accessoire

sling: resourceSuperType
 ----------------
 indique le chemin de l'héritage lors de l'extension d'un composant (en remplaçant une définition)

cq: editConfig (cq: EditConfig) 
 ----------------
 ceci contrôle les aspects visuels; par exemple, il peut définir l'apparence d'une barre ou d'un widget, ou peut ajouter des contrôles personnalisés

cq: childEditConfig (cq: EditConfig) 
 ----------------
 ceci contrôle les aspects visuels pour les composants enfants qui n'ont pas leurs propres définitions

cq: dialog (nt: non structuré) 
 ----------------
 définit le dialogue pour éditer le contenu de ce composant

cq: design_dialog (nt: non structuré) 
 ----------------
 spécifie les options de modification de conception pour ce composant

dialog (cq: Dialog) 
 ----------------
 définit le dialogue pour éditer le contenu de ce composant (spécifique à l'interface utilisateur classique)

design_dialog (cq: Dialog)
 ----------------
 spécifie les options d'édition de conception pour ce composant

icon.png
----------------
fichier graphique à utiliser comme icône pour le composant dans le Sidekick

thumbnail.png
 ----------------
 fichier graphique à utiliser comme vignette pour le composant en le faisant glisser depuis le Sidekick


Les propriétés de composant
=====

cq: htmlTag
-------
Renvoie des attributs de balise supplémentaires qui sont ajoutés à la balise html environnante. Active l'ajout d'attributs aux divs générés automatiquement.

cq: noDecoration
 ----------
 Si la valeur est true, le composant n'est pas rendu avec les classes div et css générées automatiquement.

cq:isContainer
----
Indique si le composant est un composant de conteneur et peut donc contenir d'autres composants, tels qu'un système de paragraphes.

cq:cellName	
----
cette propriété est prise comme ID de cellule.


cq:EditListenersConfig
====
**beforedelete** Le gestionnaire est déclenché avant que le composant ne soit supprimé.
**beforeedit** Le gestionnaire est déclenché avant que le composant ne soit édité.
**beforecopy** Le gestionnaire est déclenché avant la copie du composant.
**beforemove** Le gestionnaire est déclenché avant le déplacement du composant.
**beforeinsert** Le gestionnaire est déclenché avant l'insertion du composant.

**beforechildinsert** Le gestionnaire est déclenché avant l'insertion du composant dans un autre composant (conteneurs uniquement).
**afterdelete** Le gestionnaire est déclenché après la suppression du composant. **REFRESH_SELF**
**afteredit** Le gestionnaire est déclenché après l'édition du composant. **REFRESH_SELF**
**aftercopy** Le gestionnaire est déclenché après la copie du composant. **REFRESH_SELF**
**afterinsert** Le gestionnaire est déclenché après l'insertion du composant. **REFRESH_INSERTED**
**aftermove** Le gestionnaire est déclenché après le déplacement du composant. **REFRESH_SELFMOVED** , **REFRESH_PAGE**
**afterchildinsert** Le gestionnaire est déclenché après l'insertion du composant dans un autre composant (conteneurs uniquement).




cq:actions
====

**edit** Ajoute un bouton pour éditer le composant.

**remove** Ajoute un bouton pour supprimer le composant

**delete** Ajoute un bouton pour insérer un nouveau composant avant celui en cours

**copymove** Ajoute un bouton pour copier et couper le composant.


Sling:resourceType	
=======

**granite/ui/components/foundation/container  :** Définit un conteneur pour le dialogue
**granite/ui/components/foundation/layouts/tabs :**  onglets Définit un onglet utilisé dans la boîte de dialogue
**granite/ui/components/foundation/section :**  Définit une section dans un onglet.
**granite/ui/components/foundation/layouts/fixedcolumns :**  Définit les colonnes fixes.


Exemple des dialogs AEM
---
https://gist.github.com/kevinweber/05c4c8cf005a6e640f7c8ad65ef5113c



https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/components-basics.html

Good Learning 
