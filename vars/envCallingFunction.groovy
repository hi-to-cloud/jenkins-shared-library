def call(String SYSTEM_NAME){
    pipeline {
        agent any
        parameters {
            string(name:"SYSTEM_NAME", defaultValue: SYSTEM_NAME, description:'System to run on. Current option is '+ SYSTEM_NAME )
            string(name:"SYSTEM_NAME2", defaultValue:'SYSTEM_NAME2', description:'System to run on. Current option is $SYSTEM_NAME.')
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
                    echo "$SYSTEM_NAME"
                }
            }
            stage("ENV"){
                steps {
                    script{
                        sh 'env'
                        echo "--------------------"
                        def SYSTEM1 = sh "echo '$SYSTEM_NAME' | awk -F '-' '{print $NF}'"
                        echo "$SYSTEM1"
                        def SYSTEM = sh(script: "echo '${SYSTEM_NAME}' | awk -F '-' '{print \$NF}'", returnStdout: true).trim()
                        echo "$SYSTEM"
                    }
                }
            }
        }
    }
}
