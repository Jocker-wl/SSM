# SSM
架构搭建



1、首先新建一个Maven的空项目；

2、集成Spring

​	  在pom文件中添加Spring相关依赖（引入jar包）。

​	 创建applicationContext.xml配置文件。这里需要配置对java类的扫描，扫描base-package包或者子包下的所有java类，并把匹配的java类注册成Bean。

​	  修改web.xml配置文件。需要添加监听器ContextLoaderListener，ContextLoaderListener实现了接口ServletContextListener接口，作用是在启动web容器时，自动装配applicationContext.xml配置文件的配置信息。

3、集成SpringMVC框架

​	  首先在pom文件中添加SpringMVC相关依赖；

​	  创建SpringMVC的配置文件spring-mvc.xml，在配置文件中配置好需要扫描的包，会扫描所有的controller类，并将匹配的controller类注册成bean。开启注解。配置视图解析器。

​	  在web.xml配置文件中添加DispatcherServlet配置。DispatcherServlet是前端控制器，主要用于拦截匹配的请求，拦截匹配的规则要自己定义。配置SpringMVC需要加载的配置文件（spring-mvc.xml）路径。设置具体的拦截匹配规则。

4、集成Mybatis框架

​	  首先添加pom依赖。

​	  添加properties配置文件，主要是将一些常量配置在里面，驱动名、连接信息、用户名、密码

​	  

​	  