package com.fred.data.client.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface TestService {

	@RequestMapping(value="test")
	public String test();
}
