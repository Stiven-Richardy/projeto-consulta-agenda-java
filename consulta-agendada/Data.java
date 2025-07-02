/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

import java.util.Scanner;
import java.util.Date;
import java.util.InputMismatchException;
import java.text.DateFormat;

public class Data {
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    private Scanner ler = new Scanner(System.in);

    //Métodos construtores
    public Data() {
        setDia();
        setMes();
        setAno();
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    //Setters
    public void setDia(int dia) {
        try {
            if (dia < 1 || dia > 31) {
                System.out.println("[ERRO] Dia invalido. Deve estar entre 1 e 31.");
            } else {
                this.dia = dia;
            }
        } catch (InputMismatchException error) {
                System.out.println("[ERRO] Numero inteiro invalido.");
        }
    }

    public void setMes(int mes) {
        try {
            if (mes < 1 || mes > 12) {
                System.out.println("[ERRO] Mes invalido. Deve estar entre 1 e 12.");
            } else if ((mes == 2 && dia > 29) || (mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                System.out.println("[ERRO] Mes invalido para o dia " + dia);
            } else {
                this.mes = mes;
            }
        } catch (InputMismatchException error) {
            System.out.println("[ERRO] Numero inteiro invalido.");
        }
    }

    public void setAno(int ano) {
            try {
                if (ano < 1900 || ano > 2100) {
                    System.out.println("[ERRO] Ano invalido. Deve estar entre 1900 e 2100.");
                } else if (mes == 2 && dia ==29 && !(this.bissexto())) {
                    System.out.println("[ERRO] Ano invalido. Dia 29 de fevereiro so existe em anos bissextos.");
                } else {
                    this.ano = ano;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Numero inteiro invalido.");
            } 
    }

    public void setDia() {
        int dia;
        boolean verif = true;

        while(verif) {
            try {
                System.out.print("Digite o dia (1-31): ");
                dia = ler.nextInt();
                if (dia < 1 || dia > 31) {
                    System.out.println("[ERRO] Dia invalido. Deve estar entre 1 e 31.");
                } else {
                    this.dia = dia;
                    verif = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Digite um numero inteiro valido.");
                ler.next();
            }
        }
    }

    public void setMes() {
        int mes;
        boolean verif = true;

        while(verif) {
            try {
                System.out.print("Digite o mes (1-12): ");
                mes = ler.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("[ERRO] Mes invalida. Deve estar entre 1 e 12.");
                } else if ((this.mes == 2 && this.dia > 29) || (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia > 30) {
                    System.out.println("[ERRO] Mes invalido. A data para o mes nao existe.");
                } else {
                    this.mes = mes;
                    verif = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Digite um numero inteiro valido.");
                ler.next();
            }
        }
    }

    public void setAno() {
        int ano;
        boolean verif = true;

        while(verif) {
            try {
                System.out.print("Digite o ano (2025-2050): ");
                ano = ler.nextInt();
                if (ano < 2025 || ano > 2050) {
                    System.out.println("[ERRO] Ano invalido. Deve estar entre 2025 e 2050.");
                } else if (this.mes == 2 && this.dia ==29 && !(ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    System.out.println("[ERRO] Ano invalido. Dia 29 de fevereiro so existe em anos bissextos.");
                } else {
                    this.ano = ano;
                    verif = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Digite um numero inteiro valido.");
                ler.next();
            }
        }
    }

    //Getters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    //Métodos
    public String getData() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public boolean bissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    public static void apresentaDataAtual() {
        Date dataAtual = new Date();
        DateFormat dataFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + dataFormat.format(dataAtual));
    }
}