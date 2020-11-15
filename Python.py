start_h,start_m,end_h,end_m = input().split()
start_h = int(start_h)
start_m = int(start_m)
end_h = int(end_h)
end_m = int(end_m)

duration_h = end_h - start_h;

if duration_h < 0 :
    duration_h = 24 + (end_h - start_h)

duration_m = end_m - start_m;
if duration_m < 0 :
    duration_m = 60 + (end_m - start_m)
    duration_h = duration_h - 1
if duration_h<0:
    duration_h = 24 + duration_h
if start_h == end_h and start_m == end_m :
    print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
else:
    print("O JOGO DUROU {} HORA(S) E {} MINUTO(S)".format(duration_h,duration_m))
