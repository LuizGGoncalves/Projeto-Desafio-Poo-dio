package com.bootCamp.Model;

import java.util.ArrayList;
import java.util.List;

public class Devs {
    private String name;
    private List<Mentorias> mentorias;
    private List<Cursos> atividadeFeita;
    private List<Cursos> inscrito;

    public Devs(String name) {
        this.name = name;
        this.mentorias = new ArrayList<>();
        this.atividadeFeita = new ArrayList<>();
        this.inscrito = new ArrayList<>();
    }

    public List<Cursos> exibirCursos(){
        System.out.println(this.getAtividadeFeita());
        return this.getAtividadeFeita();
    }

    public Float calcularXp(){
        Float soma = 0f;
        for(Cursos curso: this.getAtividadeFeita()){
            soma += curso.calculaXp();
        }
        for(Mentorias mentoria: this.getMentorias()){
            soma += mentoria.calculaXp();
        }
        return soma;
    }

    public void inscrever(BootCamp bootCamp){
        bootCamp.addDev(this);
        this.inscrito.addAll(bootCamp.getCursos());
    }

    public void progredir(Cursos... cursos){
        for(Cursos curso: cursos){
            this.atividadeFeita.add(curso);
            this.inscrito.remove(curso);
        }
    }

    public void progredir(Mentorias ... mentorias){
        for(Mentorias mentoria: mentorias){
            this.mentorias.add(mentoria);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mentorias> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentorias> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Cursos> getAtividadeFeita() {
        return atividadeFeita;
    }

    public void setAtividadeFeita(List<Cursos> atividadeFeita) {
        this.atividadeFeita = atividadeFeita;
    }

    public List<Cursos> getInscrito() {
        return inscrito;
    }

    public void setInscrito(List<Cursos> inscrito) {
        this.inscrito = inscrito;
    }

    @Override
    public String toString() {
        return  this.getName() + " " +
                "mentorias=" + mentorias +
                ", atividadeFeita=" + atividadeFeita +
                ", inscrito=" + inscrito +
                '}';
    }
}
