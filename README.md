# HelloWorldApp

## Description
HelloWorldApp est un simple programme Java qui affiche "Hello World !!" à l'écran. Ce projet sert de démonstration pour la mise en place d'un environnement de développement Java complet, intégrant Maven, Git, GitHub, Jenkins et SonarQube.

## Objectif du projet
Ce projet a été créé dans le but de :
1. Démontrer la création d'un projet Java basique
2. Illustrer l'utilisation de Maven pour la gestion de projet
3. Montrer l'intégration avec Git et GitHub pour le contrôle de version
4. Présenter la configuration d'un pipeline CI/CD avec Jenkins
5. Introduire l'analyse de qualité de code avec SonarQube

## Prérequis
Pour exécuter ce projet, vous aurez besoin de :
- Java JDK 17 ou supérieur
- Maven 3.9 ou supérieur
- Git

## Installation et exécution

1. Clonez le dépôt :
   git clone [https://github.com/votre-username/HelloWorldApp.git](https://github.com/votre-username/HelloWorldApp.git)
2. Naviguez dans le répertoire du projet :
   `cd helloworldapp`
3. Compilez le projet avec Maven :
   `mvn clean install`
4. Exécutez l'application :
   `java -cp target/HelloWorldApp-1.0-SNAPSHOT.jar tech.abdukader.helloworldapp`

## Intégration continue
Ce projet utilise Jenkins pour l'intégration continue. Le pipeline Jenkins compile le code, exécute les tests et lance une analyse SonarQube à chaque push sur la branche principale.

## Analyse de code
SonarQube est utilisé pour l'analyse statique du code.

## Contribution
Les contributions à ce projet sont les bienvenues. N'hésitez pas à forker le projet et à soumettre vos pull requests.

## Licence
Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.
