pipeline {
    agent any
     parameters {
            choice(name: 'Invoke_Parameters', choices:"Yes\nNo", description: "Do you whish to do a dry run to grab parameters?" )
    }
    tools {
        maven 'maven-3-5-3'
    }

    stages {
        stage('Checkout Git') {
            steps {
              git branch: '${branch}', credentialsId: 'GIT_AEM', url: 'https://${url}'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
         stage('Delete Relase Branch') {
            steps {
                script {
                    if ("${params.Invoke_Parameters}" == "Yes") {
		                sh 'git branch -D ${releaseVersionParam}'
                        }
                    }
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
		       withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        sh 'git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${url}'	 
		        sh 'git push --set-upstream origin release-${releaseVersionParam}'
		}
          }
      }
        
    }
}
