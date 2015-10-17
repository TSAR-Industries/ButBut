package com.github.tsar_industries.slashgif.api.image_search;

import java.util.Optional;

public interface ImageSearchApi
{
	Optional<Image> getImage(String query);
}
