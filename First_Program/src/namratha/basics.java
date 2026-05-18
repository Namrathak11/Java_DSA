package namratha;

import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float tempC=in.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);
    }
}

