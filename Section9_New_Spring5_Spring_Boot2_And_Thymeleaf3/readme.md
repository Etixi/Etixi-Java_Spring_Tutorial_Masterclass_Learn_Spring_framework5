## **Introduction à la feuille de thym**

### **Qu'est-ce que Thymeleaf**

+ `Thymeleaf` est un moteur de modèles Java côté serveur moder utilisé dans les environnements Web et autonomes.

+ Avec `Thymeleaf`, `HTML` peut être affiché correctement dans les navigateurs en tant que prototype statique, c'est-à-dire que nous pouvons prévisualiser `HTML` sans traiter de modèle.

+ Il s'intègre bien avec `Spring` et `Java EE`.

### **Modèles ?**

+ Les « Modèles » sont utilisés dans d'autres applications. Par exemple, vous pouvez utiliser un modèle dans Microsoft Word formaté comme une lettre commerciale dans un format spécifique.

+ `Thymeleaf` a des modèles, qui ne sont rien de plus que des fichiers `HTML` avec les attributs `Thymeleaf`.

+ Ces modèles écrits en `Thymeleaf` ressemblent et fonctionnent toujours comme du HTML classique.

### **Objectifs de Thymeleaf**

+ L'objectif principal de Thymeleaf est de vous offrir une manière agréable et facile à utiliser de créer des modèles.

+ Il prend en charge le traitement de `HTML, XML, JavaScript, CSS` et du texte brut prêt à l'emploi.

+ `Thymeleaf` est vraiment un moteur de modèles extensible. En fait, il s'agit d'un framework de moteur de modèles qui vous permet de créer et de personnaliser le traitement de vos modèles.

### **Informations sur Thymeleaf**
+ `Thymeleaf` s'intègre à `Spring 3, Spring 4, Spring 5` ainsi qu'à `Spring Boot`.
+ Au lieu de `JSP et JSTL`, nous allons utiliser `Thymeleaf`.
+ `Thymeleaf` prend en charge les fragments, c'est-à-dire des modèles plus petits que nous pouvons réutiliser dans l'application (nous en reparlerons plus tard).
+ Un exemple de fragments est un en-tête ou un pied de page.

### **Traitement des Thymeleaf**
+ `Thymeleaf` prend en charge la `Logique de modèle découplée`.
+ En d'autres termes, nous pouvons séparer les balises `Thymeleaf` de `HTML` et le moteur de modèle les traitera pour nous (nous en parlerons plus tard).

### **Fragments des thymeleaf**
+ Lorsque nous travaillons avec des modèles, nous devrons souvent inclure des parties d'autres modèles (par exemple, pieds de page, menus, etc.).
+ `Thymeleaf` a un attribut spécial th:fragment que nous pouvons utiliser pour définir le fragment.
+ Pour insérer un fragment, utilisez l'expression de fragment `~{...}`.
+ Les fragments peuvent être sélectionnés par leur nom ou par le sélecteur CSS, la syntaxe est `~{templatename::selector}`
+ Par exemple `~{templatename:fragmnetname}`
+ Le gros avantage de fragment est que vous pouvez écrire vos fragments parfaitement affichables par un navigateur.
+ Nous pouvons transmettre des paramètres à des fragments et les insérer en fonction d'une condition spécifique (nous en parlerons plus tard dans le cours).

### **Internationalisation de Thymeleaf et Spring (i18N)**
+ Au lieu de cela, ces éléments sont stockés en dehors du code source et récupérés dynamiquement.
+ De ce fait, la prise en charge de nouvelles langues ne nécessite pas de recompilation de votre application.
+ Il peut être localisé rapidement et efficacement.
+ Par défaut, une application `Spring Boot` recherchera les fichiers de messages contenant les clés et valeurs d'internationalisation dans le répertoire `src/main/resources`.
+ Le fichier des paramètres régionaux par défaut portera le nom « messages.properties » et les fichiers pour chaque paramètre régional seront nommés « messages_XX.properties », où « XX » est le code des paramètres régionaux.


