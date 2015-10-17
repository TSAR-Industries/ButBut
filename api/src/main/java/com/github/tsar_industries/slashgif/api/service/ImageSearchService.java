package com.github.tsar_industries.slashgif.api.service;

import com.github.tsar_industries.slashgif.api.image_search.Image;

import java.util.Optional;

public interface ImageSearchService
{
	Optional<Image> getImage(String query);
}
