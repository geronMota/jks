pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Baixando código do GitHub'
                git 'https://github.com/geronMota/jks.git'
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

        stage('Archive Reports') {
            steps {
                echo 'Arquivando relatórios de teste'
                // Publica os relatórios JUnit para visualização no Jenkins
                junit '**/target/surefire-reports/*.xml'
                
                // Arquiva HTML/artefatos para download no Jenkins
                archiveArtifacts artifacts: 'target/cucumber-reports/*.html', allowEmptyArchive: true
            }
        }

    }

    post {
        always {
            echo 'Pipeline finalizada!'
        }
        success {
            echo 'Build e testes concluídos com sucesso!'
        }
        failure {
            echo 'Build ou testes falharam!'
        }
    }
}
