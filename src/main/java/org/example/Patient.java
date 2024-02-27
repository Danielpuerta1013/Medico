package org.example;

public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String telefono;
    private String fechaNacimiento;
    private Double peso;
    private Double altura;
    String blood;
    Patient(String name, String email){
        this.name=name;
        this.email=email;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPeso() {
        return this.peso+"kg";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length()!=10){
            System.out.println("longitud de telefono incorrecta");
        }else {
            this.telefono = telefono;
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAltura() {
        return this.altura+" metros";
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
