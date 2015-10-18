package com.github.tsar_industries.slashgif.search_providers.api;

import com.github.tsar_industries.slashgif.service_layer.api.Image;

import java.util.Optional;

public interface SearchProviderApi
{
	Optional<Image> getImage(String query);
}