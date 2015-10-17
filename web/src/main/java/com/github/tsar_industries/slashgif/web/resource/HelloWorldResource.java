package com.github.tsar_industries.slashgif.web.resource;

import com.github.tsar_industries.slashgif.api.service.ImageSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldResource
{
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private final ImageSearchService service;

	@Inject
	public HelloWorldResource(ImageSearchService service)
	{
		this.service = service;
	}

	@GET
	public String hello()
	{
		logger.info("Someone's saying hello");
		return service.getImage("majsfisk")
				.map(i -> "y hello thar, I founds image")
				.orElseGet(() -> "y hello thar, no image found");
	}
}
