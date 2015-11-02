package com.github.tsar_industries.butbut.search_providers.api;

import com.github.tsar_industries.butbut.service_layer.api.Image;

import java.util.Optional;

public interface SearchProviderApi
{
	Optional<Image> getImage(String query);
}
