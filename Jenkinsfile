
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
                sh 'JENKINS_NODE_COOKIE=dontKillMe nohup mvn jetty:run &'
                sh 'java -jar jetty-runner-9.4.43.v20210629.jar target/GeolocCyclist.war'
            }
        }
    }
}