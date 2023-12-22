### **Présentation JEE**
+ Je présenterai la plateforme Java EE.
+ Je mentionnerai beaucoup de technologies, et quelques «mots à la mode » qui sont généralement utilisés par les développeurs dans ce domaine. Je vais m'efforcer de tout expliquer!
+ Gardez à l’esprit que cela aura de plus en plus de sens à mesure que vous progresserez dans le cours. Mais c'est une bonne idée de comprendre certaines informations de base, même à un niveau conceptuel, avant de nous lancer dans le développement d'applications Web.
+ Java EE, également connu sous le nom de JEE signifie Java Enterprise Edition.
+ Ce n'est pas un seul programme ou produit. Considérez-le comme un ensemble de technologies et d'API pour la plate-forme Java, conçues pour prendre en charge les applications « Entreprise ».
+ Les applications d'entreprise peuvent généralement être classées comme des applications à grande échelle, distribuées, transactionnelles et hautement disponibles, conçues pour prendre en charge les exigences métier critiques.
+ Pensez aux logiciels pour les banques ou les bourses. Ce genre d'applications. Cependant, ils ne sont pas obligés d’avoir toutes ces fonctionnalités.
+ Java EE est énorme!
+ Certaines des technologies utilisées dans JEE sont « JDBC, JNDI, EJB, RMI, JSP et Java Servlets ». Juste pour en nommer quelques-uns.
+ Chacun de ces sujets pourrait facilement couvrir un cours entier. En conséquence, nous allons nous concentrer sur la création d'applications Web avec « Java Springs » dans ce cours, et ne pas essayer d'introduire et d'utiliser toutes les technologies « JEE ».

### **Où s'exécute le code de notre application Web?**
+ Les applications Web que nous créons doivent être exécutées dans un conteneur sur le serveur Web, par ex. Nous ne les exécutons pas comme nous le ferions avec une application Java typique.
+ Ces serveurs Web seraient généralement hébergés dans une « salle de serveurs » et connectés à Internet, et en tant que développeurs, nous déploierions nos applications sur la machine « exécutant » le serveur Web.
+ Nous utiliserons un serveur Web appelé « Tomcat » dans ce cours, puis l'installerons et l'exécuterons sur notre machine locale à des fins de développement.
+ C'est généralement ainsi que fonctionnent les développeurs Web. Ils créent des applications Web et les testent avec un serveur Web sur leurs ordinateurs, et une fois l'application testée et terminée, la déploient sur le serveur Web réel exécuté sur le serveur Web officiel de l'entreprise.

### **Présentation JEE**
+ De quoi avons-nous besoin pour créer des applications Web?
+ Nous avons besoin d'un IDE pour créer notre code Java. Nous utiliserons une version spéciale d'Eclipse pour le développement JEE dans ce cours à cet effet.
+ Ainsi, le serveur Web est un conteneur pour nos applications Web.
+ Les conteneurs sont des environnements d'exécution pour les composants, qui fournissent également des services de gestion et de contrôle pour ces composants.
+ Que sont les composants ?
+ Les applications `JEE` sont constituées de composants. Il s'agit de logiciels fonctionnels autonomes assemblés dans une application Java EE.
+ `Servlets et pages JSP` sont des exemples de composants, mais il y en a aussi d'autres.
### **Technologies de conteneurs Web**
+ Les conteneurs Web fournissent des environnements d'application Web « robustes ». Un conteneur Web `JEE` (serveur Web) prend en charge, entre autres, les technologies suivantes :
    + `Servlet`
    + `Pages de servlets Java (JSP)`
    + `Bibliothèque de balises standard JSP (JSTL)`
    + `Visages du serveur Java (JSF)`
+ Ce sont toutes des technologies qui nous permettent collectivement de créer des applications Web, et vous les verrez (fin beaucoup plus) en action au fur et à mesure de votre progression dans le cours.
+ Très bien, voilà donc un aperçu de base de « JEE » et de ce que nous allons faire dans ce cours.
+ Explorons ce sujet un peu plus dans la vidéo suivante, et ils continuent de se salir les mains en développant des applications Web.


