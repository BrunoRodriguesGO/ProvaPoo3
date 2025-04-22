package com.example.projetofuncionariocrud.Util;

import com.example.projetofuncionariocrud.Model.FuncionarioModel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorCSV {

    public static void exportarFuncionarios(List<FuncionarioModel> funcionarios, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            // Cabeçalho do CSV
            writer.append("Matricula;Nome;CPF;DataNascimento;Cargo;Salario;DataContratacao;Logradouro;Numero;Complemento;Bairro;Cidade;Estado;CEP\n");

            for (FuncionarioModel f : funcionarios) {
                writer.append(f.toCSV()).append("\n");
            }

            System.out.println("Arquivo CSV gerado com sucesso em: " +
                    new java.io.File(nomeArquivo).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Erro ao gerar CSV: " + e.getMessage());
        }
    }
}
