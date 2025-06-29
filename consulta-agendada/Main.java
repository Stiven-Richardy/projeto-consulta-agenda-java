/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO I
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Main {
    public static void main (String[] args) {
        // Instanciando o objeto p1 com o construtor ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String me)
        ConsultaAgendada p1 = new ConsultaAgendada(10, 5, 2023, 14, 30, 0, "Stiven Richardy", "Dr. Guilherme");
        
        // Exibindo todas as propriedades de p1
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Medico: " + p1.getNomeMedico());
        System.out.println("--------------------------------");
        
        // Instanciando o objeto p2 com o construtor padrão
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println("--------------------------------");
        
        // Exibindo todas as propriedades de p2
        System.out.println("\nPropriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Medico: " + p2.getNomeMedico());
        System.out.println("--------------------------------");
        
        // Alterando as propriedades de p1
        p1.setData(15, 6, 2023);
        p1.setHora(16, 45, 0);
        p1.setNomePaciente("Guilherme Mendes");
        p1.setNomeMedico("Dr. Stiven");
        
        // Exibindo as propriedades de p1 novamente
        System.out.println("\nPropriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Medico: " + p1.getNomeMedico());
        System.out.println("--------------------------------");
        
        // Exibindo a quantidade final de consultas
        System.out.println("\nQuantidade final de consultas agendadas: " + ConsultaAgendada.getAmostra());
    }
}