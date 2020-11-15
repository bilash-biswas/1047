start_h = io.read("*n")
start_m = io.read("*n")
end_h = io.read("*n")
end_m = io.read("*n")
duration_h = end_h - start_h
if (duration_h < 0) then
    duration_h = 24 + (end_h - start_h)
end
duration_m = end_m - start_m
if (duration_m < 0)then
    duration_m = 60 + (end_m - start_m)
    duration_h = duration_h - 1
end
if (start_h == end_h and start_m == end_m)then
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
else
    print("O JOGO DUROU "..duration_h.." HORA(S) E "..duration_m.." MINUTO(S)")
end
