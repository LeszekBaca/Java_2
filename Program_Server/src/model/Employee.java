package model;
/**
 *
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa okreslajaca obiekty klasy Employee
 */
public class Employee {

    /**
     * Zmienna name typu String przechowujaca nazwisko Pracownika
     */
    private String name;
    /**
     * Zmienna paycheck typu double przechowujaca wyplate Pracownika
     */
    private double paycheck;
    /**
     * Zmienna typu calkowitego przechowujaca id Pracownika
     */
    private int id;
    /**
     * Konstruktor klasy Employee
     *
     * @param name zmienna typu String przechowujaca nazwisko Pracownika
     * @param paycheck zmienna typu double przechowujaca wyplate Pracownika
     * @param id zmienna tyou String przechowujaca id Pracownika
     */
    public Employee(int id, String name, double paycheck) {
        this.name = name;
        this.paycheck = paycheck;
        this.id = id;
    }

    /**
     * Metoda odpowiedziana za ustawianie nazwiska Pracownika
     * @param name typu String
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     * Metoda odpowiedzialna za ustawienie wyplaty Pracownika
     * @param paycheck typu double
     */
    public void setPaycheck(double paycheck) {
        this.paycheck = paycheck;
    }
    /**
     * Metoda odpowiedzialna za ustawienie id Pracownika
     * @param id  typu calkowitego
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metoda odpwiedzialna za pobranie id Pracownika
     * @return id typu calkowitego
     */
    public int getId() {
        return id;

    }

    /**
     * Funkcja odpowiedzialna za writingOut tekstu
     *
     * @return tekst typu String
     */
    public String toString() {

        return "ID: " + id + " Nazwisko: " + name + " Wyplata: " + paycheck;



    }
}
