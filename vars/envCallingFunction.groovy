def call(){
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    hello()
                }
            }
            stage('NK'){
                steps {
                    envFromJenkinsfile()
                    echo 'envCallingFunction: ${UUID}'
                }
            }
        }
    }
}
