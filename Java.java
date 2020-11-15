import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int start_h, end_h, start_m, end_m, duration_h, duration_m;
    start_h = input.nextInt();
    start_m = input.nextInt();
    end_h = input.nextInt();
    end_m = input.nextInt();
    duration_h = end_h - start_h;

    if (duration_h < 0)
    {
        duration_h = 24 + (end_h - start_h);
    }
    duration_m = end_m - start_m;
    if (duration_m < 0)
    {
       duration_m = 60 + (end_m - start_m);
       duration_h--;
    }
    if(duration_h<0){
       duration_h = 24 + duration_h;
    }
    if (start_h == end_h && start_m == end_m)
    {
        System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
    }
    else{
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration_h, duration_m);
    }
  }
}
