package ru.javacore;
import ru.javacore.Tester;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Aleksandra!" );
        double salaryInUsd = 3000;
        double exchangeRate = 0.85;

        double salaryInEuro = Tester.convertToEuro(salaryInUsd, exchangeRate);
        System.out.println("Заработная плата в евро: " + salaryInEuro);
    }
}
