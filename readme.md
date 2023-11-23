## **Programmes**

### **Section 1   :  Course Introduction**
### **Section 2   :  Install and Setup**
### **Section 3   :  New Spring 5 - Maven and your first project**
### **Section 4   :  New Spring 5 - Logging with SLF4J & Logback**
### **Section 5   :  New Spring 5 - Multi Module Spring Project**
### **Section 6   :  New Spring 5 - Lombok Introduction**
### **Section 7   :  New Spring 5 - Spring MVC**
### **Section 8   : New Spring 5 - Spring Boot 2 Introduction**
### **Section 9   : New Spring 5 - Spring Boot 2 And Thymeleaf 3**
### **Section 10  : New Spring 5 - Gradle Introduction**
### **Section 11  : New Spring 5 - Gradle Multi Module Project Setup**
### **Section 12  : Installation and Setup - Part1**
### **Section 13  : Introduction To Java EE**
### **Section 14  : OLD - Installation and setup Part2**
### **Section 15  : Introducing Spring Framework**
### **Section 16  : Introducing Spring MVC**
### **Section 17  : Bean Configuration**
### **Section 18  : Configuration Spring With Annotations**
### **Section 19  : OLD - Introducing MYSQL**
### **Section 20  : Working With Spring JDBC**
### **Section 21  : OLD - Spring MVC in depth - Part1**
### **Section 22  : OLD - Spring MVC in depth - Part2**
### **Section 23  : OLD - Spring MVC in depth- Part3(Form and Validation)**
### **Section 24  : OLD - IntelliJ Spring Section**
### **Section 25  : OLD - NEW spring 5 - Install and setup**
### **Section 26  : Extra Information - Source code, and other stuff**

<hr>

## **Aide-mémoire pour les annotations de Spring**

<hr>


### **Annotations importantes**

|annotations| descriptions                                                                                                                                                                                                                                                                                                                                  |
|-----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|`@Configuration`| **utilisé pour marquer une classe comme source des définitions du bean. Les beans sont les composants du système que vous souhaitez connecter ensemble. Une méthode marquée de l'annotation @Bean est un producteur de bean. Spring gérera le cycle de vie des beans pour vous et utilisera ces méthodes pour créer les beans.**              |
|`@ComponentScan`| **utilisé pour vous assurer que Spring connaît vos classes de configuration et peut initialiser correctement les beans. Cela permet à Spring d'analyser les packages configurés avec lui pour les classes @Configuration.**                                                                                                                   |
|`@Import `| **Si vous avez besoin d'un contrôle encore plus précis des classes de configuration, vous pouvez toujours utiliser @import pour charger une configuration supplémentaire. Celui-ci fonctionne même lorsque vous spécifiez les beans dans un fichier XML comme en 1999.**                                                                      |
|`@Component`| **Une autre façon de déclarer un bean consiste à marquer une classe avec une annotation @Component. Cela transforme la classe en bean Spring au moment de l'analyse automatique.**                                                                                                                                                            |
|`@Service`| **Marque une spécialisation d'un @Component. Il indique à Spring qu'il est sûr de les gérer avec plus de liberté que les composants classiques. N'oubliez pas que les services n'ont pas d'état encapsulé.**                                                                                                                                  |
|`@Autowired`| **Pour relier les parties de l'application ensemble, utilisez @Autowired sur les champs, les constructeurs ou les méthodes d'un composant. Le mécanisme d'injection de dépendances de Spring connecte les beans appropriés aux membres de la classe marqués par @Autowired.**                                                                 |
|`@Bean`| **Une annotation au niveau de la méthode pour spécifier un bean renvoyé à gérer par le contexte Spring. Le bean renvoyé porte le même nom que la méthode factory.**                                                                                                                                                                           |
|`@Lookup`| ** indique à Spring de renvoyer une instance du type de retour de la méthode lorsque nous l'invoquons.**                                                                                                                                                                                                                                      |
|`@Primary`| **donne une préférence plus élevée à un bean lorsqu'il existe plusieurs beans du même type.**                                                                                                                                                                                                                                                 |
|`@Required`| **montre que la méthode setter doit être configurée pour recevoir une injection de dépendance avec une valeur au moment de la configuration. Utilisez @Required sur les méthodes setter pour marquer les dépendances remplies via XML. Sinon, une BeanInitializationException est levée.**                                                    |
|`@Value`| **utilisé pour attribuer des valeurs aux champs des beans gérés par Spring. Il est compatible avec le constructeur, le setter et l'injection sur le terrain.**                                                                                                                                                                                |
|`@DependsOn`| **oblige Spring à initialiser d'autres beans avant celui annoté. Habituellement, ce comportement est automatique, basé sur les dépendances explicites entre les beans. L'annotation @DependsOn peut être utilisée sur n'importe quelle classe annotée directement ou indirectement avec @Component ou sur des méthodes annotées avec @Bean.** |
|`@Lazy `| **fait en sorte que les beans s'initialisent paresseusement. L'annotation @Lazy peut être utilisée sur n'importe quelle classe annotée directement ou indirectement avec @Component ou sur des méthodes annotées avec @Bean.**                                                                                                                |
|`@Scope`| **utilisé pour définir la portée d'une classe @Component ou d'une définition @Bean et peut être soit un singleton, un prototype, une requête, une session, une session globale ou une portée personnalisée.**                                                                                                                                 |
|`@Profile`| **ajoute des beans à l'application uniquement lorsque ce profil est actif.**                                                                                                                                                                                                                                                                                                                                         |

