# Imagem base otimizada
FROM eclipse-temurin:17-jdk-jammy

# Diretório de trabalho no container
WORKDIR /app

# Copiar o arquivo JAR
COPY target/checkout-patio-0.0.1-SNAPSHOT.jar app.jar

# Executar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]
