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
                bat 'mvn clean install'
            }
        }
        
        stage('Sonar'){
         steps {
                bat 'mvn sonar:sonar  -Dsonar.host.url=http://sonar-1456940134.eu-west-1.elb.amazonaws.com  -Dsonar.login=85e4eeca1682a1736fe125a915fda46fd0d583ba'
          }
      }
        
    }
}
