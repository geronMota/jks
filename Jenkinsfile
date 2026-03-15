pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Baixando código do GitHub'
            }
        }

        stage('Build') {
            steps {
                echo 'Compilando projeto'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Executando testes'
                bat 'mvn test'
            }
        }

    }
}
