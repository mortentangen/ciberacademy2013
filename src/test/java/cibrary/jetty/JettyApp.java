package cibrary.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;

public class JettyApp {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8888);
		LoggerContext loggercontext = (LoggerContext) LoggerFactory.getILoggerFactory();
		JoranConfigurator jc = new JoranConfigurator();
		jc.setContext(loggercontext);
		loggercontext.reset(); // override default configuration
//		loggercontext.putProperty("application-name", "cibrary");
//		jc.doConfigure("classpath:logback-test.xml");
		
		WebAppContext context = new WebAppContext();
		context.setResourceBase("src/main/webapp");
		context.setContextPath("/cibrary");
		server.setHandler(context);
		server.start();
		server.join();
	}

}
