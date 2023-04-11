pipeline {
    agent any
    environment {
        SRC_DIR = "/src"
    }
    stages {
        stage ("SETUP") {
            steps {
                echo 'Run SETUP stage from jenkins...'
                sh "chmod +x -R ${env.WORKSPACE}"
                sh "./src/setup.sh"
            }
        }
    }
}