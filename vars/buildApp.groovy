import org.devops.Utils

def call(String appName) {

    def utils = new Utils()

    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    echo utils.printMessage("Building ${appName}")
                }
            }

        }
    }

}
