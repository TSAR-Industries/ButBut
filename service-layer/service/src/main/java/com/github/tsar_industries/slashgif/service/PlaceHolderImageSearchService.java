package com.github.tsar_industries.slashgif.service;


import com.github.tsar_industries.slashgif.service_layer.api.Image;
import com.github.tsar_industries.slashgif.service_layer.api.Service;
import com.github.tsar_industries.slashgif.search_providers.api.SearchProviderApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Optional;

class PlaceHolderImageSearchService implements Service
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final SearchProviderApi searchProvider;

	@Inject
	PlaceHolderImageSearchService(SearchProviderApi searchProvider)
	{
		this.searchProvider = searchProvider;
	}

	@Override
	public Optional<Image> getImage(String query)
	{
		logger.info("Searching for images for the query \"{}\"", query);
		return searchProvider.getImage(query);
	}
}
