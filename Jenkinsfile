
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build the project from the pom file'
                xcopy 'mvn package'
                sh 'ls -a'

            }
        }
    }
}