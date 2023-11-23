### **Présentation de Spring MVC**
+ `Spring Web MVC` est un framework web original construit sur l'API Servlet.
+ Il est livré dans le framework Spring depuis le tout début et il est communément connu sous le nom de « Spring MVC ».
+ `Spring MVC`, comme beaucoup d'autres frameworks Web, est conçu autour du modèle de contrôleur frontal (plus d'informations à ce sujet prochainement).
+ `MVC` signifie `Model, View and Controller` et c'est un modèle de conception.
+ Ce modèle divise l'application en trois composants, pour séparer la représentation interne des informations de la manière dont elles sont présentées à l'utilisateur.
+ `MVC` représente trois composants :
    + `Model(M)` : Les modèles sont responsables de la gestion des données, de la logique métier et des règles métier de l'application.
    + `Vue (V)` : La vue est une représentation de sortie d'informations, par exemple affichant des informations ou des rapports à l'utilisateur sous forme de formulaire Web ou de graphiques.
    + `Contrôleur (C)` : le contrôleur est chargé d'appeler les modèles pour exécuter la logique métier, puis de mettre à jour la vue en fonction de la sortie du modèle.
+ Dans `Spring MVC`, nous avons un servlet central, connu sous le nom de `DispatcherServlet`, il fournit un algorithme partagé pour le traitement des requêtes.
+ Le travail proprement dit est effectué par des composants configurables et délégués, c'est-à-dire que nous disposons de contrôleurs qui gèrent les demandes.
+ Le `DispatcherServlet` attend un `WebApplicationContext`, qui est une extension d'un simple `ApplicationContext`, pour sa propre configuration.
+ En d'autres termes, avec `WebApplicationContext`, certains beans sont automatiquement enregistrés pour nous.
+ Avec `Spring MVC`, nous pouvons utiliser différentes technologies d'affichage pour restituer des pages Web.
+ Par exemple « Groovy Markup, Freemarker et Thymeleaf ».
+ Plus tard dans les cours, nous utiliserons `Thymeleaf`.
+ `Spring MVC` s'intègre également à d'autres frameworks Web.

### **Défi de configuration de projet**
+ Ajouter des dépendances pour les artefacts suivants
  + `spring-webmvc`
  + `lombok`
  + `logback-classique`
  + `javax.annotation-api`

+ Configurez le plugin maven-compiler comme nous l'avons fait avec le projet précédent.
+ Ajouter le fichier logback.xml du projet précédent.
+ Exécutez les objectifs Maven Clean et Install après avoir configuré toutes les dépendances.


### **Contrôleur simple**
+ Comme mentionné précédemment, `Spring MVC` (Model-View-Controller) est conçu autour du `Dispatcher Servlet` qui joue le rôle de `Front Controller`. Il reçoit toutes les demandes relatives à votre candidature.
+ Nous pouvons mapper les requêtes aux méthodes dans les classes annotées `@Controller`. Ces classes sont appelées contrôleurs annotés ou classes de contrôleurs.
+ `Spring MVC` fournit un modèle de programmation basé sur des annotations dans lequel les composants `@Controller et @RestController` utilisent des annotations pour exprimer les mappages de requêtes, les entrées de requêtes, la gestion des exceptions, etc.
+ Les contrôleurs annotés ont des signatures de méthode flexibles et n'ont pas besoin d'étendre les classes de base ni d'implémenter d'interfaces spécifiques.
+ Nous parlerons plus en profondeur de l'annotation `@RestController`.
+ L'annotation `@RequestMapping` est utilisée pour mapper les requêtes aux méthodes du contrôleur.
+ Il possède divers attributs à faire correspondre par URL, méthode HTTP, paramètres de requête, en-têtes et types de médias.
+ Nous utiliserons des variantes de raccourci spécifiques de l'annotation `@RequestMapping` qui sont disponibles depuis `Spring 4.3`.
+ Les variantes de raccourci de `@RequestMapping` sont :
  + `@GetMapping` (pour mapper les requêtes `HTTP GET`).
  + `@PostMapping` (pour mapper les requêtes `HTTP POST`).
  + `@PutMapping` (pour mapper les requêtes `HTTP PUT`).
  + `@DeleteMapping` (pour mapper les requêtes `HTTP DELETE`).
  + `@PatchMapping` (pour mapper les requêtes `HTTP PATCH`).
+ Nous nous concentrerons principalement sur les deux premiers, `@GetMapping et @PostMapping`, pour le moment.


### **Afficher le résolveur et afficher**
+ `JSP` est un document texte qui contient deux types de texte : les "données statiques", exprimées dans n'importe quel format texte (tel que "HTML"), et les éléments "JSP", qui construisent du contenu dynamique.
+ Nous commencerons par `JSP` comme technologie de visualisation, puis passerons à thymeleaf.
+ Nous utiliserons `JavaServer Pages Standard Tag Library (JSTL)`.
+ `JSTL` est un composant de la plateforme de développement `Java EE Web Application`.
+ Il étend les spécifications `JSP` en ajoutant une bibliothèque de balises `JSP` pour les tâches courantes, comme les boucles, etc.


### **Qu'est-ce que JSTL?**
+ La « Bibliothèque de balises standard JavaServer Pages (JSTL) » est une collection de balises « JSP » utiles qui encapsulent les fonctionnalités de base communes à de nombreuses applications « JSP ».
+ `JSTL` prend en charge les tâches structurelles courantes, telles que l'itération et les conditions, les balises pour manipuler les documents `XML`, les balises `SQL`, etc.
+ Les balises `JSTL` sont classées dans les groupes de bibliothèques de balises `JSTL` suivants et peuvent être utilisées lors de la création d'une page `JSP` :
  + `Balises principales`
  + `Balises de formatage`
  + `Balises SQL`
  + `Balises XML`
  + `Fonctions JSTL`
+ Nous utiliserons principalement les balises core.
+ Certaines de ces balises sont:
  + `<c:forEach>` - utilisé pour parcourir une collection.
  + `<c:out>` - utilisé pour afficher le résultat d'une expression.
  + `<c:url>` - utilisé pour formater une `URL` en chaîne et la stocker dans une variable.
    