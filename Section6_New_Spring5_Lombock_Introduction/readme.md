### **Présentation de Lombok**
+ Project Lombok est une bibliothèque Java qui permet de générer du code passe-partout - cela nous permet de pimenter notre code Java !
+ A titre d'exemple, en Java, nous devons écrire des méthodes ``getter et setter`.
+ Avec d'autres langages `JVM` comme `Groovy et Kotlin`, nous les obtenons automatiquement.
+ Avec le projet Lombock, nous n'avons pas besoin d'écrire des `getters` et `setters` et de nombreuses autres méthodes très couramment utilisées comme `equals, hashcode() et toSring()`.
+ Ces méthodes seront générées par Lombok. Cela simplifie vraiment votre développement et vous rend plus productif.
+ Cela permet également de gagner beaucoup de temps en n'ayant plus à écrire de code passe-partout.
+ Cela vous permettra d'écrire moins de code et de garder votre code plus propre, spécialement avec les entités `JPA` que nous verrons plus en détail plus tard dans le cours.
+ Lombok utilise l'API du processeur `Annotation`.
+ Lorsque votre projet est compilé, Lombok génère du code pour vous.
+ Le code final compilé avec et sans Lombok est identique - mais comme vous le verrez, le fichier de code source est beaucoup plus propre.
+ Les IDE modernes comme IntelliJ prennent en charge le projet Lombok.
+ `@Getter`
    + Vous pouvez annoter n'importe quel champ pour laisser `Lombock` générer automatiquement le `getter` par défaut.
    + Un `getter` par défaut renvoie le champ et est nommé `getName` si le champ s'appelle name (ou `isName` si le type du champ est `boolean`).
+ `@Setter`
    + Un `setter` par défaut est nommé `setName` si le champ est appelé name, renvoie void et prend 1 paramètre du même type que le champ. Il définit simplement le champ sur cette valeur.
    + `@ToString` génère du code passe-partout pour la méthode `toString`.
    + `@EqualsAndHascode` générera les méthodes `equals` et `hashCode`.
    + `@RequireArgsConstructor` générera un constructeur avec les arguments requis.
    + `@sfl4j` générera un champ final statique privé pour `SLF4J logger`.
+ Il existe de nombreuses autres annotations mais nous en discuterons au fur et à mesure du cours.
+ `@Data`
    + Génère du code passe-partout pour `POJO (Plain Old Java Object)`.
    + Il combine `@Guetter, @Setter, @ToSrring, @RequiredArgsConstructor et @EqualsAndHashCode`.
    + Le constructeur n'est pas généré s'il a déjà été déclaré.


     