### **Quizz : Introduction au Quizz Java EE**

#### **Question 1**
+ `Java EE`, également connu sous le nom de `JEE`, signifie Java Enterprise Edition.
+ La plateforme `Java EE` est développée via `Java Community Process (JCP)`
+ `Java EE` possède sa propre demande de spécification `Java(JSR-244)` developpé par un groupe d'experts.
+ Ce groupe est représenté par des sociétés comme : `SAP,BEA, JBoss, IBM,Novel, Oracle, HP, Sun, Borland`.

#### **Question 2**
+ `Wora` signifie `écrire une fois, executer n'importe où`.

#### **Question 3**
+ Depuis la sortie de `Java Enterprise Edition 1.5`, `J2EE` a été renommé `Java EE` ou simplement `JEE`.
+ `Java EE` est un ensemble de specification permettant de développer et de déployer des applications d'entreprise.
+ En général, une application d'entreprise fait référence à un logiciel hébergé sur des serveurs prenant en charge les entreprises.

### **Question 4**
+ `Un Composant` est un élément logiciel accessible uniquement via des interfaces et conçu pour la personnalisation et la collaboration avec d'autres composants. 
+ `EJB` est un exemple d'un tel composant.


#### **Question 5**
+ Les `Conteneurs` sont des environnements d'exécution pour les composants.
+ `Java EE` définit les principaux types de conteneurs suivants :
 + `Conteneurs Web et conteneurs EJB`

#### **Question 6**
+ Parmi les faits suivants, lesquels sont vrais à propos d'un serveur Web?
 + Un serveur Web sert généralement du contenu `HTTP`
 + On peut voir le contenu Web servi par un serveur Web lors de la visite d'un site Web à partir d'un navigateur.

#### **Question 7**
+ Un conteneur `Web JEE` prend en charge, entre autres, les technologies suivantes :
 + `Servlets`
 + `Pages du serveur Java(JSP)`
 + Bibliothèques de balises standard `JSP (JSTL)`
 + Visages du serveur Java `(JSF)`

#### **Question 8**
+ La plateforme `Java EE` utilise un modèle d'application à plusieurs niveaux pour les applications d'entreprise telles que:
 + `Niveau Client`
 + `Niveau Web`
 + `Niveau Entreprise`
 + `Niveau Sytème d'information d'entrepise d'entrepise`


### **Explorer les bases de Java EE : Explorer les concepts**
### **Introduction**
+ Ce que je veux faire, c'est vous montrer les « anciennes » façons de créer des applications Web, avant de nous lancer et de commencer à utiliser « Spring » et de faire les choses de la bonne manière.
+ Voir l'ancienne méthode (ou les méthodes en fait, parce que je vais montrer deux façons) est très utile pour voir comment les choses étaient faites, et puis une fois que vous arriverez au printemps, vous réaliserez à quel point le « printemps » est puissant. te donne.
+ De plus, apprendre les bases des applications Web est une compétence très utile.
+ Désormais, ces applications « à l'ancienne » avaient deux modèles distincts pour créer des applications Web.

### **La programmation**
+ **Architecture modèle 1**
  + Considérez ce modèle comme une architecture historique obsolète qui a été utilisée pour développer des applications Web lorsque « JEE » en était à ses balbutiements. Ici, vous traitez les choses à un niveau bas.
  + Cela a mélangé des choses comme la présentation de votre application avec la logique métier de l'application (ce qui est une mauvaise chose).
  + La requête `HTTP` est envoyée par le navigateur de la `page JSP`. « JSP » signifie « Java Server Pages ». Pour plus de simplicité, considérez dès maintenant une page « JSP » comme une page Web « HTML » dynamique.
  + Votre `Page JSP` intercepte la requête et interagit avec le `tier\layer` de l'entreprise. La couche Business, comme son nom l'indique, contient la logique métier relative au domaine métier de l'application Web.
  + La couche métier se connecte au « niveau EIS ou à la couche de base de données » pour terminer le traitement métier. Les données traitées sont renvoyées vers votre « page JSP ».
  + Votre page `JSP` génère la réponse et la transmet au navigateur.


