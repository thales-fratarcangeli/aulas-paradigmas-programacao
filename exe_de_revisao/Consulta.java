import java.time.LocalDateTime;

public class Consulta {

    private LocalDateTime data;
    private float valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDateTime data, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String toString() {
        return "--- Consulta ---\n" +
               "Data: " + data + "\n" +
               "Valor: R$" + valorDaConsulta + "\n" +
               "Medico: " + medico.getNome() + " (" + medico.getEspecialidade() + ")\n" +
               "Paciente: " + paciente.getNome() + " (CPF: " + paciente.getCpf() + ")";
    }
}
