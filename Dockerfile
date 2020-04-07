FROM openjdk
MAINTAINER taolong.hong taolong.hong@ubtrobot.com
ADD ${project.build.finalName}.jar app.jar
#入口的命令，不用管，可以被覆盖，直接用ENTRYPOINT
CMD ["java", "-version"]
ENTRYPOINT ["java", "-jar", "app.jar"]