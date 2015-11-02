package com.github.tsar_industries.butbut.application;

import com.github.richodemus.guice_classpath_scanning.ClassPathScanningModule;
import com.google.inject.Stage;
import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * The application entrypoint, initializes guice and starts dropwizard
 */
public class ButButApplication extends Application<ButButConfiguration>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	public static void main(String[] args) throws Exception
	{
		try
		{
			new ButButApplication().run(args);
		}
		catch (Exception e)
		{
			LOGGER.error("Got exception", e);
		}
	}

	@Override
	public String getName()
	{
		return "ButBut";
	}

	@Override
	public void initialize(Bootstrap<ButButConfiguration> bootstrap)
	{
		bootstrap.addBundle(getGuiceBundle(bootstrap));
	}

	private GuiceBundle getGuiceBundle(Bootstrap<?> bootstrap)
	{
		return GuiceBundle.<ButButConfiguration>newBuilder().addModule(new ClassPathScanningModule("com.github.tsar_industries.butbut"))
				.setConfigClass(ButButConfiguration.class)
				.enableAutoConfig("com.github.tsar_industries.butbut")
				.build(Stage.DEVELOPMENT);
	}

	@Override
	public void run(ButButConfiguration configuration,
					Environment environment)
	{

	}
}