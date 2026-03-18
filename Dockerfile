# Imagem base leve com Java 21
FROM eclipse-temurin:21-jdk-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado pelo Maven (ajusta o nome se não for exatamente esse)
COPY target/PraticandoAutomacao-1.0-SNAPSHOT.jar app.jar

# Expõe a porta que você quer usar (8383)
EXPOSE 8383

# Comando pra rodar o JAR (com -Djava.security.egd pra evitar delay em container)
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]