import java.util.*;
class TowerOFHanoi{
    public static void main(String[] args){
     int n=4;
     char source='A';
    
     char dest='C';
      char aux='B';
     transfer(n, source, dest,aux);
     
    }
    public static void transfer(int n, char source, char dest, char aux){
        if(n==1) {
          System.out.println("move disk 1 from "+source+ " to "+dest);
          return;
        }
        transfer(n-1, source,aux,dest);
        System.out.println("move disk "+n+" from "+source+ " to "+dest);
        transfer(n-1,aux,dest,source);
    }

}
