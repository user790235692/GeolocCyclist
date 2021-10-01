
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
                sh 'mvn install -Dmaven.test.skip=true'
                sh ''
            }
        }
        stage('Deploy') {
            steps {
                sh 'java -jar /target/GeolocCyclist.war'
            }
        }
    }
}