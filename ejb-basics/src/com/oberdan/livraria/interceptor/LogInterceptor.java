package com.oberdan.livraria.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {

	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception {
		long mills = System.currentTimeMillis();

		Object obj = context.proceed();
		String metodo = context.getMethod().getName();
		String classe = context.getTarget().getClass().getSimpleName();

		System.out.println(classe + "." + metodo + " -> tempo gasto: " + (System.currentTimeMillis() - mills));

		return obj;
	}

}
