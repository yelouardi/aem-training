pipeline {
    agent any
    tools {
        maven 'maven-3-5-3'
    }

    stages {
        stage('Checkout Git') {
            steps {
              git branch: '${releaseToFinish}', credentialsId: 'GIT_AEM', url: 'https://${url}'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
         stage('Relase Finish') {
            steps {
	            sh 'mvn clean jgitflow:release-finish'
                }
            }
        
        stage('Push Release '){
            steps {
		       withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        sh 'git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${url}'	 
                sh 'git push origin develop'
		        //merge master
		        sh 'git push origin master'
                //tags
		        sh 'git push origin --tags'
                sh 'git push origin --delete ${releaseToFinish}'

		}
          }
      }
        
    }
}
