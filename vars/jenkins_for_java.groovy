vars
| --- jenkins_for_java.groovy

// jenkinsForJava.groovy
def call(String repoUrl) {
  pipeline {
       agent any
       stages {
           stage("Checkout Code") {
               steps {
                   git branch: 'master',
                       url: "${repoUrl}"
               }
           }
           stage("Cleaning workspace") {
               steps {
                   sh "mvn clean"
               }
           }
 
       }
   }
}