#基于哪个镜像
FROM java:8

# 将本地文件夹挂载到当前容器
VOLUME /tmp

# 拷贝文件到容器
ADD eureka-0.0.1-SNAPSHOT.jar eureka.jar


# 开放8761端口
EXPOSE 8761

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/eureka.jar","--spring.profiles.active=peer2"]
