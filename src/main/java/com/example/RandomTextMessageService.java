package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomTextService")
public class RandomTextMessageService implements MessageService{
    String[] randomMessage = new String[]{"Dzien dobry", "Do widzenia", "Witam serdecznie", "Siemaneczko", "Dzień doberek", "Witam, witam", "Żegnam", "Papa", "Narazie", "Cześć"};

    @Override
    public String getMessage() {
        Random random = new Random();
        return randomMessage[random.nextInt(randomMessage.length -1)];
    }
}
