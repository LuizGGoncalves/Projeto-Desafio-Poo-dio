package com.bootCamp;

import com.bootCamp.Model.BootCamp;
import com.bootCamp.Model.Cursos;
import com.bootCamp.Model.Devs;
import com.bootCamp.Model.Mentorias;

import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        BootCamp bootCamp = new BootCamp("BootExperimental","Boot camp experimental", LocalDate.of(2022,4,30));
        Cursos curso1 = new Cursos("Java basico","Basico sobre java",30);
        Cursos curso2 = new Cursos("JavaScript basico","Basico sobre javaScript",40);
        Cursos curso3 = new Cursos("CSS basico","Basico sobre css",20);
        Mentorias mentoria1 = new Mentorias("Bem vindo ao boot camp","Saudaçoes e orientaçoes sobre o boot camp",LocalDate.of(2022,4,6));
        Mentorias mentoria2 = new Mentorias("Boas Praticas","Mentoria sobre boas praticas na programçao",LocalDate.of(2022,4,8));
        bootCamp.addCurso(curso1,curso2,curso3);
        bootCamp.addMentoria(mentoria1,mentoria2);

        Devs devPedro = new Devs("Pedro");
        Devs devMarcela = new Devs("Marcela");
        devMarcela.inscrever(bootCamp);
        devMarcela.progredir(curso1,curso2);
        devMarcela.progredir(mentoria1);
        devMarcela.progredir(mentoria2);
        System.out.println(devMarcela.toString());
        System.out.println("Marcela possui -> "+devMarcela.calcularXp()+" XP");

        devPedro.inscrever(bootCamp);
        devPedro.progredir(mentoria1);
        devPedro.progredir(curso3);
        System.out.println(devPedro.toString());
        System.out.println("Pedro possui --> "+ devPedro.calcularXp()+" XP");
    }
}
