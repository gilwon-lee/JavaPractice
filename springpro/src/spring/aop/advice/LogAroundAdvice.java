package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("�� �ڿ��� ����� ����");
		
		long start = System.currentTimeMillis();
//		Object result =  method.invoke(exam, args);
		Object result = invocation.proceed();
		
		long end = System.currentTimeMillis();
		String message = (end-start)+ "ms �ð�" ;
		System.out.println(message);
		
		return result;
	}
	
}
