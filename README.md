# tp-springboot

Projet de Quentin VERDER TP SpringBoot pour le rendu final de cours de Java.

## Installation

Pour installer le projet, il suffit de cloner le projet sur votre machine.

```bash
git clone
```

Installer les dépendances Maven.

```bash
mvn install
```

## Configuration

Pour configurer la connection avec les bases de données, il suffit de modifier le fichier `application.properties` dans le dossier `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<databaseName>
spring.datasource.username=<databaseUser>
spring.datasource.password=<databasePassword>
```

## Utilisation

Pour lancer le projet, il suffit de lancer la commande suivante.

```bash
mvn spring-boot:run
```

## Schema de base de données

```mermaid
classDiagram
    class Address {
        id int
        number int
        street varchar
        zip_code int
        city varchar
    }
    class Animal {
        id int
        birth date
        color varchar
        petstore_id int
    }
    class Cat {
        chip_id varchar
    }
    class Fish {
        living_env FishLivingEnv
    }
    class Petstore {
        id int
        name varchar
        managerName varchar
    }
    class Produit {
        id int
        name varchar
        price double
        petstore_id int
    }
    
    Petstore "N" -- "N" Produit
    Petstore "1" -- "1" Address
    Petstore "N" -- "N" Animal
    Animal <|-- Cat
    Animal <|-- Fish
```
