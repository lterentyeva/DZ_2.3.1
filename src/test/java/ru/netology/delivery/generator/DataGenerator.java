package ru.netology.delivery.generator;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {


     public static Faker faker = new Faker(new Locale("ru"));



        public static String generateDate(int addedDays) {
            return LocalDate.now().plusDays(addedDays).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

        public static String getCity() {
            String[] cities = {"Москва", "Санкт-Петербург", "Казань", "Архангельск", "Пермь", "Вологда", "Воронеж", "Калининград", "Нижний Новгород", "Новосибирск", "Омск", "Псков"};
            return cities[new Random().nextInt(cities.length)];
        }

        public static String getName() {
            return faker.name().lastName() + " " + faker.name().firstName();
        }

        public static String getPhone() {
            return faker.phoneNumber().phoneNumber();
        }
    }


