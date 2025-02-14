// @Library('jenkins-shared') _

// commonEnv()
// envCallingFunction('naveen-sys1')


pipeline {
    agent any
    environment {
        REPO_URL = "https://github.com/hi-to-cloud/jenkins-shared-library"  // Replace with actual repo URL
        PR_URL = "${env.CHANGE_URL ?: "${REPO_URL}/pull/${env.CHANGE_ID}"}"
    }
    stages {
        stage('Greetings') {
            steps {
                script {
                    echo 'Hi From NK!!'
                    echo "Pull Request URL: ${PR_URL}"
                }
            }
        }
        stage('Trigger New Pipeline') {
            steps {
                script {
                    def params = [
                        string(name: 'PR_URL', value: "${PR_URL}")
                    ]
                    build job: 'Multi-Demo-2.0/main', parameters: params, wait: true
                }
            }
        }
    }
}
