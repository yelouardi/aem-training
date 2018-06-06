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
		    sh 'git branch -D release-1.1.0'
	            sh 'mvn clean jgitflow:release-start -DdevelopmentVersion=${developmentVersionParam} -DreleaseVersion=${releaseVersionParam} -DlocalOnly=true -Doffline=true'
                }
            }
        
        stage('Push Release '){
         steps {
		 withCredentials([usernamePassword(credentialsId: '${credentialsId}', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		 sh 'git remote set-url origin ${PROTOCOL_URL_VSTS}${USER_VSTS}:${PWD_VSTS}@${url}'	 
		 sh 'git push --set-upstream origin release-${releaseVersionParam}'
		}
          }
      }
        
    }
}
