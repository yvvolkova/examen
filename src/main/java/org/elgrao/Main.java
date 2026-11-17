package org.elgrao;

public class Main{
    public static void main(Srting[] arg) {
        Faker faker = new Faker();

        for (int i = 0; i < 10; i++) {
// Generar data
            String name = faker.name().fullName();
            String streetAddress = faker.address().streetAddress();

// Mostrar data
            System.out.println("Nombre: " + name);
            System.out.println("Dirección: " + streetAddress);
        }
    }
    }

