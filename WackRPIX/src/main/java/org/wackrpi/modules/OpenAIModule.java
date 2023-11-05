package org.wackrpi.modules;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class OpenAIModule {
    private static final String API_KEY = "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";
    private static final OpenAiService service = new OpenAiService(API_KEY);

    public static String generateMessage(int maxTokens, boolean e, double fPenalty, double pPenalty, double temp, String prompt) {
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model("text-curie-001")
                .maxTokens(maxTokens)
                .echo(e)
                .frequencyPenalty(fPenalty)
                .presencePenalty(pPenalty)
                .temperature(temp)
                .build();
        String msg = service.createCompletion(completionRequest).getChoices().get(0).getText();

        return msg.trim();
    }
}
