package main

import (
	"fmt"
)

func main() {
	var start_h, end_h, start_m, end_m, duration_h, duration_m int
	fmt.Scan(&start_h)
	fmt.Scan(&start_m)
	fmt.Scan(&end_h)
	fmt.Scan(&end_m)
	duration_h = end_h - start_h

	if duration_h < 0 {
		duration_h = 24 + (end_h - start_h)
	}
	duration_m = end_m - start_m
	if duration_m < 0 {
		duration_m = 60 + (end_m - start_m)
		duration_h = duration_h - 1
	}
	if start_h == end_h && start_m == end_m {
		fmt.Printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n")
	} else {
		fmt.Printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duration_h, duration_m)
	}
}
