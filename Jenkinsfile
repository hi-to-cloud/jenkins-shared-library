// @Library('jenkins-shared@tst-main') _

// commonEnv()
// envCallingFunction('naveen-sys2')

pipeline {
    agent any
    environment {
        PR_URL = "${env.CHANGE_URL}"  // Extract PR URL (for GitHub PRs)
    }
    stages {
        stage('Greetings') {
            steps {
                echo 'Hi From NK!'
                echo "${PR_URL}"
            }
        }
        stage('Trigger New Pipeline'){
            steps{
                script{
                    def params = [
                        string(name: 'PR_URL', value: "${PR_URL}")
                    ]
                    build job: 'Multi-Demo-2.0', parameters: params, wait: true
                }
            }
        }
    }
}
