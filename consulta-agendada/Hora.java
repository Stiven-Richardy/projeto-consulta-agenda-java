/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Hora {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;
    
    //Métodos construtores
    public Hora() {
        this.setHora();
        this.setMinuto();
        this.setSegundo();
    }

    public Hora(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    //Setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setHora() {
        this.hora = 0;
    }

    public void setMinuto() {
        this.minuto = 0;
    }

    public void setSegundo() {
        this.segundo = 0;
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