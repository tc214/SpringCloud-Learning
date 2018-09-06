### 说明

#### 使用spring cloud security auth  

#### 资源服务和认证服务合并，不需要其他辅助服务  

#### 实现了客户端模式和密码模式  


####  
注：redis要设置无密码；


####  获取token:  
http://localhost:8080/oauth/token?grant_type=client_credentials&scope=select&client_id=client_1&client_secret=123456   
返回：
{"access_token":"498b1888-626f-4439-8651-5d7f6415795a","token_type":"bearer","expires_in":43199,"scope":"select"}

#### 获取订单：  
http://localhost:8080/order/1?access_token=498b1888-626f-4439-8651-5d7f6415795a
返回：  
order id : 1
