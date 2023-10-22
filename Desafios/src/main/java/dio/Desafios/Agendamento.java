package dio.Desafios;

import java.time.LocalDateTime;

public class Agendamento {
    private long id;
    private String nomeCliente;
    private LocalDateTime dataHora;

    // getters e setters
    public long getId(){
        return id;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public void setId(long l) {
    }
}
