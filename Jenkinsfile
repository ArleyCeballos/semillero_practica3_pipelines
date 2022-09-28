pipeline {
   agent any
    stages {
     stage('Build') {
        steps {
            bat 'gradlew.bat clean build -x test'
        }
      }
      stage('Test') {
        steps {
            bat 'gradlew.bat test'
        }
      }
      stage('cobertura') {
        steps {
            bat 'gradlew.bat jacocoTestReport'
        }
      }
      stage('Sonar'){
        steps {
         withSonarQubeEnv(installationName:'sonarCloud') { // Will pick the global server connection you have configured
                    bat './gradlew sonarqube'
         }
      }
    }
  }
}
