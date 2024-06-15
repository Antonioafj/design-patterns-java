package br.com.ada.designpattern.singleton.solucao;

import br.com.ada.designpattern.singleton.problema.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//
//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sabado");


        /* AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        Constructor<AgendaSingletonLAZY> construtorTavesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTavesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa = construtorTavesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTavesso.newInstance();

        System.out.println(agendaTravessa);
        System.out.println(agendaTravessa2);


        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");

*/
        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

//        Constructor<AgendaSingletonENUM> construtorTavesso = AgendaSingletonENUM.class.getDeclaredConstructor();
//        construtorTavesso.setAccessible(true);
//        AgendaSingletonENUM agendaTravessa = construtorTavesso.newInstance();
//        AgendaSingletonENUM agendaTravessa2 = construtorTavesso.newInstance();
//
//        System.out.println(agendaTravessa);
//        System.out.println(agendaTravessa2);


        reservaDiaENUM("Sexta");
        reservaDiaENUM("Sabado");
    }

//    public static void reservaDiaEAGER(String dia){
//        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
//        agenda.ocupa(dia);
//        System.out.println(agenda.getDias());

//
//    public static void reservaDiaLAZY(String dia){
//        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
//        agenda.ocupa(dia);
//        System.out.println(agenda.getDias());
//    }

    public static void reservaDiaENUM(String dia){
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
