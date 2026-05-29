package service;

import model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {

    private List<Tarefa> tarefas = new ArrayList<>();
    private int contadorId = 1;

    public void adicionar(String titulo, String descricao) {

        if (titulo == null || titulo.isEmpty()) {

            System.out.println("Título inválido.");
            return;
        }

        Tarefa tarefa = new Tarefa(contadorId++, titulo, descricao);

        tarefas.add(tarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listar() {

        if (tarefas.isEmpty()) {

            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (Tarefa tarefa : tarefas) {

            System.out.println("---------------------");
            System.out.println(tarefa);
        }
    }

    public void atualizar(int id, String novoTitulo, String novaDescricao) {

        for (Tarefa tarefa : tarefas) {

            if (tarefa.getId() == id) {

                tarefa.setTitulo(novoTitulo);
                tarefa.setDescricao(novaDescricao);

                System.out.println("Tarefa atualizada com sucesso!");

                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }

    public void remover(int id) {

        for (Tarefa tarefa : tarefas) {

            if (tarefa.getId() == id) {

                tarefas.remove(tarefa);

                System.out.println("Tarefa removida com sucesso!");

                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }
}