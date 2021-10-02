
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
                sh 'ls'
                sh 'mvn jetty:run &'
                sh 'cd target && java -jar jetty-runner-9.4.43.v20210629.jar GeolocCyclist.war'
            }
        }
    }
}