package com.example.RAG;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface ChatService {

    @SystemMessage(value = """
            Welcome to companies chatbot!
            """)
    String chat(@UserMessage String userMessage);
}