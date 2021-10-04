## Prérequis
Afin de pouvoir exécuter mon projet vous devez avoir ces pré-requis sur votre machine:
  * Docker
  * JDK 8
  * Maven
 
### Installation
  1. Télécharger Docker pour Windows [ici](https://docs.docker.com/desktop/windows/install/)
  2. Suivre les étapes d'installation en cochant WSL2.
  3. Télécharger java [ici](https://www.oracle.com/java/technologies/downloads/#java8-windows)
  4. Télécharger et installer Maven [ici](https://mkyong.com/maven/how-to-install-maven-in-windows/)
 
### Lancement
  1. Après avoir installé Docker, Java et Maven.
  2. Taper `mvn clean build`
  3. Taper `mvn build`
  4. Taper `docker build -tag=dev_payara` une seul fois, par la suite l'image sera déja build.
  5. Taper `docker-compose up -d`
