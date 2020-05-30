# Spring

## 架构历史

- 单一架构应用
- 垂直应用架构
- 分布式服务架构
- 流动计算架构

## Java主流框架技术演变

- JSP_Servlet_JavaBean
- MVC三层架构

## 核心解释

- Spring是IOC和AOP的容器框架

## IOC (Inversion of Control): 控制反转

- ApplicationContest是IOC容器的接口，可以通过此对象创建容器中的对象
- 对象在spring容器默认在创建完成时已经创建了，不是需要用的时候才创建，针对单例模式
- 对象在IOC中的存储都是单例的，如果需要多例需要修改属性
- 创建对象修改属性的时候通过setter方法实现
- 对象的属性是由getter setter方法决定的，而不是定义的成员属性

### DI与IOC

IOC是从容器的角度描述，而DI是从应用程序角度描述，也可以这样说，IOC是设计思想，而DI是具体的实现方式。


