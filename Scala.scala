object Main {
  def main(args:Array[String]){ 
    var Array(start_h, start_m, end_h, end_m) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var duration_h = end_h - start_h;

    if (duration_h < 0)
    {
        duration_h = 24 + (end_h - start_h);
    }
    var duration_m = end_m - start_m;
    if (duration_m < 0)
    {
      duration_m = 60 + (end_m - start_m);
      duration_h = duration_h - 1
    }

    if (start_h == end_h && start_m == end_m)
    {
        println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
    }
    else println("O JOGO DUROU %d HORA(S) E %d MINUTO(S)".format( duration_h, duration_m))
  }
}
