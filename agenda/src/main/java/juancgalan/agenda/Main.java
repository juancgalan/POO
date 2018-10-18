package juancgalan.agenda;

public class Main {
  public static void main(String... args) {
    Agenda agenda = new Agenda();
    agenda.addContact("Juan",
        "Galan",
        "Algun lado",
        "753175");
    agenda.addContact("Eduardo",
        "Rosas",
        "Nowhere",
        "5175317");
    System.out.println(agenda);
    Contact found = agenda.searchContact("Juan");
    System.out.println(found);
    agenda.deletContact("Juan");
    found = agenda.searchContact("Juan");
    System.out.println(found);
    agenda.updateContact("Eduardo",
        "Ro",
        "where",
        "5");
    found = agenda.searchContact("Eduardo");
    System.out.println(found);
  }
}
