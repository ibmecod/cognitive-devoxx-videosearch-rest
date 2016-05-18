package wasdev.sample.servlet;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class HelloWorldApplication extends Application
{

	@Override
	public Set<Class<?>> getClasses()
	{
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HelloWorldResource.class);
		return classes;
	}

}

