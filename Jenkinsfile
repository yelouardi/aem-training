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
        
         stage('Relase Start') {
            steps {
	            sh 'mvn clean jgitflow:release-start -DdevelopmentVersion=${developmentVersionParam} -DreleaseVersion=${releaseVersionParam} -DlocalOnly=true -Doffline=true'
                }
            }
        
        stage('Push Release '){
         steps {
                sh "git push origin develop"
	            sh "git push origin release-${releaseVersionParam}"
          }
      }
        
    }
}
