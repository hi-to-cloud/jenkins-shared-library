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
                    echo "$NK"
                    echo "$TKN"
                    echo "$SETUP_CONTAINER"
                    echo "$DASHBOARD_LINK"
                }
            }
            stage("ENV"){
                steps {
                    script{
                        sh 'env'
                    }
                }
            }
        }
    }
}
