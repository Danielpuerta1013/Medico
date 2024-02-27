package org.example;

import ui.UiMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //UiMenu.showMenu();

        Doctor miDoctor1=new Doctor("daniel","cirujano");
        Patient miPaciente=new Patient("sara","sara123@gmail.com");
        miPaciente.setPeso(60.9);
        System.out.println(miPaciente.getPeso());
        miDoctor1.addCitaDisponible(new Date(),"4Pm");
        miDoctor1.addCitaDisponible(new Date(),"10Pm");
        miDoctor1.addCitaDisponible(new Date(),"1Pm");
        System.out.println(miDoctor1.getCitasDis());

        for (Doctor.CitasDisponibles cd:miDoctor1.getCitasDis()) {
            System.out.println(cd.getDate()+ " "+cd.getTime());
        }




    }
}