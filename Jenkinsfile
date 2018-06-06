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
                 def releaseProjectCmd = "clean jgitflow:release-start "+
			    "-DdevelopmentVersion=${developmentVersionParam} "+
			    "-DreleaseVersion=${releaseVersionParam} "+
			    "-DlocalOnly=true -Doffline=true"

	            withCredentials([[$class: 'UsernamePasswordMultiBinding',
	            credentialsId: ${credentialsId},
                usernameVariable: 'USER_GIT',
                passwordVariable: 'PWD_GIT']]) {
                sh "${releaseProjectCmd}"
                sh "git remote set-url origin ${USER_GIT}:${PWD_GIT}@${PREFIX_URL_VSTS}/${url}"
                }
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
