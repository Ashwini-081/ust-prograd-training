import jdk.internal.module.ModuleInfoExtender;
import jdk.internal.module.ModuleInfoWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;




public class Currencyconvertor {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static double amount=1;
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void makeSomeLog()
    {
        LOGGER.log(Level.INFO, "Program started.");
    }

    public static void main(String args[])  {
        Currencyconvertor obj = new Currencyconvertor();
        obj.makeSomeLog();

        LogManager lgmngr = LogManager.getLogManager();

        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        log.log(Level.INFO, "Program stopped.");
    }
    Scanner in = new Scanner(System.in);
    while(true){
            System.out.println("Type 1 for INR : ");
            System.out.println("Type 2 for Dollar to Rupee conversion: ");
            System.out.println("Type 3 for euro to Rupee conversion: ");
            System.out.println("Type 4 for British pound to Rupee conversion: ");
            System.out.println("Type 5 for swiss france to Rupee conversion: ");
            System.out.println("Type 6 To Exit ");
            System.out.print("Enter your choice: ");
//            if(amount<=0){
//                throw new Exception("in valid amount");
//            }
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter rupee amount: ");
                    double r1 = in.nextDouble();
                    System.out.println("User entered amount"+ df.format(r1));

                    break;

                case 2:
                    System.out.print("Enter dollar amount: ");
                    double d = in.nextDouble();
                    double r2 = d * 65.85;
                    System.out.println(d + " dollars => " + r2 + " rupees");
                    System.out.println("User entered amount"+ df.format(r2));
                case 3:
                    System.out.print("Enter euro amount: ");
                    double e = in.nextDouble();
                    double r3 = e * 85.76;
                    System.out.println(e + " euro=> " + r3 + " rupees");
                    System.out.println("User entered amount"+ df.format(r3));
                case 4:
                    System.out.print("Enter British pound amount: ");
                    double bp = in.nextDouble();
                    double r4 = bp * 100.74;
                    System.out.println(bp + "British pound => " + r4 + " rupees");
                    System.out.println("User entered amount"+ df.format(r4));
                case 5:
                    System.out.print("Enter swiss france amount: ");
                    double sf= in.nextDouble();
                    double r5 = sf * 82.36;
                    System.out.println(sf + " swiss france => " + r5 + " rupees");
                    System.out.println("User entered amount"+ df.format(r5));


                    break;
                case 6:
                    System.out.println("Exiting the application");
                    System.exit(0);

                default:
                  System.out.println("Incorrect Choice");
            }
        }
    }

//    Make a console based currency converter application with suppport for atleast 5 currencies.
//        Requirements:
//        1. Must be a menu driven program.
//        2. All currencies to be displayed correct upto 2 decimal places.
//        3. Each interaction of the user with the program must be logged in a log.txt file
//        `log.txt` example contents -
//        Program started.
//        User selected INR
//        User selected USD
//        User entered amount 1400
//        Program stopped.
//        4. Add exception handling for when user enters invalid amount or chooses invalid option
