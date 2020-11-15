import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var start_h = read.nextInt()
    var start_m = read.nextInt()
    var end_h = read.nextInt()
    var end_m = read.nextInt()
    
    var duration_h = end_h - start_h;

    if (duration_h < 0)
    {
        duration_h = 24 + (end_h - start_h);
    }

    var duration_m = end_m - start_m;
    if (duration_m < 0)
    {
      duration_m = 60 + (end_m - start_m);
      duration_h--;
    }
    if(duration_h<0)
    {
      duration_h = 24 + duration_h;
    }
    if (start_h == end_h && start_m == end_m)
    {
        println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }
    else{println("O JOGO DUROU " + duration_h + " HORA(S) E " + duration_m + " MINUTO(S)");
    }
}

    