### **Demander une interception**
+ Nous utiliserons une classe qui implémente l'interface `HandleInterceptor` pour effectuer des actions avant le traitement, après le traitement ou après l'achèvement (lorsque la vue est rendue) d'une requête.
+ Les intercepteurs peuvent être utiles pour des problèmes transversaux et pour éviter le code répétitif comme : vérifier si un utilisateur dispose d'une autorisation d'administrateur, vérifier la sécurité, modifier les paramètres utilisés globalement dans le modèle Spring, etc.
+ Pour créer un intercepteur personnalisé, nous devons implémenter l'interface `HandlerInterceptor`.
+ L'interface `HandlerInterceptor` définit trois méthodes qui offrent suffisamment de flexibilité pour effectuer toutes sortes de pré-traitements et de post-traitements.
+ Ces méthodes sont:
    + `preHandle(..)` : appelé avant l'exécution du handle réel, et renvoie une valeur booléenne pour interrompre ou continuer l'exécution de la requête. Par exemple, lorsqu'un utilisateur tente d'accéder à une page sécurisée, vous pouvez rediriger l'utilisateur vers la page de connexion.
    + `postHandle(..)` : appelé après l'exécution du gestionnaire.
    + `afterCompletion(..)` : appelé une fois la requête complète terminée.

### **Résolveur de paramètres régionaux**
+ `LocaleResolver` est une interface qui permet la résolution des paramètres régionaux en fonction de la demande, de la réponse, des cookies, etc.
+ Par défaut, Spring utilise `AcceptHeaderLocaleResolver`, c'est-à-dire qu'il utilise la locale fournie par l'en-tête HTTP.
+ Nous avons effectivement utilisé `FixedLocaleResolver`, donc définissez les paramètres régionaux sur une valeur fixe en ajoutant la propriété dans `application.properties`.
+ Nous allons utiliser `SessionLocaleResolver` pour définir les paramètres régionaux avec du code.
+ Cette implémentation utilise un attribut local dans la session de l'utilisateur - Ceci est plus approprié si l'application a besoin de sessions utilisateur.


+ `LocaleChangeInterceptor` est un intercepteur intégré qui permet de modifier les paramètres régionaux actuels à chaque requête.
+ Le changement de paramètres régionaux se fait à l'aide d'un paramètre de requête configurable. Le nom du paramètre par défaut est « locale ».
+ Pour que cela fonctionne, il nous suffit d'ajouter un paramètre, puis l'ensemble de l'application utilise des paramètres régionaux différents.

### **Récapitulatif de Thymeleaf**
+ Avec `Thymeleaf, HTML` peut être affiché correctement dans les navigateurs en tant que prototype statique, c'est-à-dire que nous pouvons prévisualiser `HTML` sans traiter de modèle.
+ `Thymeleaf` prend en charge les `fragments` - des modèles plus petits qui peuvent être réutilisés dans toute l'application.
+ `Thymeleaf` prend en charge la logique de modèle découplée.
+ Autrement dit, nous pouvons séparer les balises `Thymeleaf` de `HTML` et le moteur de modèle effectuera tout le traitement.
+ De cette façon, notre application est beaucoup plus facile à maintenir et les concepteurs n'ont pas besoin de connaître quoi que ce soit sur `Thymeleaf`.
+ Nous avons également utilisé le prétraitement d'expression.
+ Les expressions prétraitées sont exactement comme les expressions normales mais elles sont entourées de doubles traits de soulignement.
+ Le prétraitement est une exécution d'expressions exécutées avant l'exécution normale de l'expression.
+ Cela nous donne la possibilité de modifier une expression qui sera exécutée.
+ Cette fonctionnalité est très utile lorsque vous souhaitez utiliser des constantes dans des modèles.
+ Syntaxe des expressions de variables : `${...}`
    + Exemple : `${resultMessage}`
    + La variable `resultMessage` a été ajoutée comme attribut de modèle.
+ Syntaxe des expressions de message : `#{...}`
    + Exemple : `#{game.home}`
    + La propriété `game.home` a été définie dans le fichier `message.properties` que nous avons utilisé pour l'internationalisation.
+ Expressions d'URL de lien : `@{...}`
    + Exemple : `@play`
    + Il peut être utilisé pour les URL absolues et relatives.
+ Expressions de fragments : `~{...}`
    + Exemple : `~{fragments/head ::: headFragments}`
    + Utilisé pour insérer le fragment d'un autre modèle.
+ Les fragments peuvent être sélectionnés par leur nom ou par le sélecteur `CSS`, la syntaxe est `~{templatename::selector}` ou par la syntaxe du nom est `~{templatename::fragmentname}`.
+ Exemple de substitutions littérales : `|Créé par ${author}`
+ Les substitutions littérales permettent un formatage facile des chaînes contenant des valeurs de variables.
+ `Thymeleaf` a d'autres fonctionnalités que nous n'avons pas encore abordées.
+ Par exemple les littéraux, la concaténation de chaînes, les opérations arithmétiques, les opérations booléennes, les comparaisons, l'égalité, les opérateurs conditionnels, etc.
