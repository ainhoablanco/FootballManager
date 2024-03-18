package Football;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sortir;
        ArrayList<Equip> equips = new ArrayList<>();
        ArrayList<Persona> persones = new ArrayList<>();
        Entrenador entrenador1 = new Entrenador("Ainhoa", "Blanco", "28-02-2004", 6, 40000, 50,false);
        persones.add(entrenador1);
        Equip equip1 = new Equip("Barça", 1932, "Barcelona", "Camp nou", "Joan", entrenador1);
        equips.add(equip1);
        Entrenador entrenador2 = new Entrenador("Marc", "Plans", "02-06-2004", 7, 4000000, 42, true);
        persones.add(entrenador2);
        Equip equip2 = new Equip("Real Madrid", 1934, "Madrid", "Santiago Bernabeu", "Florentino", entrenador2);
        equips.add(equip2);
        Jugador jugador1 = new Jugador("Eric", "Concejero", "17-06-2005", 8, 50000, 10, "DAV", 80);
        persones.add(jugador1);
        Jugador jugador2 = new Jugador("Kathe", "Arancibia", "06-05-2004", 7, 48000, 16, "DEF", 70);
        persones.add(jugador2);

        sortir = false;
        do {
            int opcio = mostrarMenu();


            switch (opcio) {
                case 0:
                    sortir = true;
                    break;
                case 1:
                    veureClassificacioLliga();//FER MÉS ENDEVANT//
                    break;
                case 2:
                    gestionarEquip(equips,persones);
                    break;
                case 3:
                    //donarAltaEquip();
                    break;
                case 4:
                    //donarAltaPersona();
                    break;
                case 5:
                    //consultarDadesEquip();
                    break;
                case 6:
                    //consultarDadesJugador();
                    break;
                case 7:
                    //disputarNovaLliga();
                    break;
                case 8:
                    //realitzarEntrenament();
                    break;
                case 9:
                    //carregarDadesEquip();//FER MÉS ENDEVANT//
                    break;
                case 10:
                    //desarDadesEquip();//FER MÉS ENDEVANT//
                    break;
            }
        }while (sortir=true);
    }

    private static void gestionarEquip(ArrayList<Equip> equips, ArrayList<Persona> persones ) {
        String equipEscollit;
        boolean seguir = true;
        int opcio;

        do{
            System.out.println("Quin equip vols gestionar?");
            System.out.print("Equip: ");
            equipEscollit = scanner.next();
            if (equipExisteix(equips, equipEscollit)) {
                mostrarMenuGestioEquip();
                opcio = scanner.nextInt();

                switch (opcio) {
                    case 1:
                        donarDeBaixaEquip(equips, equipEscollit);
                        break;
                    case 2:
                        modificarPresident(equips);
                        break;
                    case 3:
                        destituirEntrenador(equips, persones, equipEscollit);
                        break;
                    case 4:
                        fitxarJugadorEntrenador();
                        break;
                    case 5:
                        transferirJugador();
                        break;
                    case 0:
                        seguir=false;
                        break;
                }
            } else {
                System.out.println();
                System.out.println("L'equip no existeix en la llista d'equips.");
                System.out.println();
            }
        }while (!seguir);
    }

    private static void mostrarMenuGestioEquip() {
        System.out.println("\nTeam Manager:");
        System.out.println("1- Donar de baixa equip");
        System.out.println("2- Modificar president/a");
        System.out.println("3- Destituir entrenador/a");
        System.out.println("4- Fitxar jugador/a o entrenador/a");
        System.out.println("5- Transferir jugador/a");
        System.out.println("0- Sortir");
        System.out.print("Opció: ");
    }

    private static void donarDeBaixaEquip(ArrayList<Equip> equips, String equipEscollit) {
        System.out.println();
        Equip equipAEliminar = null;
        for (Equip equip : equips) {
            if (equip.getNomEquip().equalsIgnoreCase(equipEscollit)) {
                equipAEliminar = equip;
                break;
            }
        }
        if (equipAEliminar != null) {
            equips.remove(equipAEliminar);
            System.out.println("S'ha eliminat l'equip " + equipEscollit + " de la llista d'equips.");
        }
    }

    private static void modificarPresident(ArrayList<Equip> equips) {
        String nouPresident;

        System.out.println();
        System.out.print("Introdueix el nom del nou president de l'equip: ");
        nouPresident = scanner.next();

        for (Equip equip : equips) {
            if (equip.getPresident() == null) {
                equip.setPresident(nouPresident);
                System.out.println();
                System.out.println("El president asignat és: " + nouPresident);
                System.out.println();
            } else if (equip.getPresident().equalsIgnoreCase(nouPresident)) {
                System.out.println();
                System.out.println("Atenció: " + nouPresident + " ja és el president actual de l'equip.");
                System.out.println();
            } else {
                equip.setPresident(nouPresident);
                System.out.println();
                System.out.println("S'ha actualitzat el president de l'equip, ara és: " + nouPresident);
                System.out.println();
            }
            break;
        }
    }

    private static void destituirEntrenador(ArrayList<Equip> equips, ArrayList<Persona> persones, String equipEscollit) {



    }

    private static void fitxarJugadorEntrenador() {
        System.out.println();
        System.out.println("Has seleccionat fitxar jugador/a o entrenador/a.");
    }

    private static void transferirJugador() {
        System.out.println();
        System.out.println("Has seleccionat transferir jugador/a.");
    }

    private static boolean equipExisteix(ArrayList<Equip> equips, String equipEscollit) {
        for (Equip equip : equips) {
            if (equip.getNomEquip().equalsIgnoreCase(equipEscollit)) {
                return true;
            }
        }
        return false;
    }

    private static void veureClassificacioLliga() {

    }

    private static int mostrarMenu() {
        int opcio;
        do {
            System.out.println("Welcome to Politècnics Football Manager:");
            System.out.println();
            System.out.println("                   Menú: ");
            System.out.println("___________________________________________");
            System.out.println("1- Veure classificació lliga \uD83C\uDFC5");
            System.out.println("2- Gestionar equip");
            System.out.println("3- Donar d'alta equip");
            System.out.println("4- Donar d'alta jugador/a o entrenador/a");
            System.out.println("5- Consultar dades equip");
            System.out.println("6- Consultar dades jugador/a");
            System.out.println("7- Disputar nova lliga");
            System.out.println("8- Realitzar sessió entrenament");
            System.out.println("9- Carregar dades equips \uD83C\uDFC5");
            System.out.println("10- Desar dades equips \uD83C\uDFC5");
            System.out.println("0- Sortir");
            System.out.println();
            System.out.println("Que desitjes fer?");
            System.out.print("Opció: ");
            opcio = scanner.nextInt();
            System.out.println();
        }while (opcio>10);

        return opcio;
    }


}