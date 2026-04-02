def call(String appName) {

    pipeline {
        agent any

        stages {

            stage('Build') {
                steps {
                    echo "Building ${appName}"
                }
            }

            stage('Test') {
                steps {
                    echo "Testing ${appName}"
                }
            }

            stage('Deploy') {
                steps {
                    echo "Deploying ${appName}"
                }
            }

        }
    }

}
