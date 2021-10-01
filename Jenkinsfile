
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                sh 'mvn package'
                sh 'ls -a'

            }
        }
    }
}