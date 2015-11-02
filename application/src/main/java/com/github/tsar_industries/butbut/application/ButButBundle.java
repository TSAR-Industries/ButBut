package com.github.tsar_industries.butbut.application;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.java8.Java8Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Bundles are basically plugins in dropwizard <br/>
 * This one gets automatically found by guice and registered in dropwizard
 *
 * @see ButButApplication#getGuiceBundle(Bootstrap)
 */
public class ButButBundle implements ConfiguredBundle<ButButConfiguration>
{
	@Override
	public void initialize(Bootstrap<?> bootstrap)
	{
		bootstrap.addBundle(new Java8Bundle());
	}

	@Override
	public void run(ButButConfiguration configuration, Environment environment) throws Exception
	{

	}
}
