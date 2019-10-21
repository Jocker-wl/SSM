# SSM
架构搭建



1、首先新建一个Maven的空项目；

2、集成Spring：在pom文件中添加Spring相关依赖（引入jar包）。

​	  依赖添加完之后，需要创建配置文件。这里需要配置对java类的扫描，扫描base-package包或者子包下的所有java类，并把匹配的java类注册成Bean。

​	  