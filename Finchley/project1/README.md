# Cloud

#### 项目介绍
registry: 服务注册中心  

config:  配置中心

gateway:  服务网关中心

zipkin: 微服务调用链监控 

monitor: 微服务监控    

connect-service:连接服务  

terminal-service:终端服务　　

 

#### 软件架构
#####  支撑服务
服务注册中心：registry  

配置中心：config  

服务网关中心：gateway  

微服务调用链监控：zipkin 

微服务监控：spring boot admin

服务容错保护：Hystrix



#####  中间件
API文档： swagger2  

消息中间件：RabbitMq  

日志：Logstash  


#####  外部服务
连接服务：connect-service  

终端服务：terminal-service  



#### 开发IDE
IntelliJ IDEA2018  


#### 安装教程

1.先后启动：registry、config；   
  
2.启动Zipkin    
启动方式：java -jar zipkin.jar  

3.启动gateway、monitor   

4.启动服务:connect-service、terminal-service   

注：以上服务均在IDEA中启动，除了Zipkin。

#### 使用说明

1. 服务注册中心：http://localhost:1001/
2. 服务监控：http://localhost:5000/#/applications
3. zipkin: http://localhost:9411/zipkin/
4. 消息中间件：http://localhost:15672/#/
5. 查看API文档:http://localhost:1101/swagger-ui.html
6. 测试连接服务：http://localhost:2102/connect

 


#### 