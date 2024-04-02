package com.anita.springaiollamademo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringaiOllamaDemoApplicationTests {

	@Test
	void testOllama() {
		OllamaApi chatApi = new OllamaApi("http://localhost:11434");
		OllamaChatClient ollamaChatClient = new OllamaChatClient(chatApi);

		OllamaOptions options = OllamaOptions
				.create()
				.withModel(OllamaModel.ORCA_MINI.id());

		String response = ollamaChatClient
				.withDefaultOptions(options)
				.call("Why is the sky blue?");

		System.out.println(response);
	}

}
