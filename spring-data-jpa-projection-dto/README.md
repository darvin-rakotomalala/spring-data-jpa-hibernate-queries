## Spring Boot Data JPA Hibernate - requêtes JPQL
Dans ce projet, nous allons voir un exemple de projection DTO avec JPQL, JPA et Hibernate à l'aide de Spring Boot et PostgreSQL.

### Contexte
---
Les DTO sont faciles à utiliser et constituent la projection la plus efficace pour les opérations en lecture 
seule. Ainsi, chaque fois que nous n'avons pas besoin de modifier les informations demandées, 
nous devrions préférer une projection DTO.

### Qu'est-ce qu'un DTO ?
---
DTO est une abréviation qui signifie Data Transfer Object. Un objet qui transporte des données entre les processus afin de réduire le nombre d'appels de méthode.
Ils sont utilisés en tant que classe spécialisée pour transférer les données que vous avez sélectionnées dans une requête de base de données.

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes :<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- PostgreSQL
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Dependances Maven
---
Dans ce tuto nous allons utiliser les dependances de base suivants :
* **Spring Web** - pour inclure Spring MVC et utilise le tomcat comme conteneur intégré par défaut.
* **Spring Data JPA** - sert à stocker et à récupérer des données entre une base de données relationnelle et un objet Java (POJO).
* **Spring Boot DevTools** - dépendance pour les rechargements automatiques ou le rechargement en direct des applications.
* **PostgreSQL** - est destiné au pilote JDBC pour connecter les applications clientes à la base de données PostgreSQL.
* **springdoc-openapi-ui** - dépendances pour la documentation de l'API swagger 3.

### Exemples
---
* Une entité Livre et une entité Auteur et une association many-to-one entre elles. Sur la page des résultats de la recherche, nous ne souhaitons afficher le titre, le prix et le nom de l'auteur.
* Gesion de commande client

### Exécuter et tester les API
---
Pour tester les APIs vous pouvez utiliser Postman, Swagger, curl ou n'importe quel client HTTP :
* L'API d'URL GET `/api/book` - renvoie une liste des livres à partir d'une projection DTO
* L'API d'URL POST `/api/placeOrder` - enregistrer une commande client
* L'API d'URL GET `/api/placeOrder` - renvoie une liste des commandes
* L'API d'URL GET `/api/getInfo` - renvoie une liste des commandes à partir d'une projection DTO

Voila ! dans ce repo nous avons réalisé un exemple de projection DTO avec JPA et Hibernate à l'aide de Spri Boo et PostgreSQL.