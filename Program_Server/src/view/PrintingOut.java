package view;

import model.Connect;
import model.Employee;

/**
 *
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa odpowiedzialna za wypisywanie komunikatow
 */
public class PrintingOut {
    /**
    * Inicjalizacja obiektu connect klasy Connect
    */
    Connect connect;
/**
 * Konstruktor klasy PrintingOut
 * @param connect typu String
 */
    public PrintingOut(Connect connect) {
        this.connect = connect;

    }
/**
 * Metoda odpowiedzialna za wypisanie tekstu o Nierozpoznaniu polecenia
 * @param method typu calkowitego
 */
    public void wrongMethods(int method) {
        if (method == 1) {
            connect.out.println("Nierozpoznane polecenie\n");
        }
        if (method == 2) {
            System.out.println("Nierozpoznane polecenie\n");
        }
    }
/**
 * Metoda odpowiedzialna za wypisanie tekstu o Nierozpoznaniu polecnia
 * @return tekst typu String
 */
    public String wrongMethod() {
        return "Nierozpoznane polecenie\n";
    }
/**
 * Metoda odpowiedzialna za wypisanie tekstu nt. nie poprawnych danych
 * @param method typu calkowitego
 */
    public void incorrectData(int method) {
        if (method == 1) {
            connect.out.println("Nie poprawny tym danych. Poprawne dane to liczy calkowite lub"
                    + "zmiennoprzecinkowe\n");
        }
        if (method == 2) {
            System.out.println("Nie poprawny tym danych. Poprawne dane to liczy calkowite lub"
                    + "zmiennoprzecinkowe\n");
        }

    }
/**
* Metoda odpowiedzialna za wypisanie tekstu nt. nie poprawnych danych
 * @return tekst typu String
 */
    public String wrongData() {
        return "Nie poprawny tym danych. Poprawne dane to liczy calkowite lub"
                + "zmiennoprzecinkowe\n";

    }
/**
 * Metoda odpowiedzialna za wypisywanie tekstu o nie znalezieniu id pracownika
 * @param method typu calkowitego
 */
    public void answers(int method) {
        if (method == 1) {
            connect.out.println("Employee o podanym ID nie istnieje\n");
        }
        if (method == 2) {
            System.out.println("Employee o podanym ID nie istnieje\n");
        }
    }
/**
 * * Metoda odpowiedzialna za wypisywanie tekstu o nie znalezieniu id pracownika
 * @return tekst typu String
 */
    public String answer() {
        return "Employee o podanym ID nie istnieje\n";

    }
/**
 * Metoda informujaca o braku wpisanych danych
 * @param method  typu calkowitego
 */
    public void noData(int method) {
        if (method == 1) {
            connect.out.println("Nie wpisano zadnych danych\n");
        }
        if (method == 2) {
            System.out.println("Nie wpisano zadnych danych\n");
        }

    }
/**
 * Metoda informujaca o braku wpisanych danych 
 * @return tekst typu String
 */
    public String noDataAvailable() {

        return "Nie wpisano zadnych danych\n";

    }
/**
 * Metoda wyswietlajaca tekst z zapytaniem nt. usuniecia, aktualizowania 
 * lub wypisania Pracownika o danych id
 * @param method typu calkowitego
 */
    public void questions(int method) {
        if (method == 1) {
            connect.out.println("Pracownika o jakim ID usunac?\n");
        }
        if (method == 2) {
            System.out.println("Pracownika o jakim ID usunac?\n");
        }

        if (method == 3) {
            connect.out.println("Pracownika o jakim ID aktualizowac?\n");
        }
        if (method == 4) {
            System.out.println("Pracownika o jakim ID aktualizowac?\n");
        }

        if (method == 5) {
            connect.out.println("Pracownika o jakim ID wypisac?\n");
        }
        if (method == 6) {
            System.out.println("Pracownika o jakim ID wypisac?\n");
        }

    }
/**
 * Metoda wyswietlajaca tekst z zapytaniem nt. usuniecia, aktualizowania 
 * lub wypisania Pracownika o danym id
 * @param method typu calkowitego
 * @return tekst typu String z pytaniem o usuniecie, aktualizowanie lub wypisanie
 * Pracownika o danym id
 */
    public String newQuestion(int method) {

        if (method == 1) {
            return "Pracownika o jakim ID usunac?\n";
        }
        if (method == 3) {
            return "Pracownika o jakim ID aktualizowac?\n";
        }
        if (method == 5) {
            return "Pracownika o jakim ID wypisac?\n";
        }

        return null;

    }
/**
 * Metoda informujaca o dokonanej operacji
 * @param method typu calkowitego
 */
    public void operation(int method) {
        if (method == 1) {
            connect.out.println("Usunieto pracownika\n");
        }
        if (method == 2) {
            System.out.println("Usunieto pracownika\n");
        }
        if (method == 3) {
            connect.out.println("Dodano pracownika\n");
        }
        if (method == 4) {
            System.out.println("Dodano pracownika\n");
        }
        if (method == 5) {
            connect.out.println("Zaktualizowano pracownika\n");
        }
        if (method == 6) {
            System.out.println("Zaktualizowano pracownika\n");
        }
    }
/**
 * Metoda informujaca o dokonanej operacji
 * @param method typu calkowitego
 * @return tekst typu String nt. dokonanej operacji
 */
    public String newOperation(int method) {
        if (method == 1) {
            return "Usunieto pracownika\n";
        }
        if (method == 3) {
            return "Dodano pracownika\n";
        }
        if (method == 5) {
            return "Zaktualizowano pracownika\n";
        }
        return null;
    }
/**
 * Metoda odpowiedzialna za wypisanie obiektu typu Employee
 * @param p typu Employee
 * @param method typu calkowitego
 */
    public void wrObject(Employee p, int method) {
        if (method == 1) {
            connect.out.println(p + "\n");
        }
        if (method == 2) {
            System.out.println(p + "\n");
        }
    }
/**
 * Metoda odpowiedzialna za wypisanie obiektu typu Employee
 * @param p typu Employee
 * @return tekst typu String (wypisanie obiektu typu Employee)
 */
    public String writeObject(Employee p) {
        return p.toString() + "\n";
    }
/**
 * Metoda informujaca o zamknieciu polaczenia
 * @param method typu calkowitego
 */
    public void wrongClosing(int method) {
        if (method == 1) {
            connect.out.println("Zamkniecie polaczenia\n");
        }
        if (method == 2) {
            System.out.println("Zamkniecie polaczenia\n");
        }
    }
/**
 * Metoda  informujaca o zamknieciu polaczenia
 * @return teskt typu String informujacy o zamknieciu polaczenia
 */
    public String wrClosing() {
        return "Zamkniecie polaczenia\n";
    }
/**
 * Metoda informujaca o zajetym numerze id
 * @param method typu calkowitego
 */
    public void occupiedId(int method) {
        if (method == 1) {
            connect.out.println("Wskazane ID jest juz przydzielone innemu pracownikowi\n");
        }
        if (method == 2) {
            System.out.println("Wskazane ID jest juz przydzielone innemu pracownikowi\n");
        }
    }
/**
 * Metoda informujaca o zajetym id
 * @return tekst typu String informujacy o zajetym numerze id
 */
    public String occId() {
        return "Wskazane ID jest juz przydzielone innemu pracownikowi\n";
    }
/**
 * Metoda wypisujaca tekst z prosba o podanie nazwiska pracownika
 * @param method typu calkowitego
 */
    public void giveSurname(int method) {
        if (method == 1) {
            connect.out.println("Podaj nazwisko pracownika\n");
        }
        if (method == 2) {
            System.out.println("Podaj nazwisko pracownika\n");
        }

    }
/**
 * Metoda wypisujaca tekst z prosba o podanie nazwiska pracownika
 * @return teskt typu String z prosba o podanie nazwiska pracownika
 */
    public String givSurname() {

        return "Podaj nazwisko pracownika\n";

    }
/**
 * Metoda wypisujaca tekst z prosba o podanie pensji pracownika
 * @param method typu calkowitego
 */
    public void giveSalary(int method) {
        if (method == 1) {
            connect.out.println("Podaj pensje pracownika\n");
        }
        if (method == 2) {
            System.out.println("Podaj pensje pracownika\n");
        }

    }
/**
 * Metoda wypisujaca tekst z prosba o podanie pensji pracownika
 * @return tekst typu String z prosba o podanie pensji pracownika
 */
    public String giSalary() {
        return "Podaj pensje pracownika\n";
    }
}
