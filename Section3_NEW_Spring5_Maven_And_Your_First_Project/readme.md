### **Aperçu des nouvelles fonctionnalités de Spring 5**
+ Les principales caractéristiques du framework spring 5 peuvent être résumées comme suit :
    + 1. `Mise à jour de la base JDK -` L'intégralité de la base de code du framework Spring est basée sur le niveau de code du cours Java 8. Par conséquent, Java 8 est la configuration minimale requise pour fonctionner avec Spring 5.
    + 2. `Core Framework revision -` L'ensemble du framework de base a été révisé pour utiliser les nouvelles fonctionnalités introduites dans Java 8, par exemple les méthodes par défaut.
    + 3. `Mise à jour du conteneur principal -` Spring 5 prend en charge l'index des composants comme alternative à l'analyse du chemin de classe. L’essentiel pour les développeurs est que le temps de démarrage des grands projets printaniers sera considérablement réduit.
    + 4. `Programmation fonctionnelle avec kotlin` - Spring Framework 5 a introduit la prise en charge du langage JetBrains Kotlin. Kotlin est un langage orienté objet qui se concentre sur la programmation fonctionnelle.
    + 5. « Modèle de programmation réactive - » Reactive Streams est une spécification API développée par les ingénieurs de NetFlix, Red Hat, Oracle Twitter et Spray.io. Il fournit une API commune pour les implémentations de programmation réactive (similaire à « JPA pour Hibernate » où « JPA » est l'API et Hibernate est l'implémentation).
    + 6. `Améliorations des tests` - Spring 5 prend entièrement en charge `JUnit 5` pour écrire des tests et des extensions dans `JUNIT 5`.
    + 7. `Prise en charge des bibliothèques` - Certaines bibliothèques utilisées par Spring sont mises à niveau vers de nouvelles versions, par exemple la version Hibernate est mise à niveau vers 5.
    + 8. `Support interrompu` - Spring 5 a interrompu le support de certains packages mais aussi de certaines bibliothèques, par exemple `Velocity, Portlet, JasperReports` et quelques autres ne sont plus pris en charge lors de l'utilisation de Spring 5. Si vous prévoyez d'utiliser ceux-ci bibliothèques, il est recommandé d'utiliser `Spring framework 4`.


### **Qu'est-ce que Maven ?**
+ `Maven` est un outil de gestion de projets logiciels. Il est utilisé pour gérer l’automatisation de la construction d’un projet.
+ Il a été développé par « Apache Software Foundation », et il est écrit en Java et initialement publié en 2004.
+ Il est basé sur le concept de modèle objet de projet (POM)
+ Maven peut gérer la construction, le reporting et la documentation d'un projet à partir d'une source d'informations centrale.
+ L'objectif principal de Maven est de permettre à un développeur de comprendre l'état complet d'un projet dans les plus brefs délais.
+ Il le fait par:
    + Rendre le processus de construction facile.
    + Fournir un système de construction uniforme.
    + Fournir des informations de qualité sur le projet.
    + Fournir des lignes directrices pour le développement des meilleures pratiques.
    + Permettre une migration transparente vers de nouvelles fonctionnalités.

### **Fonctionnalités Maven**
+ Maven a une configuration de projet simple qui suit les meilleures pratiques. Il vous permet de démarrer un nouveau projet ou module en quelques secondes !
+ Il offre une utilisation cohérente dans tous les projets - Une fois que vous connaissez un projet Maven et sa structure, vous pouvez facilement prendre de la vitesse avec un autre projet Maven - Ce qui signifie en fin de compte moins de temps de montée en puissance pour les nouveaux développeurs arrivant sur un projet.
+ Il offre une gestion supérieure des dépendances, y compris la mise à jour automatique des dépendances.
+ Il est capable de travailler facilement avec plusieurs projets en même temps (nous en parlerons plus tard dans le cours).
+ Il dispose d'un référentiel vaste et croissant de bibliothèques et de métadonnées à utiliser par la boîte, et d'accords en place avec les plus grands projets Open Source pour une disponibilité en temps réel de leurs dernières au sein de votre projet.
+ Il propose une construction basée sur un modèle: Maven est capable de créer n'importe quel nombre de projets dans des types de sortie prédéfinis tels que des fichiers `JAR ou WAR`.
+ Il dispose également d'une gestion des dépendances : Maven encourage l'utilisation d'un référentiel central de « JAR » et d'autres dépendances.
+ Et bien plus encore. C'est plutôt sympa et cool.

### **Structure typique du projet Maven**

