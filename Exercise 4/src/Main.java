public class Main {
    public static void main(String[] args) {
        int person = 1;
        int birth = 7;
        int death = 13;
        int usaPopulation = 331002651;

        int year = secInAYear();
        int fiveYears = year * 5;

        int totalBirths = fiveYears/birth;
        int totalDeaths = fiveYears/death;
        int totalNewPeople = totalBirths - totalDeaths;
        int usPopulationFiveYears = totalBirths + usaPopulation;

        System.out.println("This is the total amount of new people in the usa in five years " + totalBirths);
        System.out.println("This is the total amount of people in the usa in five years " + usPopulationFiveYears);



    }

    public static int secInAYear(){
        int sec = 1;
        int min = sec * 60;//60 er sekunder på et minute
        int hour = min * 60;//60 er minutter på en time
        int day = hour * 24;//24 er timer på en day
        int year = day * 365;//365 er dage på et år
        return year;
    }
}
