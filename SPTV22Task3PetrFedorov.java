/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task3petrfedorov;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SPTV22Task3PetrFedorov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mal;
        String month1="января";
        String century1="18";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите исукукод:");
        String ik = scanner.nextLine();
        char firstnum = ik.charAt(0);
        int gender_num = Character.getNumericValue(firstnum);        
        if(firstnum%2==0){
            mal = "родилась";
        }
        else{
            mal = "родился";
        }
        String born_date = ik.substring(5, 7);
        String month = ik.substring(3, 5);
        String century = ik.substring(2, 3);
        System.out.println(century);
        switch(century) {
            case "1":
                century1 = "18";
                break;
            case "2":
                century1 = "18";
                break;
            case "3":
                century1 = "19";
                break;
            case "4":
                century1 = "19";
                break;
            case "5":
                century1 = "20";
                break;
            case "6":
                century1 = "20";
                break;
            case "7":
                century1 = "21";
                break;
            case "8":
                century1 = "21";
                break;
            default:
                System.out.println("А как?");
        }
        switch(month) {
            case "01":
                month1 = "января";
                break;
            case "02":
                month1 = "февраль";
                break;
            case "03":
                month1 = "марта";
                break;
            case "04":
                month1 = "апреля";
                break;
            case "05":
                month1 = "мая";
                break;
            case "06":
                month1 = "июня";
                break;
            case "07":
                month1 = "июля";
                break;
            case "08":
                month1 = "августа";
                break;
            case "09":
                month1 = "сентября";
                break;
            case "10":
                month1 = "октября";
                break;
            case "11":
                month1 = "ноября";
                break;
            case "12":
                month1 = "декабря";
                break;
            default:
                System.out.println("А как?");
}
        System.out.println(name + " " + surname + " " + mal + " " + born_date + " " + month1 + " " +century1 + ik.substring(1, 3) + " года");
    }
    
}
