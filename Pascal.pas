var
start_h, end_h, start_m, end_m, duration_h, duration_m : int64;
begin
   read(start_h);
   read(start_m);
   read(end_h);
   read(end_m);
   duration_h := end_h - start_h;

   if(duration_h < 0)then
   begin
      duration_h := 24 + (end_h - start_h);
   end;
   
   duration_m := end_m - start_m;
   
   if(duration_m < 0)then
   begin
      duration_m := 60 + (end_m - start_m);
      duration_h := duration_h - 1;
   end;
   if(duration_h < 0)then
   begin
      duration_h := 24 + duration_h;
   end;

   if ((start_h  = end_h) and (start_m = end_m))then
      writeln('O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)')
   else 
      writeln('O JOGO DUROU ', duration_h ,' HORA(S) E ', duration_m ,' MINUTO(S)');
end.
