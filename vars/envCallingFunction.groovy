def call(String SYSTEM_NAME){
    pipeline {
        agent any
        parameters {
            string(name:"SYSTEM_NAME", defaultValue:'sitf-'+'$SYSTEM_NAME', description:'System to run on. Current option is sitf-'+'$SYSTEM_NAME.')
        }
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
                    echo "$params.SYSTEM_NAME"
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
