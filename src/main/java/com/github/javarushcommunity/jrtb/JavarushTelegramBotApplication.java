package com.github.javarushcommunity.jrtb;

import com.github.javarushcommunity.jrtb.bot.JavarushTelegramBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class JavarushTelegramBotApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavarushTelegramBotApplication.class, args);
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new JavarushTelegramBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
