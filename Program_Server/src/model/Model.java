package model;

import java.util.Vector;

/**
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa odpowiedzialna za wykonywanie operacji CRUD na obiekcie typu Employee
 */
public class Model {

    /**
     * Utworzenie vectora pr do przechowywania obiektów typu Employee
     */
    Vector<Employee> pr = new Vector<>();
    /**
     * Konstruktor bezparametrowy klasy Model
     */
    public Model() {
    }
    /**
     * Metoda odpowiedzialna za dodawanie obiektów typu Employee do vectora
     * @param p typu Employee
     */
    public void add(Employee p) {
        pr.add(p);
    }
    
    /**
     * Metoda odpowiedzialna za usuwanie pracownikow o podanym numerze id, obiektów typu 
     * Employee z vectora
     * @param p typu Employee
     * @param id typu calkowitego
     * @return true jesli employee o danym id zostal znaleziony lub false
     * jezeli employee o danym ID nie zostal znaleziony
     */
    public boolean removeI(Employee p, int id) {
        for (Employee x : pr) {
            if (id == x.getId()) {
                if (pr.remove(x)) {
                    return true;
                }

            }

        }
        return false;

    }
    /**
     * Metoda odpowiedzialna za odczytanie pracownika o zadanym id
     * @param p
     * @param id
     * @return obiekt typu Employee o podanym numerze id; null gdy employee
     * nie zostal znaleziony
     */
    public Employee read(Employee p, int id) {
        for (Employee x : pr) {
            if (id == x.getId()) {
                return x;
            }
        }
        return null;
    }
    /**
     * Metoda odpowiedzialna za aktualizacje obiektu typu Employee o podanym
     * numerze id
     * @param id typu calkowitego
     * @param name typu String
     * @param paycheck typu double
     * @return nowy obiekt typu Employee o podanym numerze id; null gdy employee
     * nie zostal znaleziony
     */
    public Employee update(int id, String name, double paycheck)//odnajodwanie po id
    {
        for (Employee x : pr) {
            if (id == x.getId()) {
                x.setName(name);
                x.setPaycheck(paycheck);
                x.setId(id);
                pr.set(pr.indexOf(x), x);
                return x;
            }

        }
        return null;
    }
    /**
     * 
     * @param id typu calkowitego
     * @return true jesli employee o danym numerze id zostal znaleziony; false gdy employee
     * o danym numerze id nie zostal znaleziony
     */
    public boolean findingId(int id) {
        for (Employee x : pr) {
            if (id == x.getId()) {
                return true;
            }


        }
        return false;

    }
}
