package ru.sbrf.javaschool.lessons;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a, b, result;
        String sign, usrMsg;

        do
        {
            a = scanner.nextLong();
            sign = scanner.next();
            b = scanner.nextLong();

            try
            {
                switch (sign)
                {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    default:
                        throw new Exception("Wrong sign!");
                }

                System.out.println(result);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                System.out.println("Do u want use it again? (y/Y/yes/Yes/YES or anything else)");
                usrMsg = scanner.next();
            }
        } while (usrMsg.equals("y") ||
                usrMsg.equals("Y") ||
                usrMsg.equals("yes") ||
                usrMsg.equals("Yes") ||
                usrMsg.equals("YES"));

        System.out.println("Goodbye! ^^");
    }
}
