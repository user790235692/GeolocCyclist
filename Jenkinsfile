
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
                echo 'Deploy the project on WSL Ubuntu'
                sh 'sudo java -jar jetty-runner-9.4.0.M1.jar GeolocCyclist/target/GeolocCyclist.war'
            }
        }
    }
}