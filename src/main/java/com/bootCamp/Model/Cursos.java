package com.bootCamp.Model;

public class Cursos {
    private String titutlo;
    private String desc;
    private Integer cargaHoraria;

    public Cursos(String titutlo, String desc, Integer cargaHoraria) {
        this.titutlo = titutlo;
        this.desc = desc;
        this.cargaHoraria = cargaHoraria;
    }
    public Float calculaXp(){
         return this.cargaHoraria * 3.5f;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  titutlo  +
                "--cargaHoraria=" + cargaHoraria
                ;
    }
}
