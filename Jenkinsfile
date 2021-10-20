
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
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
                echo 'Deploy the project on docker with wsl2'
                sh 'docker build --tag=dev_payara .'
                sh 'docker-compose up -d'
            }
        }
    }
}
