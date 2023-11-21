### **Une introduction à la journalisation**
+ Qu'est-ce que la journalisation ?
+ Cas d'utilisation de journalisation.
+ Histoire.
+ API de journalisation et implémentations.

### **Qu'est-ce que la journalisation ?**
+ `Logging` conserve un enregistrement d'informations spécifiques provenant de l'exécution d'un programme.
+ `Logging` est l'un des outils les plus puissants de la boîte à outils d'un programme.
+ `Logging` vous donne des données montrant ce que fait votre code et vous permet de développer et de déboguer rapidement des logiciels. Une journalisation appropriée permet de répondre à presque toutes les questions sur l'exécution d'un programme.
+ Il y a deux aspects liés à l'augmentation de la visibilité sur les programmes que vous exécutez : le premier est la visibilité de votre code après son exécution et après que les gens utilisent le logiciel. La seconde est la visibilité de votre code une fois qu'il est exécuté et que les utilisateurs utilisent le logiciel. Les secondes sont la visibilité de votre code pendant le développement. La visibilité sur le comportement du code livré est tout aussi importante que la visibilité sur le comportement du code pendant le développement.
+ Avec une bonne journalisation en place, il est plus facile pour les autres développeurs de voir exactement ce que fait votre code.
+ Le premier et principal avantage de toute API de journalisation par rapport à « System.out.println » réside dans sa capacité à filtrer. Vous pouvez choisir ce que vous souhaitez afficher et ce que vous ne souhaitez pas afficher.
+ L'avantage de la journalisation est qu'il est possible de classer les instructions de journalisation selon des critères spécifiques choisis par le développeur.
+ La journalisation vous aidera également à voir comment « Spring » gère tout en interne. En d'autres termes, comment le conteneur à ressort démarre, etc. Nous en reparlerons plus tard.


### **Cas d'utilisation de journalisation**
+ Logiciel de débogage pendant le développement
+ Aide au diagnostic des bugs pendant la production - lorsque votre application est en ligne.
+ Traçage des accès à des fins de sécurité.
+ Création de données à usage statistique.
+ Quel que soit le cas d'utilisation, les journaux doivent être détaillés, configurables et fiables.


### **Histoire**
+ Historiquement, la journalisation Java était effectuée avec les instructions `System.out.println()`, `System.err.println() ou e.printStackTrace()`.
+ Les journaux de débogage étaient affichés dans `System.out` et les journaux d'erreurs dans `System.err`.
+ En production, les deux étaient redirigés : `System.out` était généralement supprimé et `System.err` était généralement envoyé vers un fichier journal des erreurs.


### **slf4j - L'API de journalisation**
+ Nous couvrirons la journalisation de notre base de code associée. L'accent sera mis sur la journalisation de ce dont nous avons besoin, sur la base des concepts liés à Spring sur lesquels nous travaillons.
+ Il y a 2 aspects d'un système de journalisation bien configuré : API et implémentation.
+ L'API Logging est ce qui sera utilisé directement au niveau de la couche application ; en d’autres termes, ce que vous allez coder. L'API Logging est la façade ou l'interface avec laquelle vous interagissez en tant que développeur.
+ L'implémentation de Logging est ce que votre API de journalisation utilisera en interne et effectuera des appels afin de faire fonctionner la journalisation.
+ L'API et la mise en œuvre sont requises. Ce n'est ni l'un ni l'autre.
+ `slf4j-api` est un exemple d'une bonne API de journalisation. Nous l'utiliserons sous peu.
+ L'utilisation de la bibliothèque slf4j comme couche API de journalisation d'application Java présente de nombreux avantages utiles.
+ Vous pouvez considérer slf4j comme une interface ou une façade Java qui nécessiterait une implémentation (UNE SEULE) au moment de l'exécution pour fournir les détails de journalisation réels, comme l'écriture sur STDOUT (console) ou dans un fichier, etc. beaucoup de travail pour vous, le développeur, pour vous lever et travailler.
### **Implémentation de la journalisation - Utilisation de la reconnexion**
+ Chaque implémentation de journalisation (également appelée liaison) a sa propre manière de configurer la sortie du journal, mais votre application restera agnostique et utilisera toujours la même API `org.slf4j.Logger`.
+ `Logback` est destiné à succéder au projet populaire `log4j`, reprenant là où `log4j` s'est arrêté.
+ `Logback` est une implémentation de journalisation fiable, rapide et flexible écrite en Java.
+ `Logback` est hautement configurable via des fichiers de configuration externes au moment de l'exécution. Il considère le processus de journalisation en termes de niveaux de priorités et propose des mécanismes pour diriger les informations de journalisation vers une grande variété de destinations, notamment une base de données, un fichier, une console, un courrier électronique, etc.
+ `Logback` est construit en utilisant maven.
+ `Logback` a trois composants principaux :
    + `loggers` : Responsable de la capture des informations de journalisation.
    + `appenders` : Responsable de la publication des informations de journalisation vers diverses destinations préférées.
    + `layouts` : Responsable du formatage des informations de journalisation dans différents styles.
+ `Logback` dispose également de filtres : basés sur une logique ternaire permettant de les assembler ou de les enchaîner pour composer une politique de filtrage complexe et arbitraire. Ils sont largement inspirés des iptables de Linux.


### **Avantages de la reconnexion**
+ Le comportement `Logging` peut être défini lors d'une exécution à l'aide d'un fichier de configuration.
+ Il utilise plusieurs niveaux, à savoir `TRACE, DEBUG, INFO, WARN, ERROR` qui contrôlent la granularité, la gravité et la verbosité des informations.
+ Le format de la sortie du journal peut être facilement modifié en implémentant l'interface Layout.
+ Le cible ou la destination des sorties de journaux ainsi que la stratégie d'écriture peuvent être modifiés en changeant d'implémentation de « l'interface Appender ».
+ `Logback` peut recharger automatiquement son fichier de configuration lors de la modification.
+ `Logback` prend en charge les configurations `xml et groovy`.

### **Pourquoi se connecter et non log4j**
+ `Logback` continue là où `log4j` s'arrête.
+ Grand nombre d'améliorations par rapport à `log4j`.
+ `logback et log4j` ont été développés par le même éditeur.
+ `Logback` a une implémentation plus rapide.
+ La classe `Logback Logger` implémente `slf4j` (zéro surcharge).
+ `Logback` a une documentation complète.
+ La configuration peut être effectuée via `XML ou groovy`.
+ Rechargement automatique des fichiers de configuration.
+ Suppression automatique des anciennes archives de journaux.
+ Filtres.
+ Et bien plus encore.

### **Utilisation de la connexion**
+ Comment trouver une dépendance dans le `dépôt central Maven`.
+ Comment ajouter une dépendance `logback` à un projet maven.
+ Comment télécharger la source et la documentation d'une dépendance.
+ Comment utiliser `logback`.