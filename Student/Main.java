/*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */

package Student;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        ArrayList<Student> listaStudenata = new ArrayList<>();
        ArrayList<Student> studentiPolozili = new ArrayList<>();

        Student student;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Unersite podatke o stduentu ili quit da izadjete iz programa: ");
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.next();
            if (prezime.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Unesite ocena studenta: ");
            int ocena = scanner.nextInt();
            if (("" + ocena).equalsIgnoreCase("quite")){
                break;
            }
            student = new Student(ime, prezime, ocena);
            listaStudenata.add(student);
        }

        for (int i = 0; i < listaStudenata.size(); i++) {
            if (listaStudenata.get(i).getOcena() > 5){
                studentiPolozili.add(listaStudenata.get(i));
            }
        }

        System.out.println("Svi studenti: " + listaStudenata);
        System.out.println("Studenti koji su polozili: " + studentiPolozili);

    }
}