||                                                                                |
|-|--------------------------------------------------------------------------------|
|`src/main/java`| 	Sources des applications/bibliothèques                                        |
|`src/main/resources`| 	Ressources d'application/bibliothèque                                         |
|`src/main/filters`| 	Fichiers de filtre de ressources                                              |
|`src/main/webapp`| 	Sources d'applications Web                                                    |
|`src/test/java`| 	Sources de tests                                                              |
|`src/test/resources`| 	Ressources de test                                                            |
|`src/test/filters`| 	Tester les fichiers de filtre de ressources                                   |
|`src/it`| 	Tests d'intégration (principalement pour les plugins)                         |
|`src/assembly`| 	Descripteurs d'assemblage                                                     |
|`src/site`| 	Site                                                                          |
|`LICENSE.txt`| 	Licence du projet                                                             |
|`NOTICE.txt`| 	Mentions et attributions requises par les bibliothèques dont dépend le projet |
|`README.txt`| 	Lisez-moi du projet                                                           |

### **Alternatives**
+ `Apache Ant`
    + Encombrant à utiliser, ne sert plus à grand chose.
    + Écrit en java
    + Sorti en 2000
+ `Gradle`
    + Facile à utiliser
    + Le framework Spring l'utilise.
    + Écrit en java et Groovy (langage JVM).
    + Sorti en 2007.
    + Plus tard dans le cours, nous y reviendrons.

### **Cycle de vie des builds Maven**
+ Quel est le cycle de vie de build Maven ?
+ Maven est basé sur le concept central d'un cycle de vie de build. Cela signifie que le processus de construction et de distribution d'un artefact (projet) particulier est clairement défini. Pour la personne qui construit un projet, cela signifie qu'il suffit d'apprendre un petit ensemble de commandes pour construire n'importe quel projet Maven, et le POM garantira qu'il obtienne les résultats souhaités.
+ Il existe trois cycles de vie de build intégrés : par défaut, propre et site. Le cycle de vie par défaut gère le déploiement de votre projet, le cycle de vie propre gère le nettoyage du projet, tandis que le cycle de vie du site gère la création de la documentation du site de votre projet.
+ Le cycle de vie par défaut comprend les phases principales suivantes (toutes les phases ne sont pas répertoriées ici - juste les principales).

||                                                                                                                                                     |
|-|-----------------------------------------------------------------------------------------------------------------------------------------------------|
|`validate`| Valide que le projet est correct et que toutes les informations nécessaires sont disponibles                                                        |
|`compile`| Compile le code source du projet                                                                                                                    |
|`test`| Tester le code source compilé à l'aide d'un framework de tests unitaires (JUNIT par exemple)                                                        |
|`package`| Code des packages au format distribuable (par exemple JAR)                                                                                          |
|`verify`| Effectuer des contrôles sur les résultats des tests d'intégration                                                                                   |
|`install`| Installez le package dans le référentiel local pour l'utiliser dans d'autres projets locaux                                                         |
|`deploy`| Copie le package dans un référentiel distant pour le partager avec d'autres développeurs et projets (effectué dans l'environnement de construction) |

### **Plugins Maven**
+ `Maven` n'est en réalité qu'un framework de base d'une collection de plugins Maven.
+ En d'autres termes, les plugins sont l'endroit où se déroule la plupart de l'action réelle, les plugins sont utilisés pour : créer des fichiers « jar », créer des fichiers « war », compiler du code, du code de test unitaire, créer de la documentation de projet, et ainsi de suite.
+ Presque toutes les actions que vous pouvez imaginer effectuer sur un projet sont implémentées sous forme de plugin Maven.
+ Dans Maven, il existe des fonctionnalités de build et de reporting :
  + Les plugins de build seront exécutés pendant la construction, ils doivent être configurés dans l'élément `<build/>`.
  + Les plugins de reporting seront exécutés lors de la génération du site et ils doivent être configurés dans l'élément `<reporting/>`.


### **Plugins et objectifs Maven**
+ Tous les plugins doivent avoir un minimum d'informations requises : `groupId,artefactId et version`.
+ Chaque fois que vous souhaitez personnaliser la construction d'un projet Maven, cela se fait en ajoutant ou en reconfigurant des plugins.
+ Les plugins sont des artefacts qui fournissent des objectifs à Maven.
+ Un plugin peut avoir un ou plusieurs objectifs où chaque objectif représente une fonctionnalité de ce plugin.
+ Par exemple, le plugin `Compiler` a deux objectifs : compiler et testCompile.
+ L'objectif `compile` compile le code source de votre code principal.
+ Le goal `testCompile` compile le code source de votre code de test.