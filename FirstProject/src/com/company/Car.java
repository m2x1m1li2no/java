package com.company;

public abstract class Car {
        //attributes
        String modelo;
        String fabricante;
        String color;
        Double peso;
        Double largo;
        Integer velocidad = 0;

        //builders
        public Car(String color, String modelo, String fabricante, Double peso, Double largo) {
        this.modelo = modelo;
        this.color = color;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
        }

        //behaviour
        public void acelerar(Integer cantidad){
                this.velocidad += cantidad;
        }



        @Override
        public String toString() {
                return "Car{" +
                        "modelo='" + modelo + '\'' +
                        ", fabricante='" + fabricante + '\'' +
                        ", color='" + color + '\'' +
                        ", peso=" + peso +
                        ", largo=" + largo +
                        ", velocidad=" + velocidad +
                        '}';
        }
}