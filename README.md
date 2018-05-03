#AEM Training TP3

# Templating AEM

Lorsque vous créez une page, vous devez sélectionner un modèle. ceci sera utilisé comme base pour la nouvelle page. Le modèle définit la structure de la page résultante, tout contenu initial et les composants qui peuvent être utilisés (propriétés de conception).

Lorsque vous créez un fragment de contenu, vous devez également sélectionner un modèle. Ce modèle définit la structure, les éléments initiaux et les variations.

_NB_

`ranking = order dans la liste des template `

Les modèles suivants sont couverts en détail:
=============================================
Modèles de page - Statiques (Template staticpage)
-----------------------------
//TODO completer la première partie du TP 

Modèles de page - Modifiables (Template editablepage)
-----------------------------
Pour editer correctement notre page 
il faut autoriser l'ajout des composants dans les parsys 
`changer le mode vers Design, clique sur le parsys puis editer, selectionner le groupe ou le composant à autoriser`

Modèles de page -  Heritage des templates(Template inheritedpage)
-----------------------------
`sling:resourceSuperType="first/components/pages/editablepage"`

Modèles de page -  Policy des templates(Template policypage)
-----------------------------
**cq:allowedTemplates** 

Type de template autorisé à être un enfant de ce modèle.


**allowedChildren** 

Chemin d'un modèle autorisé à être un enfant de ce modèle.

**allowedParents** 

Chemin d'un modèle autorisé à être un parent de ce modèle.

**allowedPaths** 

Chemin d'accès à une page pouvant être basée sur ce modèle.

_Exemple_  /content/jcr_root/apps/first/templates/policypage/.content.xml
----------
    <jcr:root
`         allowedPaths="[/content(/.*)?]"
          allowedParents="[/apps/first/templates/editablepage]"
          allowedChildren="[/apps/first/templates/inheritedpage]"`
          
Modèles de fragment de contenu
-----------------------------
_**AEM 6.2 - 6.3_** 
Le content Fragment est une Asset  
https://helpx.adobe.com/experience-manager/6-2/sites/authoring/using/content-fragments.html
https://helpx.adobe.com/ca_fr/experience-manager/6-3/release-notes/content-fragment-models-fp.html

Rendu de modèle adaptatif
-----------------------------
_**AEM 6.2 - 6.3_**  
https://helpx.adobe.com/fr/experience-manager/6-3/forms/using/custom-adaptive-forms-templates.html


Good Learning 
