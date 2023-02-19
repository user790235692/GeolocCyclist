## Prérequis
Afin de pouvoir exécuter mon projet vous devez avoir ces pré-requis sur votre machine:
  * Docker
  * JDK 8
  * Maven
 
### Lancement
  1. Après avoir installé Docker, Java et Maven.
  2. Taper `mvn clean install`
  4. Taper `docker build -tag=dev_payara .` une seul fois, par la suite l'image sera déja build.
  5. Taper `docker-compose up -d`
