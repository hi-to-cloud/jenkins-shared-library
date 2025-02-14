// @Library('jenkins-shared@tst-main') _

// commonEnv()
// envCallingFunction('naveen-sys2')

// pipeline {
//     agent any
//     environment {
//         PR_URL = "${env.CHANGE_URL}"  // Extract PR URL (for GitHub PRs)
//     }
//     stages {
//         stage('Greetings') {
//             steps {
//                 echo 'Hi From NK!'
//                 echo "${PR_URL}"
//             }
//         }
//         stage('Trigger New Pipeline'){
//             steps{
//                 script{
//                     def params = [
//                         string(name: 'PR_URL', value: "${PR_URL}")
//                     ]
//                     build job: 'Multi-Demo-2.0', parameters: params, wait: true
//                 }
//             }
//         }
//     }
// }

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
                    build job: 'Multi-Demo-2.0', parameters: params, wait: true
                }
            }
        }
    }
}

