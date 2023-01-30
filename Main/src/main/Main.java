
package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.People;
import main.Food;
import main.Sport;
import java.util.List;


public class Main {
    public static void print(int personID){
        FileOutputStream fos=null;
        File file =new File("C:\\Users\\rabia\\Desktop\\Odev1\\monitoring.txt");
        try {
            fos=new FileOutputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
        
    public static double dailyCalorieNeeds(People People){
        int yil=2022;
        double cal;//kalori ihtiacı
        int yas=yil-People.getDateOfBirtday();
        
        if(People.getGender().equals("male")){
            
            double a=(13.75*People.getWeight());
            double b=5 * People.getHeight();
            double c=6.8 *(yas);
            cal= 66+a+b-c;
            System.out.println("günlük kalori ihtiyacınız :"+Math.round(cal));
        }else{
            double a=(9.6*People.getWeight());
            double b=1.7 * People.getHeight();
            double c=4.7 *(yas);
            cal= 665+a+b-c;
            System.out.println("günlük kalori ihtiyacınız :"+Math.round(cal));
        }
        return cal;
    }


    public static void main(String[] args) {
        
        
         List<People> femaleList = new ArrayList<>();
         List<People> maleList = new ArrayList<>();
        ///---> Değişken ve File Sınıfının Tanımlanma İşlemleri <---\\\
        BufferedReader foodReader;
        foodReader = new BufferedReader(new FileReader("C:\\Users\\rabia\\Desktop\\Odev1\\people.txt"));
        String foodLine = foodReader.readLine();
        BufferedReader peopleReader;
        peopleReader = new BufferedReader(new FileReader("C:\\Users\\rabia\\Desktop\\Odev1\\people.txt"));
        String peopleLine = peopleReader.readLine();
        while(peopleLine != null){
            if(peopleLine.contains("male")){
                String[] peopleSplited= peopleLine.split("\\s+");
                System.out.println("Yediği yemeği girin:");
                Scanner sn = new Scanner(System.in);
                String eatenFood = sn.nextLine();
                String[] foodSplited;
                while(foodLine != null){
                    if(foodLine.contains(eatenFood)){
                        foodSplited = foodLine.split("\\s+");
                        break;
                    }
                }
                People peopleObj = new People(Integer.parseInt(peopleSplited[0]), peopleSplited[1], peopleSplited[2], Integer.parseInt(peopleSplited[3]), Integer.parseInt(peopleSplited[4]), Integer.parseInt(peopleSplited[5]), new Food(Integer.parseInt(foodSplited[0]), foodSplited[1], Integer.parseInt(foodSplited[2])), new Sport(2001, "archery", 170)); 
                maleList.add(peopleObj);
                
            }else{
                String splited[]= peopleLine.split("\\s+");
                People peopleObj = new People(Integer.parseInt(splited[0]), splited[1], splited[2], Integer.parseInt(splited[3]), Integer.parseInt(splited[4]), Integer.parseInt(splited[5]), new Food(1001, "elma", 87), new Sport(2001, "archery", 170)); 
                

                femaleList.add(peopleObj);
            }
        }
        for (People i : femaleList) {
             double personCalorie = dailyCalorieNeeds(i);
        }
        ///---> FileReader ile Dosya Okuma İşlemi İçin Gerekli Tanımlamalar <---\\\
        
    }
    
}
