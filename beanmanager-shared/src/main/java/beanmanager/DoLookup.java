package beanmanager;

import javax.enterprise.inject.spi.CDI;

public class DoLookup {
	public static final String getBeanManagerId(Class<?> beanClass) {
		StringBuilder sb = new StringBuilder();
		sb.append(CDI.current().getBeanManager().toString() + ": "
				+ CDI.current().getBeanManager().getClass());
		sb.append(CDI.current().getBeanManager().getBeans(beanClass));
		return sb.toString();
	}
}
