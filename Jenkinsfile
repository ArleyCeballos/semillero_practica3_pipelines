pipeline {
   gent any
    stages {
      stage('SCM') {
             git 'https://github.com/Arleydevco/semillero_practica3_pipelines.git'
          }
          stage('SonarQube analysis') {
            withSonarQubeEnv('sonar-scanner') { // Will pick the global server connection you have configured
                 bat './gradlew sonarqube'
               }
            }
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
               bat 'gradlew.bat sonarqube'
            }
        }
      }
   }
}
