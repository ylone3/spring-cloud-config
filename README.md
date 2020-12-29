# spring-cloud-config
配置中心，配置文件放置在github上。两部分，server需要部署到自己服务器；client是使用demo


server:
需要配置好配置文件放置的github仓库地址:
appliciation.yml
spring:
  application:
    name: global-config-server
  cloud:
    config:
      server:
        git:
          uri:配置文件放置的github仓库地址
          username: 登录账户
          password: 登录密码
 在git上创建配置中心仓库后，在服务器部署server项目。
 
 client：
 bootstrap.yml
 配置server部署的域名，项目名称，当前环境(可以在应用服务器上面指定)，分支。
 
