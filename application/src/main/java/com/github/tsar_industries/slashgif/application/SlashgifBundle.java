package com.github.tsar_industries.slashgif.application;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.java8.Java8Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Bundles are basically plugins in dropwizard <br/>
 * This one gets automatically found by guice and registered in dropwizard
 *
 * @see SlashgifApplication#getGuiceBundle(Bootstrap)
 */
public class SlashgifBundle implements ConfiguredBundle<SlashgifConfiguration>
{
	@Override
	public void initialize(Bootstrap<?> bootstrap)
	{
		bootstrap.addBundle(new Java8Bundle());
	}

	@Override
	public void run(SlashgifConfiguration configuration, Environment environment) throws Exception
	{

	}
}
