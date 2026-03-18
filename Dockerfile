# Imagem base com Java 17 (ajusta se você usa outra versão)
FROM openjdk:21-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado pelo Maven (ajusta o nome se for diferente)
COPY target/*.jar app.jar

# Expõe a porta que sua aplicação usa (se for web, geralmente 8080)
EXPOSE 8383

# Roda a aplicação
ENTRYPOINT