package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import controler.Server;
import view.PrintingOut;

/**
 *
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa Connect wykorzystywana jest za dokonywania polaczenia klient - serwer
 */
public class Connect extends Thread {
    /**
     * Utworzenie obiektu model typu Model
     */
    Model model = new Model();
    /**
     * Utworzenie zmiennej paycheck typu double
     */
    double paycheck;
    /**
     * Utworzenie zmiennej ind typu calkowitego
     */
    int ind;
    /**
     * Utworzenie zmiennej number typu calkowitego
     */
    int number;
    /**
     * Incjalizacja obiektu employee typu Employee
     */
    Employee employee;
    /**
     * Inicjalicacja obiektu in typu BufferedReader
     */
    public BufferedReader in;
    /**
     * Inicjalizacja obiektu out typu PrintWriter
     */
    public PrintWriter out;
    /**
     * Inicjalizacja obiektu writingOut typu PrintingOut
     */
    PrintingOut writingOut;
    /**
     * Inicjalizacja obiektu socket typu Socket
     */
    public Socket socket;
    /**
     * Konstruktor bezparametrowy klasy Connect
     */
    public Connect(){}
    /**
     * 
     * @param s typu Socket
     * @throws IOException gdy nie nawiazane bedzie polacznie
     */
    public Connect(Socket s) throws IOException {


        writingOut = new PrintingOut(this);
        socket = s;
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        start();
    }
    /**
     * Metoda run odpowiedzialna za funkcjonowanie (wykonywanie operacji) w serwerze
     */
    public void run()
    {

        try {

            while (true) {

                String str = in.readLine();
                String array[] = str.split(" ");


                if (str == null) {
                    break;
                }

                if (str.equals("QUIT")) {
                    break;
                }


                if ((array.length != 4) && (!(array[0].equals("READ"))) && (!(array[0].equals("DELETE")))
                        && (!(array[0].equals("UPDATE")) && (!(array[0].equals("CREATE"))))) {

                    writingOut.wrongMethods(1);
                    writingOut.wrongMethods(2);

                    Server.getWindow().add(writingOut.wrongMethod());

                }

                if ((array.length == 1) && (array[0].equals("READ"))) {
                    writingOut.questions(5);
                    writingOut.questions(6);
                    Server.getWindow().add(writingOut.newQuestion(5));
                    String newText = in.readLine();
                    try {
                        number = Integer.parseInt(newText);
                        if (!(model.findingId(number))) {
                            writingOut.answers(1);
                            writingOut.answers(2);
                            Server.getWindow().add(writingOut.answer());

                        } 
                        else {


                            writingOut.wrObject(model.read(employee, number), 1);
                            writingOut.wrObject(model.read(employee, number), 2);
                            Server.getWindow().add(writingOut.writeObject(model.read(employee, number)));
                        }

                    } catch (NumberFormatException e) {

                        writingOut.incorrectData(1);
                        writingOut.incorrectData(2);
                        Server.getWindow().add(writingOut.wrongData());

                    } catch (NullPointerException e) {

                        writingOut.noData(1);
                        writingOut.noData(2);
                        Server.getWindow().add(writingOut.noDataAvailable());
                    }
                }
                if ((array.length == 1) && (array[0].equals("DELETE"))) {
                    writingOut.questions(1);
                    writingOut.questions(2);
                    Server.getWindow().add(writingOut.newQuestion(1));
                    String newText = in.readLine();
                    try {
                        number = Integer.parseInt(newText);
                        if (!(model.findingId(number))) {
                            writingOut.answers(1);
                            writingOut.answers(2);
                            Server.getWindow().add(writingOut.answer());
                        } else {
                            if (model.removeI(employee, number) == true) {
                                writingOut.operation(1);
                                writingOut.operation(2);
                                Server.getWindow().add(writingOut.newOperation(1));
                            }



                        }
                    } catch (NumberFormatException e) {
                        writingOut.incorrectData(1);
                        writingOut.incorrectData(2);
                        Server.getWindow().add(writingOut.wrongData());
                    } catch (NullPointerException e) {
                        writingOut.noData(1);
                        writingOut.noData(2);
                        Server.getWindow().add(writingOut.noDataAvailable());
                    }

                }

                if ((array.length == 1) && (array[0].equals("UPDATE"))) {
                    writingOut.questions(3);
                    writingOut.questions(4);
                    Server.getWindow().add(writingOut.newQuestion(3));
                    String newText = in.readLine();
                    try {
                        number = Integer.parseInt(newText);
                        if (!(model.findingId(number))) {
                            writingOut.answers(1);
                            writingOut.answers(2);
                            Server.getWindow().add(writingOut.answer());
                        } else {
                            writingOut.giveSurname(1);
                            writingOut.giveSurname(2);
                            Server.getWindow().add(writingOut.givSurname());

                            String newTextT = in.readLine();

                            writingOut.giveSalary(1);
                            writingOut.giveSalary(2);
                            Server.getWindow().add(writingOut.giSalary());
                            String salar = in.readLine();
                            paycheck = Double.parseDouble(salar);
                            model.update(number, newTextT, paycheck);

                            writingOut.operation(5);
                            writingOut.operation(6);
                            Server.getWindow().add(writingOut.newOperation(5));

                        }
                    } catch (NumberFormatException e) {

                        writingOut.incorrectData(1);
                        writingOut.incorrectData(2);
                        Server.getWindow().add(writingOut.wrongData());
                    } catch (NullPointerException e) {
                        
                        writingOut.noData(1);
                        writingOut.noData(2);
                        Server.getWindow().add(writingOut.noDataAvailable());
                    }

                }

                if (array.length == 2 || array.length == 3) {
                    writingOut.wrongMethods(1);
                    writingOut.wrongMethods(2);
                    Server.getWindow().add(writingOut.wrongMethod());
                }

                if (array.length == 4) {
                    try {
                        paycheck = Double.parseDouble(array[3]);
                        ind = Integer.parseInt(array[1]);
                        if (model.findingId(ind)) {
                            writingOut.occupiedId(1);
                            writingOut.occupiedId(2);
                            Server.getWindow().add(writingOut.occId());
                        }



                        if ((array[0].equals("CREATE"))) {
                            Employee employee = new Employee(ind, array[2], paycheck);
                            model.add(employee);
                            writingOut.operation(3);
                            writingOut.operation(4);
                            Server.getWindow().add(writingOut.newOperation(3));

                        }

                    } catch (NumberFormatException e) {

                        writingOut.incorrectData(1);
                        writingOut.incorrectData(2);
                        Server.getWindow().add(writingOut.wrongData());
                    } catch (NullPointerException e) {

                        writingOut.noData(1);
                        writingOut.noData(2);
                        Server.getWindow().add(writingOut.noDataAvailable());
                    }

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {

            writingOut.wrongClosing(1);
            writingOut.wrongClosing(2);
            Server.getWindow().add(writingOut.wrClosing());

        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
