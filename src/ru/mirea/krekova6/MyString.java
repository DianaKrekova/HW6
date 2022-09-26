package ru.mirea.krekova6;

import java.util.Arrays;

public class MyString implements MyStringOperations{
    private char[] arr;

    public MyString(char[] a) {
        arr=a;
    }

    public void printer(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println('\n');
    }

    public int count(){
        return arr.length;
    }
    public void odd(){
        System.out.println("Символы на нечетных позициях: \n");
        for (int i=0;i<arr.length;i++){
            if(i%2==1){
                System.out.print(arr[i]);
            }
        }
        System.out.println('\n');
    }
    public void invert(){
        System.out.println("Инвертированная строка: \n");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println('\n');
    }
}
