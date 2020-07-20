##### springMVC 学习笔记

1. sprigMVC是对servlet的封装，全局只有一个DispatcherServlet

2. 配置的核心 

3. springMVC url-pattern的方式及区别：

   * 带后缀，比如*.action *.do
   * /  rest风格，不会拦截.jsp的请求，但是会拦截.html等静态资源
   * /* 拦截所有请求，包括jsp  当要跳转jsp时，一般不会有专门的控制器来处理，所以可能出现404

4. 返回：ModelAndView对象（封装数据和页面信息）

   *  modelAndView.addObject(attributeName,attributeValue)

   addObject方法其实是向请求域中request.setAttribute(attributeName,attributeValue)

   * modelAndView.setViewName()返回视图名称

5. 通过xml配置扫面bean的路径

6. 配置视图解析器 ，配置视图所在文件夹路径和后缀

7. 三大核心件 视图解析器，处理器映射器，处理器适配器

   * <mvc:annotation-driven>

8. mvc处理请求的流程(问题：handlerAdapter做什么？)

9. mvc处理请求的流程

10. mvc的9大组件

11. restful风格是什么？

12. 过滤器、拦截器、监听器

    * 过滤器、拦截器是javaee的标准组件，可以配置在web.xml中
    * 监听器是servlet、mvc自己的组件

13. springMVC文件上传

14. springMVC异常处理

15. maven compiler编译传递真是参数名称配置

16. spring中aware和postProcessor的作用

17. 3个adapter对象选择时机

    * 实现HttpRequestHandler
    * handler
    * handlerMethod的实例

18. mvc9大组件加载的套路

19. @ModelAttribute作用InitBinder作用

20. dispatcherServlet是启动SpringMVC，contextLoadListener启动spring

21. spring 各jar包的作用

22. jpa配置及使用

23. jpa操作数据库的五种方式

    * 继承JapRepository,JpaSpecificationExecutor接口，使用封装好的方法
    * 使用jpql
    * 自定义sql
    * 方法名规则  以findBy，countBy，deleteBy等开头+属性+查询方式（like，等于。默认是等于）
    * service传入dao层的条件不确定，把service拿到的信息封装成一个Specifacation对象传给dao层

24. Optional jdk1.8的类

25. jpa生成dao代理对象，利用spring生命周期中的哪一步



