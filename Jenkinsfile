pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/koushik2022/bookshop.git'
            }

        }

         stage('Build'){
             steps{
                  sh 'mvn clean package'
             }

         }
    }
}