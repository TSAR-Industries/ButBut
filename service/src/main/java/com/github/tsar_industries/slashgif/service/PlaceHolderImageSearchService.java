package com.github.tsar_industries.slashgif.service;


import com.github.tsar_industries.slashgif.api.image_search.Image;
import com.github.tsar_industries.slashgif.api.image_search.ImageSearchApi;
import com.github.tsar_industries.slashgif.api.service.ImageSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Optional;

class PlaceHolderImageSearchService implements ImageSearchService
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final ImageSearchApi imageSearcher;

	@Inject
	PlaceHolderImageSearchService(ImageSearchApi imageSearcher)
	{
		this.imageSearcher = imageSearcher;
	}

	@Override
	public Optional<Image> getImage(String query)
	{
		logger.info("Searching for images for the query \"{}\"", query);
		return imageSearcher.getImage(query);
	}
}
