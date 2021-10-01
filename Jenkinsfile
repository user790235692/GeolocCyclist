
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
                bat 'mvn clean package'
            }
        }
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                bat 'mvn package'
                bat 'cls'

            }
        }
        stage('Deploy') {
            steps {
                echo 'We deploy the project on a payara micro server'
                bat 'java -jar payara-micro.jar --deploy ./target/GeolocCyclist.war
            }
        }
    }
}