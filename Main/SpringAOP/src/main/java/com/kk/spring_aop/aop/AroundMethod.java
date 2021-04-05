package com.kk.spring_aop.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("Method name : " + invocation.getClass().getName());
		System.out.println("Method arguments :" + Arrays.toString(invocation.getArguments()));

		System.out.println("Before Method called");
		Object result = null;
		try {
			result = invocation.proceed();
			System.out.println("Before after method called");

		} catch (IllegalArgumentException e) {
			System.out.println("Throw exception in Around Method");
		}
		return result;
	}

}
