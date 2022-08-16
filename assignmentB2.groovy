<<<<<<< HEAD
pipeline {

    agent any

    stages {
      stage('Main_Test')
      {
        parallel {

      

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
    }
=======
pipeline {

    agent any

    stages {
      stage('Main_Test')
      {
        parallel {

      

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
    }
>>>>>>> test
}