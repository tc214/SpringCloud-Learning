http://localhost:1201/config-client/dev/master�������ʣ����أ�
{
"name":"config-client",
"profiles":[
"dev"
],
"label":"master",
"version":null,
"state":null,
"propertySources":[
{
"name":"https://github.com/tc214/config-repo-demo/config-client-dev.yml",
"source":{
"info.profile":"dev"}},

{"name":"https://github.com/tc214/config-repo-demo/config-client.yml",
"source":{
"info.profile":"default"}
}
]
}



http://localhost:2001/info ���أ�
{
    "profile": "default"
}
 