<hr>

### **Annotations importantes sur Spring Boot**
|annotations| descriptions |
|-----------|--------------|
|`@SpringBootApplication`| **L'une des annotations les plus basiques et les plus utiles est @SpringBootApplication . C'est du sucre syntaxique permettant de combiner d'autres annotations que nous examinerons dans un instant. @SpringBootApplication est constitué des annotations @Configuration , @EnableAutoConfiguration et @ComponentScan combinées, configurées avec leurs attributs par défaut.**         |
|`@Configuration et @ComponentScan`| **Les annotations @Configuration et @ComponentScan que nous avons décrites ci-dessus permettent à Spring de créer et de configurer les beans et les composants de votre application. C'est un excellent moyen de dissocier le code de logique métier réel du câblage de l'application.**         |
|`@EnableAutoConfiguration`| **Désormais, l' annotation @EnableAutoConfiguration est encore meilleure. Cela fait deviner à Spring la configuration en fonction des fichiers JAR disponibles sur le chemin de classe. Il peut déterminer quelles bibliothèques vous utilisez et préconfigurer leurs composants sans que vous leviez le petit doigt. C'est ainsi que fonctionnent toutes les bibliothèques spring-boot-starter. Cela signifie que c'est une bouée de sauvetage majeure à la fois lorsque vous commencez tout juste à travailler avec une bibliothèque et lorsque vous savez et faites confiance à la configuration par défaut pour être raisonnable.**         |

<hr>

### **Annotations Web importantes de Spring MVC**
|annotations| descriptions                                                                                                                                                                                                                                                                                                                                                                                                                   |
|-----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|`@Controller`| **marque la classe comme contrôleur Web, capable de gérer les requêtes HTTP. Spring examinera les méthodes de la classe marquées de l'annotation @Controller et établira la table de routage pour savoir quelles méthodes servent quels points de terminaison.**                                                                                                                                                               |
|`@ResponseBody`| **@ResponseBody est une annotation utilitaire qui permet à Spring de lier la valeur de retour d'une méthode au corps de la réponse HTTP. Lors de la création d'un point de terminaison JSON, il s'agit d'un moyen incroyable de convertir comme par magie vos objets en JSON pour une consommation plus facile.**                                                                                                              |
|`@RestController`| **Ensuite, il y a l'annotation @RestController, une syntaxe pratique pour @Controller et @ResponseBody ensemble. Cela signifie que toutes les méthodes d'action de la classe marquée renverront la réponse JSON.**                                                                                                                                                                                                             |
|`@RequestMapping(method = RequestMethod.GET, value = "/path")`| **L'annotation @RequestMapping(method = RequestMethod.GET, value = "/path") spécifie une méthode dans le contrôleur qui doit être responsable du traitement de la requête HTTP au chemin donné. Spring travaillera sur les détails de mise en œuvre de la façon dont cela est fait. Vous spécifiez simplement la valeur du chemin sur l'annotation et Spring acheminera les requêtes vers les méthodes d'action appropriées.** |
|`@RequestParam(value="name", defaultValue="World")`| **Naturellement, les méthodes gérant les requêtes peuvent prendre des paramètres. Pour vous aider à lier les paramètres HTTP aux arguments de la méthode d'action, vous pouvez utiliser l'annotation @RequestParam(value="name", defaultValue="World"). Spring analysera les paramètres de la requête et placera ceux qui conviennent dans les arguments de votre méthode.**                                                   |
|`@PathVariable("placeholderName")`| **Une autre façon courante de fournir des informations au backend consiste à les encoder dans l'URL. Ensuite, vous pouvez utiliser l'annotation @PathVariable("placeholderName") pour amener les valeurs de l'URL vers les arguments de la méthode.**                                                                                                                                                                                                                                                                                                                                                                                                                           |



