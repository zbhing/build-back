FROM openjdk:17-jdk-alpine
VOLUME /tmp

ADD module-system-1.0-SNAPSHOT.jar  sysV1 /
ADD common-core-1.0-SNAPSHOT.jar  comom-core /
#相当于在容器中用cmd命令执行jar包  指定外部配置文件
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-k8s-template-v1.jar"]