package com.github.tsar_industries.slashgif.search_providers.google_image_search;

import com.github.tsar_industries.slashgif.api.model.Image;
import com.github.tsar_industries.slashgif.search_providers.api.SearchProviderApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

class GoogleSearchProvider implements SearchProviderApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Optional<Image> getImage(String query)
	{
		logger.info("Searching google for images for the query \"{}\"", query);
		return Optional.empty();
	}
}
