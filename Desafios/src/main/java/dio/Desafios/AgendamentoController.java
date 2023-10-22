package dio.Desafios;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    private List<Agendamento> agendamentos = new ArrayList<>();
    private long idCounter = 1;

    @GetMapping
    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }

    @PostMapping
    public Agendamento criarAgendamento(@RequestBody Agendamento agendamento) {
        agendamento.setId(idCounter++);
        agendamentos.add(agendamento);
        return agendamento;
    }

    @GetMapping("/{id}")
    public Agendamento obterAgendamento(@PathVariable long id) {
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getId() == id) {
                return agendamento;
            }
        }
        return null;
    }
}
