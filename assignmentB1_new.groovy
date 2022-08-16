pipeline {

    agent any

    stages {
        stage('Build') {

            steps {
                echo "this is my build stage"
            }
        }

        stage('Deploy') {

            steps {
                echo "this is my Deploy stage"
            }
        }

        stage('Test1') {

            when {
        branch 'master'
      }
            steps {
                echo "this is my stage test1"
            }
        }

        stage('Test2') {

            when {
        branch 'master'
      }
            steps {
                echo "this is my stage test2"
            }
        }
    }
}
