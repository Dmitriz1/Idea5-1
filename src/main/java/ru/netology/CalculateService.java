package ru.netology;

public class CalculateService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + month + 1 + ". " +
                        "Денег " + money + ". " +
                        "Буду отдыхать. " + "Потратил " + "+ " + expenses + "," +
                        "затем ещё" + "-" + (money - expenses * 2 / 3));
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + 1 + ". " +
                        "Денег " + money + ". " + "Придётся работать. " +
                        "Заработал " + "+" + income +
                        "," + "потратил" + "-" + expenses);
            }
        }
        return count;
    }
}
