// @Library('jenkins-shared@tst-main') _

// commonEnv()
// envCallingFunction('naveen-sys2')

pipeline {
    agent any
    triggers {
        githubPush()  // Automatically trigger on PR updates
    }
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                checkout scm
            }
        }
        // stage('Build') {
        //     steps {
        //         echo 'Building project...'
        //         sh 'mvn clean package' // Modify as needed
        //     }
        // }
        // stage('Test') {
        //     steps {
        //         echo 'Running tests...'
        //         sh 'mvn test' // Modify as needed
        //     }
        // }
    }
    // post {
    //     success {
    //         script {
    //             githubNotify context: 'Jenkins PR Check', status: 'SUCCESS', description: 'Build Passed'
    //         }
    //     }
    //     failure {
    //         script {
    //             githubNotify context: 'Jenkins PR Check', status: 'FAILURE', description: 'Build Failed'
    //         }
    //     }
    // }
}
