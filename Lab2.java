// Lab 2 Task 26/1/2025
import java.util.Scanner;
public class Lab2 {
    float len;
    float h;

    void area() {
        System.out.println(len * h);
    }

    void display() {
        System.out.println("length: " + len);
        System.out.println("height: " + h);
    }

    void insertData(float l, float hi) {
        len = l;
        h = hi;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.len = 7;
        obj.h = 10;
        obj.area();
        obj.display();
        Main obj2 = new Main();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        float leng = input.nextFloat();
        System.out.print("Enter height: ");
        float hei = input.nextFloat();
        obj2.insertData(leng, hei); // obj2.area();
        obj2.display(); // input.close();
    }
}
