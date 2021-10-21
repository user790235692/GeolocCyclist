
pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                echo 'Cleaning the project'
                sh 'mvn clean package -Dmaven.test.skip'
                sh 'mvn clean '
            }
        }
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                sh 'mvn package -Dmaven.test.skip'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy the project on docker with wsl2'
                sh 'docker build --tag=dev_payara .'
                sh 'docker-compose up -d'
                sh 'yes y | docker image prune -a'
            }
        }
        stage('UnitTest') {
            steps {
                echo 'Test the UI with selenium'
                echo 'We wait to make sur the container runing'
                sh 'sleep 20'
                sh 'mvn -Dtest=GetHeaderResponseTest test'
            }
        }

        stage('SeleniumTest') {
            steps {
                echo 'Test the UI with selenium'
                sh 'mvn -Dtest=AddUserTest test'
            }
        }
    }
}
