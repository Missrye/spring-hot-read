package org.deepocean.bootstrap;

import org.deepocean.config.AppConfig;
import org.deepocean.service.XService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author M.R.
 * @desc   test
 */
public class AnnotationConfigApplicationContextDemo {

	public static void main(String[] args) {
		// 实例化 ApplicationContext 容器对象
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("======= Application test start... =======");

		System.out.println(ac.getBean(XService.class));
	}
}
