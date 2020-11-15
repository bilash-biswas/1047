using System.IO;
using System;

class Program
{
    static void Main()
    {
    int start_h, end_h, start_m, end_m, duration_h, duration_m;
    var p = Console.ReadLine().Split();
    start_h = int.Parse(p[0]);
    start_m = int.Parse(p[1]);
    end_h = int.Parse(p[2]);
    end_m = int.Parse(p[3]);
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
    if(duration_h < 0){
      duration_h = 24 + duration_h;
    }
    if (start_h == end_h && start_m == end_m)
    {
        Console.WriteLine("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    }
    else{
        Console.WriteLine("O JOGO DUROU " + duration_h + " HORA(S) E " + duration_m + " MINUTO(S)");
    }
    Console.ReadLine();
    }
}
