pipeline{
    agent any

    environment{
        SONAR_SCANNER = 'sonarscanner'
        SONAR_SERVER = 'sonarqube-server'
    }
    stages{
        stage('Checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/koushik2022/bookshop.git'
            }

        }

         stage('Build'){
             steps{
                  sh 'mvn clean package -DskipTests=true'
             }

         }

         stage('Run Tests'){
              steps{
                   sh 'mvn test'
              }

         }

         stage('Checkstyle Analysis'){
            steps{
                sh 'mvn checkstyle:checkstyle'
            }
         }

         stage('Sonar Analysis'){
            environment{
                scannerHome = tool "${SONAR_SCANNER}"
            }
            steps{
                withSonarQubeEnv("${SONAR_SERVER}"){
                    sh '''${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=bookshop \
                        -Dsonar.projectName=bookshop \
                        -Dsonar.projectVersion=1.0 \
                        -Dsonar.sources=src/ \
                        -Dsonar.java.binaries=target/test-classes/com/nilsoft/bookshop/ \
                        -Dsonar.junit.reportsPath=target/surefire-reports/ \
                        -Dsonar.jacoco.reportsPath=target/jacoco.exec \
                        -Dsonar.java.checkstyle.reportsPath=target/checkstyle-result.xml'''
                }
            }
         }
    }
}