+ **Architecture modèle 2**
  + L'« architecture modèle 2 » constitue une amélioration significative par rapport au « modèle 1 » et constitue aujourd'hui la méthode recommandée pour développer des applications Web.
  + `Model 2` est basé sur le modèle de conception `MVC (Model View Controller)`. Le modèle de conception `MVC` se compose de trois modules, à savoir le `Modèle`, la `Vue` et le `Contrôleur` `(MVC)`.
    + `Modèle` - Le modèle représente l'état ou les données.
    + `View` - La vue est responsable de l'affichage/du formatage des données dans le format souhaité. La vue est en fait représentée par les pages « JSP » de votre application Web.
    + `Controller` - Le `Controller` gère toutes les requêtes et a la logique pour décider où les transmettre. Un `Servlet` joue ici le rôle de contrôleur.

#### **JSP et Servlet**
+ **Servlet**
  + Un `Servlet` est une technologie côté serveur utilisée pour créer des applications Web.
  + Un `Servlet` est une classe Java qui étend les capacités du serveur Web. Il intercepte les demandes entrantes et les réponses en conséquence.
  + Un `Servlet` est un composant `JEE` qui peut être déployé sur le serveur pour créer des pages web dynamiques.

+ La classe `HttpServlet` donne aux développeurs Web la possibilité dont nous avons besoin pour créer un `Servlet`.
+ Il fournit des méthodes spécifiques `HTTP` telles que `doGet, doPost, doHead, doTrace etc`, qui sont utilisées à bas niveau dans les applications Web.
+ A titre d'exemple, la méthode `doGet` gère les requêtes `GET` (conceptions entrantes depuis les navigateurs) et `doPost` gère les requêtes `POST` (envoi de données depuis un navigateur).

+ Deux méthodes couramment utilisées pour une requête-réponse entre un client et un serveur sont : `GET et POST`.
  + `GET` - Demande des données à une ressource spécifiée.
  + `POST` - Soumet les données à traiter à une ressource spécifiée.
+ Il y a bien plus que cela, mais essentiellement c'est ainsi que cela fonctionne à un niveau élevé.
+ À propos, client, dans ce contexte, désigne généralement un navigateur se connectant au serveur Web.


+ **JavaServer Pages(JSP) - Que sont les JSP ?**
  + `JavaServer Pages(JSP)` sont une technologie de programmation côté serveur qui permet la création de pages Web dynamiques.
  + `JSP` aide les développeurs à intégrer du code Java dans des pages `HTML` normales en utilisant des balises `JSP` spéciales.

+ Nous pouvons utiliser des « JSP » pour collecter les commentaires des utilisateurs via des pages Web telles que celles que vous voyez lorsque vous créez un compte sur un site Web.
+ Vous pouvez également présenter des enregistrements extraits d'une base de données et également créer des pages Web de manière dynamique.


### **Quizz 2 : Section Introduction à Java EE, Conférence 15 Quizz**

#### **Question 1**
+ Dans l'architecture Web modèle 1, `JSP` traite directement la réponse aux requêtes.
+ Dans l'architecture Web Modèle 2, `Servlet` joue le rôle de contrôleur.
+ Le modèle 2 représente le paradigme `MVC`

#### **Question 2**
+ `Servlet` est une technologie côté serveur utilisée pour créer des applications Web.
+ `Servlet` est une classe qui étend les capacités du serveur. Il intercepte les demandes entrantes et répond en conséquence.
+ `Servlet` est un composant `Java EE` qui peut être déployé sur le serveur pour créer une page Web dynamique.


