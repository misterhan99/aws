#基于哪个镜像
FROM java:8

# 将本地文件夹挂载到当前容器
VOLUME /tmp

# 拷贝文件到容器
ADD provider-0.0.1-SNAPSHOT.jar provider.jar

EXPOSE 9001

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/provider.jar"]
