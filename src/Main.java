import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static void start(){
        System.out.println("Введите вашу сумму:");
        Scanner scanner = new Scanner(System.in);
        int valueSum = scanner.nextInt();

        System.out.println("Выберите нужную валюту:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();

        String result = convertCurrency(valueSum,choiceType);
        int dotIndex = result.indexOf('.');
        String finalyResult = result.substring(0,dotIndex+2);

        System.out.println("По текущему курсу сумма составит: " + finalyResult);
        start();
    }

    static String convertCurrency(int valueSum,int choiceType){
        double rubToUSD = 0.013;
        double rubToEUR = 0.011;
        switch (choiceType){
            case 1:
                double usdResult = valueSum * rubToUSD;
                return(String.valueOf(usdResult));
            case 2:
                double eurResult = valueSum * rubToEUR;
                return(String.valueOf(eurResult));
        }
        return "0";
    }
}
