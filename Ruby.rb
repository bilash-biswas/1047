start_h,start_m,end_h,end_m = gets().chomp().split(' ');
start_h = start_h.to_i
start_m = start_m.to_i
end_h = end_h.to_i
end_m = end_m.to_i
duration_h = end_h - start_h
if duration_h < 0
    duration_h = 24 + (end_h - start_h)
end
duration_m = end_m - start_m
if duration_m < 0
   duration_m = 60 + (end_m - start_m)
   duration_h = duration_h - 1
end
if start_h == end_h && start_m == end_m
    printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
else
  printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration_h, duration_m);
end
