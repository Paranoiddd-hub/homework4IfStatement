public class Main {
    public static void main(String[] args) {
        //1st task:

        int age1 = 17;
        String adultOrNot;

        if (age1 >= 18) {
            adultOrNot = "он совершеннолетний";
        } else {
            adultOrNot = "он не достиг совершеннолетия, нужно немного подождать";
        }

        System.out.printf("Если возраст человека равен %d, то %s.%n", age1, adultOrNot);
        System.out.println();


        //2nd task:

        int temperature = 4;
        String action2;

        if (temperature < 5) {
            action2 = "На улице холодно, нужно надеть шапку";
        } else {
            action2 = "Сегодня тепло, можно идти без шапки";
        }

        System.out.printf("На улице %d градусов. %s.%n", temperature, action2);
        System.out.println();


        //3rd task:

        int speed = 70;
        String overspeed;
        String action3;

        if (speed > 60) {
            overspeed = "скорость превышена, если она больше 60 км/ч";
            action3 = "придется заплатить штраф";
        } else {
            overspeed = "превышения скорости нет, если она меньше 60 км/ч";
            action3 = "можно ездить спокойно";
        }

        System.out.printf("Если скорость %d, то %s, %s.%n", speed, overspeed, action3);
        System.out.println();


        //4th task:

        int age4 = 16;
        String action4;

        if (2 <= age4 && age4 <= 6) {
            action4 = "в детский сад";
        } else if (7 <= age4 && age4 <= 17) {
            action4 = "в школу";
        } else if (18 <= age4 && age4 <= 24) {
            action4 = "в университет";
        } else {
            action4 = "на работу";
        }

        System.out.printf("Если возраст человека равен %d, то ему нужно ходить %s.%n", age4, action4);
        System.out.println();


        //5th task:

        int age5 = 15;
        String action5;

        if (age5 < 5) {
            action5 = "нельзя кататься на аттракционе";
        } else if (5 <= age5 && age5 <= 14) {
            action5 = "можно кататься на аттракционе в сопровождении взрослого";
        } else {
            action5 = "можно кататься на аттракционе без сопровождения взрослого";
        }

        System.out.printf("Если возраст ребенка равен %d, то ему %s.%n", age5, action5);
        System.out.println();


        //6th task:

        int occupiedSittingPlaces = 60;
        int occupiedStandingPlaces = 32;
        int totalPlaces = 102;
        int freePlaces = totalPlaces - (occupiedSittingPlaces + occupiedStandingPlaces);

        if (freePlaces > 0) {
            System.out.printf("В вагоне есть %d мест, %d сидячих и %d стоячих.%n",
                    freePlaces, 60 - occupiedSittingPlaces, 42 - occupiedStandingPlaces);
        } else {
            System.out.println("Вагон полностью забит.");
        }
        System.out.println();


        //7th task:

        int one = 1;
        int two = 2;
        int three = 3;
        int greater;

        if (one > two && one > three) {
            greater = one;
        } else if (two > one && two > three) {
            greater = two;
        } else {
            greater = three;
        }

        System.out.printf("Число %d наибольшее", greater);

    }
}