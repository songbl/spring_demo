package com.sbl.ui;

import com.sbl.dao.IAccountDao;
import com.sbl.service.IAccountService;
import com.sbl.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * 获取spring的IOC核心容器，并根据id获取对象
     * ApplicationContext的三个常用的实现类：
     *  ClassPathXMLApplicationContext：可以加载类路径下的配置文件，要求配置文件必须在类路径下
     *  FlieSystemXmlApplicationContext：可以加载磁盘任意路径下的配置文件
     *  AnnotationCOnfigApplicationContext：用于读取注解创建的容器
     *
     *  核心容器的两个接口引发的问题：
     *      ApplicationContext：单例对象使用（常用此接口）。它在创建容器的时，创建的对象采用的策略是立即加载的方式，也就是只要一读取完配置文件，马上创建配置的对象
     *      BeanFactory：多例对象使用 。延迟加载，用的时候才会创建对象
     * @param args
     */
    public static void main(String[] args) {
        //1. 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2. 根据id获取Bean对象
        IAccountService aDao = ac.getBean("accountService3",IAccountService.class);
        System.out.println(aDao+"==");
        aDao.saveAccount();
    }
}
