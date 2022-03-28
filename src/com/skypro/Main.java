package com.skypro;

public class Main {

    public static void main(String[] args) {
        //task #1
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("minByte: " + minByte + " and " + "maxByte: " + maxByte);

        short minShort = -32_768;
        short maxShort = 32_767;
        System.out.println("minShort: " + minShort + " and " + "maxShort: " + maxShort);

        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        System.out.println("minInt: " + minInt + " and " + "maxInt: " + maxInt);

        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9223372036854775807L;
        System.out.println("minLong: " + minLong + " and " + "maxLong: " + maxLong);

        float minFloat = -3.4E+38f;
        float maxFloat = 3.4E+38f;
        System.out.println("minFloat: " + minFloat + " and " + "maxFloat: " + maxFloat);

        double minDouble = -1.7E+308;
        double maxDouble = 1.7E+308;
        System.out.println("minDouble: " + minDouble + " and " + "maxDouble: " + maxDouble);

        String isN = "N";
        char n = 78;
        boolean isTrue = true;
        System.out.println("This " + n + " like this " + isN + " and it's " + isTrue);

        System.out.println(" ");

        //task #2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Total weight boxers: " + totalWeight + " kg");

        float weightDifference = secondBoxer % firstBoxer;
        System.out.println("Weight difference: " + weightDifference + " kg");

        System.out.println(" ");

        //task #3
        int oneKg = 1000;
        float bananas = 5 * 80;
        float milk = 2 * 105;
        float iceCream = 2 * 100;
        float eggs = 4 * 70;
        var total = (bananas + milk + iceCream + eggs) / oneKg;
        System.out.println("Gainer total mass: " + total + " kg");

        System.out.println(" ");

        //task #4
        int perKg = 1000;
        int weightLose = 7;
        int if250G = 250;
        int if500G= 500;

        int totalDays250 = (weightLose * perKg)/if250G;
        System.out.println("It will take " + totalDays250 + " days to lose " + if250G + " grams per day");
        int totalDays500 = (weightLose * perKg)/if500G;
        System.out.println("It will take " + totalDays500 + " days to lose " + if500G + " grams per day");

        int middleLose = (if250G + if500G) / 2;
        System.out.println("Average value: " + middleLose + " grams per day");
        int totalMiddleDays = (weightLose * perKg) / middleLose;
        System.out.println("Average value: " + totalMiddleDays + " days");

        System.out.println(" ");
        //task #5
        int masha = 67_760;
        int denis = 83_690;
        int christina = 76_230;

        int percentIncrease = 10;
        int monthYear = 12;

        System.out.println(" ");

        System.out.println("Salary increase per month:");
        int increaseMasha = (masha * percentIncrease)/100;
        System.out.println("Masha: " + increaseMasha + " rubles");
        int increaseDenis = (denis * percentIncrease)/100;
        System.out.println("Denis: " + increaseDenis + " rubles");
        int increaseChristina = (christina * percentIncrease)/100;
        System.out.println("Christina: " + increaseChristina + " rubles");

        System.out.println(" ");

        System.out.println("Total salary increase per month:");
        int totalIncreaseMasha = masha + increaseMasha;
        System.out.println("Masha: " + totalIncreaseMasha + " rubles");
        int totalIncreaseDenis = denis + increaseDenis;
        System.out.println("Denis: " + totalIncreaseDenis + " rubles");
        int totalIncreaseChristina = christina + increaseChristina;
        System.out.println("Christina: " + totalIncreaseChristina + " rubles");

        System.out.println(" ");

        System.out.println("Annual income for year before salary increase:");
        int annualIncomeMashaBefore = masha * monthYear;
        System.out.println("Masha: " + annualIncomeMashaBefore + " rubles");
        int annualIncomeDenisBefore = denis * monthYear;
        System.out.println("Denis: " + annualIncomeDenisBefore + " rubles");
        int annualIncomeChristinaBefore = christina * monthYear;
        System.out.println("Christina: " + annualIncomeChristinaBefore + " rubles");

        System.out.println(" ");

        System.out.println("Annual income for year after salary increase:");
        int annualIncomeMashaAfter = (masha + increaseMasha) * monthYear;
        System.out.println("Masha: " + annualIncomeMashaAfter + " rubles");
        int annualIncomeDenisAfter = (denis + increaseDenis) * monthYear;
        System.out.println("Denis: " + annualIncomeDenisAfter + " rubles");
        int annualIncomeChristinaAfter = (christina + increaseChristina) * monthYear;
        System.out.println("Christina: " + annualIncomeChristinaAfter + " rubles");

        System.out.println(" ");

        System.out.println("Income difference:");
        int incomeDifferenceMasha = annualIncomeMashaAfter % annualIncomeMashaBefore;
        System.out.println("Masha: " + incomeDifferenceMasha  + " rubles");
        int incomeDifferenceDenis  = annualIncomeDenisAfter % annualIncomeDenisBefore;
        System.out.println("Denis: " + incomeDifferenceDenis + " rubles");
        int incomeDifferenceChristina = annualIncomeChristinaAfter % annualIncomeChristinaBefore;
        System.out.println("Christina: " + incomeDifferenceChristina + " rubles");

    }
}
