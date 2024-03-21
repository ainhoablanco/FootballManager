package Football;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sortir;
        ArrayList<Equip> equips = new ArrayList<>();
        ArrayList<Persona> persones = new ArrayList<>();
        ArrayList<Jugador> jugadorsE1 = new ArrayList<>();
        ArrayList<Jugador> jugadorsE2 = new ArrayList<>();

        Entrenador entrenador1 = new Entrenador("Ainhoa", "Blanco", "28-02-2004", 6, 40000, 50,false);
        Equip equip1 = new Equip("Barça", 1932, "Barcelona", "Camp nou", "Joan", entrenador1, jugadorsE1);
        Entrenador entrenador2 = new Entrenador("Marc", "Plans", "02-06-2004", 7, 4000000, 42, true);
        Equip equip2 = new Equip("Real Madrid", 1934, "Madrid", "Santiago Bernabeu", "Florentino", entrenador2, jugadorsE2);
        Jugador jugador1 = new Jugador( "Eric", "Concejero", "17-06-2005", 8, 50000, 10, "DAV", 80, equip1);
        Jugador jugador2 = new Jugador( "Kathe", "Arancibia", "06-05-2004", 7, 48000, 16, "DEF", 70, null);
        Jugador jugador3 = new Jugador( "Ivan", "Garcia", "25-09-2005", 8, 55500, 35, "MIG", 80, equip2);
        Jugador jugador4 = new Jugador("Luis", "Fernandez", "14-01-2004", 7, 49500, 1, "POR", 70, null);
        Entrenador entrenador3 = new Entrenador("Africa", "Blanco", "28-02-2004", 6, 40000, 50,false);
        Entrenador entrenador4 = new Entrenador("Blanca", "Escude", "28-02-2004", 6, 40000, 50,false);
        Jugador jugador5 = new Jugador("Marta", "Gonzalez", "17-06-2005", 8, 50000, 10, "DAV", 80, equip1);
        Jugador jugador6 = new Jugador("Paula", "Bueno", "06-05-2004", 7, 48000, 16, "DEF", 70, null);


        persones.add(entrenador3);
        persones.add(entrenador4);
        persones.add(jugador5);
        persones.add(jugador6);
        jugadorsE1.add(jugador1);
        jugadorsE1.add(jugador3);
        jugadorsE2.add(jugador2);
        jugadorsE2.add(jugador4);
        equips.add(equip1);
        equips.add(equip2);


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
                    donarAltaEquip(equips, persones);
                    break;
                case 4:
                    donarAltaPersona(persones);
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
        }while (!sortir);
    }



    private static void donarAltaPersona(ArrayList<Persona> persones) {
        Scanner scanner = new Scanner(System.in);
        String opcio;

        System.out.println();
        System.out.println("Vols d'onar d'alta a un jugador o a un entrenador? ");
        opcio = scanner.nextLine();

        if (opcio.equalsIgnoreCase("entrenador")){
            System.out.println("Has escollit crear un entrenador");
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Cognom: ");
            String cognom = scanner.nextLine();
            System.out.print("Data neixament: " );
            String data = scanner.nextLine();
            System.out.print("Nivell motivació (1-10): ");
            int nivell = scanner.nextInt();
            System.out.print("Sou anual: ");
            int sou = scanner.nextInt();
            System.out.print("Numero de tornejos guanyats: ");
            int num = scanner.nextInt();
            String seleccionador;
            do{
                System.out.println("Has sigut seleccionador nacional? (true or false) ");
                seleccionador = scanner.nextLine();
            }while (!seleccionador.equalsIgnoreCase("si") && !seleccionador.equalsIgnoreCase("no"));

            boolean esSeleccionador;
            if (seleccionador.equalsIgnoreCase("si")){
                esSeleccionador = true;
            }else {
                esSeleccionador=false;
            }
            Entrenador e = new Entrenador(nom, cognom, data, nivell, sou, num, esSeleccionador);
            System.out.println("Entrenador " + e.getNom() + " creat amb éxit");

        } else if (opcio.equalsIgnoreCase("jugador")) {
            System.out.println();
            System.out.println("Has escollit crear un jugador");
            System.out.print("Nom: ");
            String nom = scanner.nextLine();
            System.out.print("Cognom: ");
            String cognom = scanner.nextLine();
            System.out.print("Data neixament: " );
            String data = scanner.nextLine();
            System.out.print("Nivell motivació (1-10): ");
            int nivell = scanner.nextInt();
            System.out.print("Sou anual: ");
            int sou = scanner.nextInt();
            System.out.print("Dorsal: ");
            int dorsal = scanner.nextInt();
            System.out.print("Posició (POR, DEF, MIG, DAV): " );
            String posicio = scanner.nextLine();
            scanner.next();
            System.out.print("Puntuació (1-10): ");
            int puntuacio = scanner.nextInt();

            Jugador j = new Jugador(nom,cognom,data,nivell,sou,dorsal,posicio,puntuacio);

            persones.add(j);

            System.out.println("Has creat el jugador: " + j.getNom());


        }else {
            System.out.println("Escull entre jugador o entrenador ");
        }
    }

    private static void donarAltaEquip(ArrayList<Equip> equips, ArrayList<Persona> persones) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Has escollit donar d'alta un Equip");
        System.out.println();
        System.out.print("Nom per l'equip: ");
        String nom = scanner.nextLine();
        boolean verdader = verificarNom(nom,equips);
        if (!verdader){

            System.out.print("Any fundació: ");
            int any = scanner.nextInt();
            System.out.print("Ciutat: " );
            String ciutat = scanner.nextLine();
            scanner.next();
            System.out.print("Estadi: ");
            String estadi = scanner.nextLine();
            scanner.next();
            System.out.print("President: ");
            String president = scanner.nextLine();
            scanner.next();

            Equip e = new Equip(nom, any, ciutat, estadi, president);
            equips.add(e);
            System.out.println("S'ha creat l'equip: " + e.getNomEquip());

        }else{

            System.out.println();
            System.out.println("Ja existeix un equip amb aquest nom");
        }
    }

    private static boolean verificarNom(String nom, ArrayList<Equip> equips) {
        int i = 0;
        boolean exit = false;
        while (!exit && i<equips.size()) {
            if (nom.equalsIgnoreCase(equips.get(i).getNomEquip())){
                exit = true;
            }else {
                i++;
            }
        }
        return exit;
    }


    private static void gestionarEquip(ArrayList<Equip> equips, ArrayList<Persona> persones ) {
        Scanner scanner = new Scanner(System.in);
        String equipEscollit;
        boolean seguir = true;
        int opcio;

        do{
            System.out.println("Quin equip vols gestionar?");
            System.out.print("Equip: ");

            equipEscollit = scanner.nextLine();
            int index=equipExisteix(equips,equipEscollit);
            if (index!=-1) {
                mostrarMenuGestioEquip();
                opcio = scanner.nextInt();

                switch (opcio) {
                    case 1:
                        donarDeBaixaEquip(equips.get(index),equips);
                        break;
                    case 2:
                        modificarPresident(equips.get(index));
                        break;
                    case 3:
                        destituirEntrenador(equips.get(index), persones);
                        break;
                    case 4:
                        fitxarJugadorEntrenador(equips.get(index), persones);
                        break;
                    case 5:
                        transferirJugador(equips.get(index), equips);
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

    private static void donarDeBaixaEquip(Equip equip, ArrayList<Equip> arrayEquips) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do{
            System.out.println("Estas segur que vols donar de baixa l'equip: " + equip.getNomEquip() + "?");
            resposta = scanner.nextLine();
        }while (!resposta.equalsIgnoreCase("si") && !resposta.equalsIgnoreCase("no"));

        if (resposta.equalsIgnoreCase("si")){
            arrayEquips.remove(equip);
            System.out.println("Equip " + equip.getNomEquip() + " donat de baixa");
        }else {
            System.out.println("No es donarà de baixa");
        }
    }

    private static void modificarPresident(Equip equip) {
        Scanner scanner = new Scanner(System.in);
        String nouPresident;

        System.out.println();
        System.out.print("Introdueix el nom del nou president de l'equip: ");
        nouPresident = scanner.nextLine();
        System.out.println();
        if (equip.getPresident() == null) {
            equip.setPresident(nouPresident);
            System.out.println("El president asignat és: " + nouPresident);
        } else if (equip.getPresident().equalsIgnoreCase(nouPresident)) {
            System.out.println("Atenció: " + nouPresident + " ja és el president actual de l'equip.");
        } else {
            equip.setPresident(nouPresident);
            System.out.println("S'ha actualitzat el president de l'equip, ara és: " + nouPresident);
        }
        System.out.println();

    }
    private static void destituirEntrenador(Equip equip, ArrayList<Persona> persones) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        do{
            System.out.println("Estas segur que vols destituir l'entrenador: " + equip.getEntrenador().getNom() +"?");
            resposta = scanner.nextLine();
        }while (!resposta.equalsIgnoreCase("si") && !resposta.equalsIgnoreCase("no"));

        if (resposta.equalsIgnoreCase("si")){
            System.out.println();
            //persones.add(equip.getEntrenador());
            equip.setEntrenador(null);
            System.out.println("Entrenador destituit");
            System.out.println();
        }else {
            System.out.println("No es destituirà");
        }

    }

    private static void fitxarJugadorEntrenador(Equip equip, ArrayList<Persona> persones) {

        Scanner scanner = new Scanner(System.in);
        String opcio;
        int personaFitxada;
        System.out.println("Vols fitxar un entrenador o un jugador? ");
        opcio= scanner.nextLine();
        if (opcio.equalsIgnoreCase("entrenador")){
            mostrarEntrenadors(persones);
            System.out.println("Quin entrenador vols fitxar? ");
            personaFitxada = scanner.nextInt();
            Persona p = buscarPersona(personaFitxada, persones);
            Entrenador e = (Entrenador) p;
            equip.setEntrenador(e);
            System.out.println("Has fitxat a: " + p.getNom());

        } else if (opcio.equalsIgnoreCase("jugador")) {
            mostrarJugadors(persones);
            System.out.println("Quin jugador vols fitxar? ");
            personaFitxada = scanner.nextInt();
            Persona p = buscarPersona(personaFitxada, persones);
            Jugador j = (Jugador) p;
            j.setEquip(equip);
            equip.getJugadors().add(j);
            System.out.println("Has fitxat a: " + p.getNom());
        }

    }

    private static Persona buscarPersona(int personaFitxada, ArrayList<Persona> persones) {
        boolean encontrado=false;
        int i = 0;
        while (!encontrado && i<persones.size()){
            if (personaFitxada==persones.get(i).getId()){
                encontrado=true;
            }else {
                i++;
            }
        }
        return persones.get(i);
    }

    private static void mostrarJugadors(ArrayList<Persona> persones) {
        for (Persona persona : persones) {
            if (persona instanceof Jugador) {
                System.out.println(persona.getId() + ". "+ persona.getNom());
            }
        }
    }

    private static void mostrarEntrenadors(ArrayList<Persona> persones) {
        for (Persona persona : persones) {
            if (persona instanceof Entrenador) {
                System.out.println(persona.getId() + ". " + persona.getNom());
            }
        }
    }


    private static void transferirJugador(Equip equip, ArrayList<Equip> equips) {
        int jugador;
        int equipATransferir;
        Jugador j;
        Equip e;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Jugadors: ");
        mostrarJugadorsEquip(equip.getJugadors());
        System.out.println("Quin jugador vols transferir?");

        jugador = scanner.nextInt();
        j = equip.getJugadors().get(jugador-1);

        mostrarEquips(equips);
        System.out.println("A quin equip el vols transferir?");

        equipATransferir = scanner.nextInt();
        e = equips.get(equipATransferir-1);

        j.trasnferirAEquip(e);

        System.out.println("S'ha transferit a "+ j.getNom() + " de l'equip " + equip.getNomEquip() + " a l'equip "+ e.getNomEquip());


    }

    private static void mostrarEquips(ArrayList<Equip> equips) {
        for (int i = 0; i <equips.size() ; i++) {
            System.out.println((i+1) + ". " + equips.get(i).getNomEquip());
        }
    }

    private static void mostrarJugadorsEquip(ArrayList<Jugador> jugadors) {
        for (int i = 0; i <jugadors.size() ; i++) {
           System.out.println((i+1) + ". " + jugadors.get(i).getNom());
        }
    }

    private static int equipExisteix(ArrayList<Equip> equips, String equipEscollit) {
        int i=0;
        boolean found=false;
       while (!found && i<equips.size()){
           if (equips.get(i).getNomEquip().equalsIgnoreCase(equipEscollit)){
               found=true;
           }
           else {
               i++;
           }
       }
       if (!found){
           i = -1;
       }
       return i;
    }

    private static void veureClassificacioLliga() {

    }

    private static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcio;

        do {
            System.out.println();
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