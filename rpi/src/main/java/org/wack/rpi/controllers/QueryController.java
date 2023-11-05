package org.wack.rpi.controllers;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wack.rpi.modules.OpenAIModule;

@Controller
public class QueryController {
    @PostMapping("/submitForm")
    public String submitForm(@RequestParam String inputText, Model model) {
        model.addAttribute("outputText", OpenAIModule.generateMessage(250, false, 1.0, 1.0, 0.5, inputText));
        return "result";
    }
}