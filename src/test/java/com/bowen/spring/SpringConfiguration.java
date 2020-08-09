package com.bowen.spring;


import com.bowen.spring.annotation.Bean;
import com.bowen.spring.annotation.ComponentScan;
import com.bowen.spring.annotation.Configuration;

@Configuration //可以省略不写，因为2中代码直接传入了该类
@ComponentScan("com.bowen.spring")
public class SpringConfiguration {
    //以下可以不写，即该类可以为空
 /**   Bean 一般是创建外部对象，如源码中的类的实例化
 *      作用：用于把当前方法的返回值作为bean对象存入spring的ioc容器中
 *      属性:
*          name:用于指定bean的id。当不写时，默认值是当前方法的名称
*/

    //该bean使用下面的bean
    //1.上面传参，下面必须写bean
    @Bean()
    public HelloWorld createQueryRunner(){
        return new HelloWorld("dd");
    }

}