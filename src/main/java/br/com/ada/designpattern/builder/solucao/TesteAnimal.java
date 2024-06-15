package br.com.ada.designpattern.builder.solucao;

import java.lang.reflect.AnnotatedType;

public class TesteAnimal {

        public static void main(String[] args) {


                Animal animal = Animal.builder()
                        .nome("Rex")
                        .raca("Pastor Alemao")
                        .dono("Anderson")
                        .build();

                System.out.println(animal);
        }
}