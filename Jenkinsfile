pipeline {
    agent any
    tools {
        maven 'maven-3-5-3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('Sonar'){
         steps {
                sh 'mvn sonar:sonar'
          }
      }
        
    }
}
