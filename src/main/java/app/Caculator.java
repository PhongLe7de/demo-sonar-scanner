package app;

import java.util.Scanner;
import java.util.logging.Logger;

public class Caculator {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Caculator.class.getName());
        Scanner sc = new Scanner(System.in);

            logger.info("Enter first number:");
            double num1 = sc.nextDouble();

            logger.info("Enter second number:");
            double num2 = sc.nextDouble();

            sum(num1, num2);
            substract(num1, num2);
            multiply(num1, num2);
                divide(num1, num2);

    }

    public static double sum (double num1, double num2) {
        Logger logger = Logger.getLogger(Caculator.class.getName());
        double sum = num1 + num2;
        logger.info(() -> String.format("Sum: %.2f", sum));
        return sum;
    }

    public static double substract(double num1, double num2) {
        Logger logger = Logger.getLogger(Caculator.class.getName());
        double difference = num1 - num2;
        logger.info(() -> String.format("Difference: %.2f", difference));
        return difference;
    }

    public static double multiply(double num1, double num2) {
        Logger logger = Logger.getLogger(Caculator.class.getName());
        double product = num1 * num2;
        logger.info(() -> String.format("Product: %.2f", product));
        return product;
    }

    public static double divide(double num1, double num2) {
        Logger logger = Logger.getLogger(Caculator.class.getName());
            double quotient = num1 / num2;
            logger.info(() -> String.format("Quotient: %.2f", quotient));
            return quotient;
    }

}
