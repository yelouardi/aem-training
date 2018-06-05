pipeline {
    agent any
    tools {
        maven 'maven-3-5-3'
    }
    stages {
        stage('Checkout Git') {
            steps {
              git branch: '${branch}', credentialsId: '${credentialsId}', url: '${url}'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('Sonar'){
         steps {
                sh 'mvn sonar:sonar  -Dsonar.host.url=$GLOBAL_SONAR_URL -Dsonar.login=GLOBAL_SONAR_LOGIN'
          }
      }
        
    }
}
