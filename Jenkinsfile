
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
                sh 'mvn clean package'
            }
        }
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                sh 'mvn package'

            }
        }
        stage('Deploy') {
            steps {
                sh 'java -jar payara-micro.jar --deploy ./target/GeolocCyclist.war'
            }
        }
    }
}