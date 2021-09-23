package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}

//CashbackHacker - сервис, который сообщает пользователю о том, сколько ему нужно "докупить"
// в рамках конкретной траты, чтобы получить максимальное количество кэшбека.//
//Подробнее: кэшбек начисляется за каждую потраченную полную тысячу рублей,
// поэтому если вы покупаете что-то на 900 рублей, сервис должен посоветовать вам докупить "ещё чего-нибудь" на 100 рублей.
