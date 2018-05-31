pipeline {
    agent any
    tools {
        maven 'maven-3-5-3'
        jdk 'jdk-8'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
