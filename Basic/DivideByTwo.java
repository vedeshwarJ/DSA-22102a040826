import java.util.*;
class DivideByTwo{
    public static void main(String[] args){
        divide(64);
    }
    public static void divide(int n){
        System.out.println(n);
        if(n>1)   divide(n/2);
    }
}