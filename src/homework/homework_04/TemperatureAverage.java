package homework.homework_04;

public class TemperatureAverage {
    public static void main(String[] args) {
        // Заданные данные по температуре
        int temperatureMonday = -5;
        int temperatureTuesday = 0;
        int temperatureWednesday = -3;
        int temperatureThursday = -2;
        int temperatureFriday = -5;
        int temperatureSaturday = -5;
        int temperatureSunday = -2;

        // Вычисляем среднюю температуру
        int totalTemperature = temperatureMonday + temperatureTuesday + temperatureWednesday +
                temperatureThursday + temperatureFriday + temperatureSaturday + temperatureSunday;
        int numberOfDays = 7;
        int averageTemperature = totalTemperature / numberOfDays;
// Выводим среднюю температуру на печать
        System.out.println("Средняя температура за неделю: " + averageTemperature + " градусов Цельсия");
    }
}
