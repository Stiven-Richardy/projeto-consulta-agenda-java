/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Main {
    public static void main (String[] args) {
        // Instanciando o objeto p1
        ConsultaAgendada p1 = new ConsultaAgendada(29, 12, 2025, 14, 30, 0, "Stiven Richardy", "Dr. Guilherme");

        // Exibindo todas as propriedades de p1
        System.out.println("----------------------------------------------");
        System.out.println("| Propriedades de p1:");
        System.out.println("| Data: " + p1.getData());
        System.out.println("| Hora: " + p1.getHora());
        System.out.println("| Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("| Nome do Medico: " + p1.getNomeMedico());
        System.out.println("----------------------------------------------");

        // Exibe data atual
        Data.apresentaDataAtual();
        System.out.println("----------------------------------------------");
        
        // Instanciando o objeto p2
        ConsultaAgendada p2 = new ConsultaAgendada();
        
        // Exibindo todas as propriedades de p2
        System.out.println("----------------------------------------------");
        System.out.println("| Propriedades de p2:");
        System.out.println("| Data: " + p2.getData());
        System.out.println("| Hora: " + p2.getHora());
        System.out.println("| Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("| Nome do Medico: " + p2.getNomeMedico());
        System.out.println("----------------------------------------------");
        
        // Alterando as propriedades de p1
        p1.setData(20, 11, 2025);
        p1.setHora(16, 45, 0);
        p1.setNomePaciente("Guilherme Mendes");
        p1.setNomeMedico("Dr. Stiven");
        
        // Exibindo as propriedades de p1 novamente
        System.out.println("| Propriedades de p1 alteradas:");
        System.out.println("| Data: " + p1.getData());
        System.out.println("| Hora: " + p1.getHora());
        System.out.println("| Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("| Nome do Medico: " + p1.getNomeMedico());
        System.out.println("----------------------------------------------");
        
        // Exibindo a quantidade final de consultas
        System.out.println("| Quantidade final de consultas agendadas: " + ConsultaAgendada.getAmostra());
        System.out.println("----------------------------------------------");
    }
}