# Cloud

#### 项目介绍
common:  公共服务  
│  │  ├─auth-service------------------认证服务中心  
│  │  ├─common-util------------------公共工具包    
  
  
registry: 服务注册中心  

config:  配置中心

gateway:  服务网关中心

zipkin: 微服务调用链监控 

monitor: 微服务监控    

  
  
generator: 数据服务中心  

provider:  
 
│
│  │  ├─provider-usc------------------用户服务中心  

│  │  ├─provider-tsc------------------终端服务中心


  
provider-api:    
│  │  ├─provider-usc-api------------------用户服务中心API  


 　　

 

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
用户服务中心：provider-usc

终端服务中心：provider-tsc



#### 开发IDE
IntelliJ IDEA2018  

  
  
#### 安装教程

1.先后启动：registry、config；   
  
2.启动Zipkin    
启动方式：java -jar zipkin.jar  

3.启动gateway、monitor、auth-service、common-util  

4.启动服务:provider-usc、provider-tsc  

注：以上服务均在IDEA中启动，除了Zipkin。
  
  
#### 使用说明

1. 服务注册中心：http://localhost:1001/
2. 服务监控：http://localhost:5000/#/applications
3. zipkin: http://localhost:9411/zipkin/
4. 消息中间件：http://localhost:15672/#/
5. 查看API文档:http://localhost:1101/swagger-ui.html
6. 测试连接服务：http://localhost:2102/connect

 


#### 