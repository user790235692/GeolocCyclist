
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
                bat 'mvn package'
                bat 'cls'

            }
        }
        stage('Deploy') {
            steps {
                echo 'We deploy the project on a payara micro server'
                bat '/Users/Lucas/payara5/bin/asadmin start-domain --host=localhost --port=4848 --user=admin --passwordfile=/secure/place/for/passwords/domain1_password --secure=false deploy --force=true --name=myproject --contextroot= /Users/Lucas/.jenkins/workspace/GeolocCyclist target/*.war'
            }
        }
    }
}