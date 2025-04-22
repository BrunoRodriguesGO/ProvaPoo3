package com.example.projetofuncionariocrud.Controller;

import com.example.projetofuncionariocrud.Model.FuncionarioModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioRepository {

    private final List<FuncionarioModel> funcionarios = new ArrayList<>();

    public List<FuncionarioModel> listarTodos() {
        return new ArrayList<>(funcionarios); // retorna uma cópia da lista
    }

    public void adicionar(FuncionarioModel funcionario) {
        funcionarios.add(funcionario);
    }

    public void remover(String matricula) {
        funcionarios.removeIf(f -> f.getMatricula().equals(matricula));
    }

    public List<FuncionarioModel> filtrarPorCargo(String cargo) {
        return funcionarios.stream()
                .filter(f -> f.getCargo().equalsIgnoreCase(cargo))
                .collect(Collectors.toList());
    }

    public List<FuncionarioModel> filtrarPorLocal(String local) {
        return funcionarios.stream()
                .filter(f -> f.getEndereco().getCidade().equalsIgnoreCase(local)
                        || f.getEndereco().getEstado().equalsIgnoreCase(local))
                .collect(Collectors.toList());
    }

    public List<FuncionarioModel> filtrarPorFaixaSalarial(java.math.BigDecimal min, java.math.BigDecimal max) {
        return funcionarios.stream()
                .filter(f -> f.getSalario().compareTo(min) >= 0 && f.getSalario().compareTo(max) <= 0)
                .collect(Collectors.toList());
    }
}
