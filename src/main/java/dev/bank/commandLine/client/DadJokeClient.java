package dev.bank.commandLine.client;

import dev.bank.commandLine.model.DadJokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface DadJokeClient {
    // Get https://icanhazdadjoke.com/
   @GetExchange("/")
    DadJokeResponse random();
}
