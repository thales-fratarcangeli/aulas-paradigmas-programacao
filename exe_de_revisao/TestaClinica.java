import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {

        Medico m1 = new Medico(1, "Dr. Carlos", "Cardiologia");
        Paciente p1 = new Paciente(1, "Joao Silva", "123.456.789-00");

        // consulta para 20/05/2026
        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 30);
        Consulta c1 = new Consulta(dataConsulta, 250.00f, m1, p1);

        System.out.println(c1.toString());
    }
}
