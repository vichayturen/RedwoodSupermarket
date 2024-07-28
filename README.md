# 红杉树超市

## 1 部署流程

### 1.1 MySQL数据库
```shell
docker run -itd --name mysql57 -p 3306:3306 -p 33060:33060 -e MYSQL_ROOT_PASSWORD="root" mysql:5.7
```
运行redwood.sql导入数据。
### 1.2 Redis
```shell
docker run -itd --name some-redis -p 6379:6379 redis
```

### 1.3 Minio
```shell
docker run -itd --name minio -p 9000:9000 -p 9001:9001 -e MINIO_ROOT_USER="admin" -e MINIO_ROOT_PASSWORD="admin123" bitnami/minio
```
1. 创建bucket：redwood_supermarket。把图片文件上传进去。
2. 设置bucket权限，匿名可读。
3. 创建accesskey和secretkey，复制到application.yml中。

### 1.4 前端工程
进入nginx目录，运行：
```shell
.\nginx
```

### 1.5 后端工程
maven打包运行本项目。

## TODO
- 添加elasticsearch检索服务
- 拆分为微服务
- 添加推荐系统
