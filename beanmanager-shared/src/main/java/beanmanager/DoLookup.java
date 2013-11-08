package beanmanager;

import javax.enterprise.inject.spi.CDI;

public class DoLookup {
	public static final String getBeanManagerId() {
		return CDI.current().getBeanManager().toString();
	}
}
