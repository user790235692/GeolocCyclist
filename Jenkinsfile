
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
                sh 'mvn clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                sh 'mvn package'
                sh 'ls -a'

            }
        }
    }
}