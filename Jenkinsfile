
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
                sh 'mvn package'
                bat 'cls'

            }
        }
    }
}