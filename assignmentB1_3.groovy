pipeline {

    agent any

    parameters {
       string defaultValue: 'master', description: '''Enter any branch from below options :
       master
       test''', name: 'choice'
    }

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
        branch params.choice
      }
            steps {
                echo "this is my stage test1"
            }
        }

        stage('Test2') {

            when {
        branch params.choice
      }
            steps {
                echo "this is my stage test2"
            }
        }
    }
}
