package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int id_funcionario;
    private String setor;

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public Funcionario (String nome, int id_funcionario, String setor){
        this.nome= nome;
        this.id_funcionario= id_funcionario;
        this.setor = setor;
    }






}
