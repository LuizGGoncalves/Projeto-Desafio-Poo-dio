package com.bootCamp.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BootCamp {
    private final LocalDate InicialDate;
    private LocalDate finalDate;
    private String name;
    private String desc;
    private List<Mentorias> mentorias;
    private List<Cursos> cursos;
    private List<Devs> devs;


    public BootCamp(String name, String desc, LocalDate finalDate) {
        this.InicialDate = LocalDate.now();
        this.finalDate = finalDate;
        this.name = name;
        this.desc = desc;
        this.mentorias = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public void addMentoria(String titulo, String desc, LocalDate data){
        this.mentorias.add(new Mentorias(titulo,desc,data));
    }
    public void addMentoria(Mentorias ... mentorias){
        for(Mentorias mentoria: mentorias){
            this.mentorias.add(mentoria);
        }
    }

    public void addCurso(String titulo, String desc, int i) {
        Cursos curso = new Cursos(titulo,desc,i);
        this.cursos.add(curso);
    }

    public void addCurso(Cursos ... cursos){
        for(Cursos curso: cursos){
            this.cursos.add(curso);
        }
    }

    public void addDev(String name){
        Devs dev = new Devs(name);
        this.devs.add(dev);
    }
    public void addDev(Devs dev){
        this.devs.add(dev);
    }

    public LocalDate getInicialDate() {
        return InicialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Mentorias> getMentorias() {
        return  mentorias;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public List<Devs> getDevs() {
        return devs;
    }

}
