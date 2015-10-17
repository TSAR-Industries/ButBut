package com.github.tsar_industries.slashgif.google;

import com.github.tsar_industries.slashgif.api.image_search.Image;
import com.github.tsar_industries.slashgif.api.image_search.ImageSearchApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

class GoogleImageSearch implements ImageSearchApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Optional<Image> getImage(String query)
	{
		logger.info("Searching google for images for the query \"{}\"", query);
		return Optional.empty();
	}
}
