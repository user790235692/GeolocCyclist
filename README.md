## Préambule
Mon application Java J2E se build avec un Maven et s'exécuter sur un serveur (PAYARA).
Ma solution communique avec une base de donnée MongoDb qui peut également être administré avec Mongo-express.
Tout mon environnement est conteneurisé.



## Prérequis
Afin de pouvoir exécuter mon projet vous devez avoir ces pré-requis sur votre machine :
  * Docker
 
## Lancement
  1. Après avoir installé Docker
  2. Tapez `docker build -tag=dev_payara .` une seule fois, par la suite l'image sera déjà build.
  3. Tapez `docker-compose up -d`

## Lien utile
  1. [Mongo-express](http://www.localhost:8081)
  2. [Mon application Java](https://localhost:8181/sample)
  3. [Payara-admin](https://localhost:4848) (useName: admin, passWord: admin)
