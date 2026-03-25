package src.estudos.javaintermediario.colecoes.test;

import java.util.ArrayList;
import java.util.List;

import src.estudos.javaintermediario.colecoes.dominio.SmartPhone;

public class SmartPhoneListTest1 {
    public static void main(String[] args) {
         
        SmartPhone s1 = new SmartPhone("1111", "Sansung");
        SmartPhone s2 = new SmartPhone("2222", "iphone");
        SmartPhone s3 = new SmartPhone("3333", "Xiaomi");

        List<SmartPhone> listaCelular = new ArrayList<>(6);
        listaCelular.add(s1);
        listaCelular.add(s2);
        listaCelular.add(s3);

        //listaCelular.clear(); // limpa tudo

        for (SmartPhone smartPhone : listaCelular) {
            System.out.println(smartPhone);
        }

        SmartPhone s4 = new SmartPhone("3333", "lg");
        // vai por oredem de iserção
        listaCelular.add(0, s4); // addcionar na posição 0
        System.out.println(listaCelular.contains(s4)); // ve se existe na lista, true pq nos definimos no nosso equals para comparar com o serialNumber  
        
        int indexSmarthPhone = listaCelular.indexOf(s4); // retorna o indice, caso ele não exista na lista, retorna -1
        System.out.println(indexSmarthPhone);

        System.out.println(listaCelular.get(indexSmarthPhone));

        SmartPhone s5 = new SmartPhone("3333", "iphon");

        if (listaCelular.contains(s5)) {
            System.out.println("ja existe na lista");
        }

        



    }
}
