/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hora {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;
    private Scanner ler = new Scanner(System.in);
    
    //Métodos construtores
    public Hora() {
        setHora();
        setMinuto();
        setSegundo();
    }

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    //Setters
    public void setHora(int hora) {
        try {
            if (hora < 0 || hora > 23) {
                System.out.println("Hora invalida. Deve estar entre 0 e 23.");
            } else {
                this.hora = hora;
            }
        } catch (InputMismatchException error) {
            System.out.println("Digite um numero inteiro valido.");
        }
    }

    public void setMinuto(int minuto) {
        try {
            if (minuto < 0 || minuto > 59) {
                System.out.println("Hora invalida. Deve estar entre 0 e 59.");
            } else {
                this.minuto = minuto;
            }
        } catch (InputMismatchException error) {
            System.out.println("Digite um numero inteiro valido.");
        }
    }

    public void setSegundo(int segundo) {
        try {
            if (segundo < 0 || segundo > 59) {
                System.out.println("Hora invalida. Deve estar entre 0 e 59.");
            } else {
                this.segundo = segundo;
            }
        } catch (InputMismatchException error) {
            System.out.println("Digite um numero inteiro valido.");
        }
    }

    public void setHora() {
        int hora = 0;
        boolean verif = true;

		while(verif) {
			try {
				System.out.print("Digite a hora (0-23): ");
				hora = ler.nextInt();
				if (hora < 0 || hora > 23) {
					System.out.println("Hora invalida. Deve estar entre 0 e 23.");
				} else {
					this.hora = hora;
                    verif = false;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um numero inteiro valido.");
				ler.next();
			}
		}
    }

    public void setMinuto() {
        int minuto = 0;
        boolean verif = true;

		while(verif) {
			try {
				System.out.print("Digite o minuto (0-59): ");
				minuto = ler.nextInt();
				if (minuto < 0 || minuto > 59) {
					System.out.println("Hora invalida. Deve estar entre 0 e 59.");
				} else {
					this.minuto = minuto;
                    verif = false;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um numero inteiro valido.");
				ler.next();
			}
		}
    }

    public void setSegundo() {
        int segundo = 0;
        boolean verif = true;

		while(verif) {
			try {
				System.out.print("Digite o segundo (0-59): ");
				segundo = ler.nextInt();
				if (segundo < 0 || segundo > 59) {
					System.out.println("Hora invalida. Deve estar entre 0 e 59.");
				} else {
					this.segundo = segundo;
                    verif = false;
				}
			} catch (InputMismatchException error) {
				System.out.println("Digite um numero inteiro valido.");
				ler.next();
			}
		}
    }

    //Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Métodos
    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public String getHora2() {
        return String.format("%02d:%02d:%02d%s", 
            (this.hora > 12) ? (this.hora - 12) : this.hora, this.minuto, this.segundo, 
            (this.hora < 12) ? "AM" : "PM");
    }

    public int getSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }
}