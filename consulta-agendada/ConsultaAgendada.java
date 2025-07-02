/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;

public class ConsultaAgendada {
    // Atributos
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade;
    private Scanner ler = new Scanner(System.in);

    // Métodos construtores
    public ConsultaAgendada() {
        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int d, int m, int a, int h, int mi, int s, String p, String me) {
        setData(d, m, a);
        setHora(h, mi, s);
        setNomePaciente(p);
        setNomeMedico(me);
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        setNomePaciente(p);
        setNomeMedico(m);
        quantidade++;
    }

    // Setters
    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        LocalDate hoje = LocalDate.now();
        Data dataInformada;

        while (true) {
            dataInformada = new Data();

            try {
                LocalDate dataAgendamento = LocalDate.of(dataInformada.getAno(), dataInformada.getMes(), dataInformada.getDia());

                if (dataAgendamento.isBefore(hoje) || dataAgendamento.isEqual(hoje)) {
                    System.out.println("[ERRO] A data da consulta nao pode ser anterior ou igual a data atual. Tente novamente.");
                } else {
                    break;
                }
            } catch (java.time.DateTimeException e) {
                System.out.println("[ERRO] A data informada eh invalida (" + dataInformada.getData() + "). Tente novamente.");
            }
        }

        this.data = dataInformada;
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente(String p) {
        try {
            if (p.length() < 3) {
                System.out.println("[ERRO] Nome invalido.");
            } else {
                this.nomePaciente = p;
            }
        } catch (InputMismatchException error) {
            System.out.println("[ERRO] Digite um nome valido.");
        }
    }

    public void setNomePaciente() {
        String paciente;
        boolean verif = true;

        while(verif) {
            try {
                System.out.print("Digite o nome do paciente: ");
                paciente = ler.nextLine();
                if (paciente.length() < 3) {
                    System.out.println("[ERRO] Nome invalido.");
                } else {
                    this.nomePaciente = paciente;
                    verif = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Digite um nome valido.");
                ler.next();
            }
        }
    }

    public void setNomeMedico(String m) {
        try {
            if (m.length() < 3) {
                System.out.println("[ERRO] Nome invalido.");
            } else {
                this.nomeMedico = m;
            }
        } catch (InputMismatchException error) {
            System.out.println("[ERRO] Digite um nome valido.");
        }
    }

    public void setNomeMedico() {
        String medico;
        boolean verif = true;

        while(verif) {
            try {
                System.out.print("Digite o nome do medico: ");
                medico = ler.nextLine();
                if (medico.length() < 3) {
                    System.out.println("[ERRO] Nome invalido.");
                } else {
                    this.nomeMedico = medico;
                    verif = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("[ERRO] Digite um nome valido.");
                ler.next();
            }
        }
    }

    // Getters
    public static int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.getData();
    }
    public String getHora() {
        return hora.getHorario();
    }
    public String getNomePaciente() {
        return nomePaciente;
    }
    public String getNomeMedico() {
        return nomeMedico;
    }
}