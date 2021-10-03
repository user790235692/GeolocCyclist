
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
                sh 'mvn clean package'
                sh 'mvn clean'
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
                sh 'nohup mvn jetty:run'
                sh 'java -jar jetty-runner-9.4.9.v20180320.jar target/GeolocCyclist.war'
            }
        }
    }
}