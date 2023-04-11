pipeline {
    agent any
    environment {
        SRC_DIR = "/src"
    }
    stages {
        stage ("SETUP") {
            steps {
                echo 'Run SETUP stage from jenkins...'
                sh "${SRC_DIR}/setup.sh"
            }
        }
    }
}