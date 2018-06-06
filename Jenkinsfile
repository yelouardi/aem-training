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
		    sh 'git branch -d release-1.0.0'
	            sh 'mvn clean jgitflow:release-start -DdevelopmentVersion=${developmentVersionParam} -DreleaseVersion=${releaseVersionParam} -DlocalOnly=true -Doffline=true'
                }
            }
        
        stage('Push Release '){
         steps {
                sh 'git push origin ${branch}'
	            sh 'git push origin release-${releaseVersionParam}'
          }
      }
        
    }
}
