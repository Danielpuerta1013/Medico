package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static int id=0;
    private String name;
    private String email;
    private String especialidad;
    Doctor(){
        System.out.println("construyendo el metodo doctor");

    }
    Doctor(String name, String especialidad){
        System.out.println("el nombre del doctor asignado es: "+ name);
        id++;
        this.name=name;
        this.especialidad=especialidad;
    }

    // comportamienos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("id doctor: "+id);
    }
    ArrayList<CitasDisponibles> citasDisponibles=new ArrayList<>();
    public void addCitaDisponible(Date date, String time){
        citasDisponibles.add(new Doctor.CitasDisponibles(date, time));
    }
    public ArrayList<CitasDisponibles> getCitasDis(){
        return citasDisponibles;
    }
    public static class CitasDisponibles{
        private int id;
        private Date date;
        private String time;

        public CitasDisponibles(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
