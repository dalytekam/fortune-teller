package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
        //Declaring variables
        int age;
        String favoriteColor;
        Scanner input = new Scanner(System.in);
        //Ask for first name
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("What is your age?");
        age = input.nextInt();
        System.out.println("What is your birth of Month?");
        int birthMonth = input.nextInt();
        input.nextLine();
        System.out.println("What is your favorite Color?(Give me a ROYGBIV or enter 'Help' to learn more about ROYGBIV )");
        favoriteColor = input.nextLine();
        if(favoriteColor.equalsIgnoreCase("help")){
            System.out.println("Use Red, Orange,Yellow,Green, Blue, Indigo, or Violet");
            System.out.println("What is your favorite Color?");
            favoriteColor = input.nextLine();
        }


        System.out.println("How many siblings do you have?");
        int numberOfSibling = input.nextInt();

// Part 2 Retirement

        int numberOfYearsUntilRetirement = 0;
        if(age%2==0){
            numberOfYearsUntilRetirement=24;
        }else{
            numberOfYearsUntilRetirement=17;
        }


        String vacationHomeLocation="";
        if(numberOfSibling==0){
            vacationHomeLocation="Boca Raton";
        } else if(numberOfSibling==1){
            vacationHomeLocation="Nassau";
        }else if(numberOfSibling==2){
            vacationHomeLocation="Ponta Negra";
        }else if(numberOfSibling==3){
            vacationHomeLocation="Portland";
        }else if(numberOfSibling>3){
            vacationHomeLocation="Baton Rouge";
        }else{
            vacationHomeLocation="Chernobyl";
        }
        // Mode of transportation
        String modeOfTransportation="";
        switch (favoriteColor.toUpperCase()){
            case "RED":
                modeOfTransportation="Maserati";
                break;
            case "ORANGE":
                modeOfTransportation ="Stallion";
                break;
            case "YELLOW":
                modeOfTransportation ="Chariot";
                break;
            case "GREEN":
                modeOfTransportation ="Taxi";
                break;
            case "BLUE":
                modeOfTransportation ="Rickshaw";
                break;
            case "INDIGO":
                modeOfTransportation ="Motor Scooter";
                break;
            case "VIOLET":
                modeOfTransportation ="Flying saucer";
                break;
            default:
                modeOfTransportation="Others";}

                //Bank Balance
                double bankBalance=0.00;
if(birthMonth >=1 && birthMonth <=4){
    bankBalance=5000000.02;
}else if(birthMonth >=5 && birthMonth <=8){
    bankBalance=250000.45;
}else if(birthMonth >=9 && birthMonth <=12){
   bankBalance=540000.56;
}else{
    bankBalance=54000.68;
}
        System.out.println("---YOUR RECORD---"+"\n"+"First Name: " +firstName +"\n" +
                "Last Name: " + lastName + "\n"+"Age: "+ age+"\n" +"Birth Of Month: "+ birthMonth
                +"\n" +"Favorite Color: "+ favoriteColor +"\n" +"Number of Siblings: "+ numberOfSibling
                 +"\n"+ "Number Of Years until Retirement: "+ numberOfYearsUntilRetirement
                +"\n"+ "Vacation Location: "+ vacationHomeLocation +"\n"+ "Mode of Transportaion: "+ modeOfTransportation


                +"\n"+ "Bank Balance: "+ bankBalance);
        System.out.println(firstName+" "+lastName+" will retire in " +numberOfYearsUntilRetirement +" \nof years with "+bankBalance+ " in the bank, a vacation \nhome in "+ vacationHomeLocation+", \nand travel by "+ modeOfTransportation+".");

        }
    }


