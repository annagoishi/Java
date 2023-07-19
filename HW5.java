public class HW5 {
    public static void main(String[] args) {

        System.out.println("________1________");

        float m = -100.01f;
        float n = -45.0f;

        if (Math.abs(m-10) > Math.abs(n-10)) {
            System.out.println("Число " + n + " ближе к 10");
        } else {
            System.out.println("Число " + m + " ближе к 10");
        }

        System.out.println("________2________");

        int seconds = (int) (Math.random()*28800);
        int hours = seconds / 3600;

        if (hours > 4 ) {
            System.out.println(seconds);
            System.out.println("Осталось " + hours + " часов");
        } else if (hours < 5 && hours > 1) {
            System.out.println(seconds);
            System.out.println("Осталось " + hours + " часа");
        } else if (hours == 1) {
            System.out.println(seconds);
            System.out.println("Остался " + hours + " чаc");
            } else {
            System.out.println(seconds);
            System.out.println("Осталось менее часа");
        }


    }
}