### **Question 3**
+ `JSP` est une technologie de programmation du côté serveur qui permet la création de pages web dynamiques.
+ `JSP` aide les développeurs à intégrer du code java dans les pages `XHTML` en utilisant les balises `JSTL` spéciales.
+ D'une certaine manière, une page `JSP` n'est en réalité qu'une autre façon d'écrire des servlets sans connaitre la programmation java.


### **Quizz 3 : Section Introduction à Java EE, Conférence 16, 17**

#### **Question 1**
+ La classe `HttpServlet` étend la classe `GenericServlet` et implémente l'interface `Serializable`.
+ La classe `HttpServlet` fournit des méthodes spécifiques à `HTTP` telles que `doGet, doPost, doHead, doTarce, etc`.

#### **Question 2**
+ La méthode `HTTP GET` demande les données àla ressource spécifiée et la méthode `HTTP POST` soumet les données à traiter à une ressource spécifiée.

#### **Question 3**
+ L'intégration du code Java pur dans `JSP` est une bonne pratique par les développeurs d'applications `JEE`.
 + **FAUX**

#### **Question 4**
+ Dans le modèle `MVC`, l'une des choses importantes obtenues est la séparation des préoccupations, c'est-à-dire la séparation de la logique métier et de la logique de présentation.
+ La `Logique métier` est implémentée à l'aide du code ou de classes Java et la logique de présentation à l'aide de `JSP`.


#### **Question 5**
+ `out` est un objet `JSP` implicite utilisé pour écrire dans le flux de sortie.

### **JSTL Overview**
+ The `JavaServer Pages Standard Tag Library(JSTL)` is a collection of useful JSP tags.
+ These tag look somewhat similar to `HTML` tags and are used in `JSP` files.
+ `JSTL` tags help to implement a lot of core functionality that is commonly used in `JSP`, such as iteration and conditionals tags for manipulating `XML` documents etc.
+ `Library` indicates it is a collection of java classes packed in `.jar` archives, that we will download and add to our project.
+ These are several group of `JSTL` tags based on required functionality such as - Core tags, Formatting tags etc.
+ We are going to start working with two tags under the Core tags category - they are:
 + `<c:out/>` : for outputting data
 + `<c:forEach` : for iterating over collections(in our case, a list).

### **Quizz 4 : Section Introduction à Java EE, Conférences 18, 19 et 20**

#### **Question 1**
+ Lequel des énoncés suivants est correct.
  + `Service Layer(également appelé Business Layer)` n'est rien d'autre qu'une classe Java qui assume la responsabilité du traitement des données. 

#### **Question 2**
+ `JSTL` signifie `Bibliothèques de balises standard JSP`
  + VRAI

#### **Question 3**
+ Dans l'expression `@WebServlet("/WelcomeServletNew")`
  + `/WelcomeSevletNew` est le chemin de la servlet.


#### **Question 4**

+ `RequestDispatcher` est une interface dont l'implémentation définit un objet qui peut envoyer une requête à toutes les ressources(telles que `HTML`, `Image`, `JSP`, `Servlet`) sur le serveur.
  + VRAI


#### **Question 5**
+ La méthode `doGet` prend les arguments suivants
  + `HttpServletRequest et HttpServletResponse`


#### **Question 6**
+ La méthode `doGet` a type de retour `void` (vide)
  + VRAI


#### **Question 7**
+ `<c:out/>` pour la sortie des données et `<c:forEach/>` pour parcourir les collections.
  + VRAI


#### **Question 8**
+ Les directives `JSP` fournissent des instructions au conteneur Web, lui indiquant comment gérer les aspects pertinents du traitements `JSP`. 
+ Laquelle des propositions suivantes est une directive standard correcte?

  + `<%@ taglib prefix="c" uri="http://java.sum.com/jsp/jstl/core"/>`

#### **Question 9**
+ `${}` est utilisé pour construire l'expression `EL`. `EL` signifie langage d'expression - c'est une syntaxe spéciale pour accéder aux variables au sein de la couche d'existence.
  + FAUX

