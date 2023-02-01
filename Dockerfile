FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_java_telegrambot_bot
ENV BOT_TOKEN=5754694236:AAGCKpLfRLcb3yR3r7g7Jq3jY2-x9vRAnYI
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]

