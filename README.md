# hi-springboot-nacos

spring boot nacos sample



## version

- openJDK 11
- gradle 6.9.4
- spring boot 2.7.17
- nacos server 2.2.2



## dependencies

```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web:2.7.17'
    implementation 'com.alibaba.boot:nacos-config-spring-boot-starter:0.2.12'
}
```



## nacos server

NACOS_SERVER_IP: server ip address

NACOS_AUTH_ENABLE: turn on auth system

NACOS_AUTH_TOKEN:  accessToken secret key (base64 string)

```sh
docker run --name nacos-test \
  -e MODE=standalone \
  -e NACOS_AUTH_ENABLE=true \
  -e NACOS_AUTH_TOKEN="MFFrQ3dhJENUajJjbG5MV3hNUSYxaVBKQnF6NFhPMW4=" \
  -e NACOS_AUTH_IDENTITY_KEY="YgjqYBD6gNj@y34T" \
  -e NACOS_AUTH_IDENTITY_VALUE="Z^DvAw89dfv&Z@-Q" \
  -e NACOS_SERVER_IP=194.0.11.88 \
  -p 11848:8848 \
  -p 12848:9848 \
  -d nacos/nacos-server:v2.2.2
```



