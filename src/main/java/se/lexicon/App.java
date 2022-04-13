package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {

    Address addressTeleborg = new Address("Teleborg", "35252", "Växjö");
    ContactInfo contactInfo = new ContactInfo("teleborg.test@test.se", "123456789");
    Premises teleborgPremises = new Premises("TeleborgPlace", addressTeleborg, contactInfo);


    Booking booking1 = new Booking(LocalDateTime.parse("2022-05-10T10:00:00"), 0, "VID123", teleborgPremises);
    Booking booking2 = new Booking(LocalDateTime.parse("2022-05-10T11:00:00"), 0, "VID124", teleborgPremises);
    Booking booking3 = new Booking(LocalDateTime.parse("2022-05-11T10:00:00"), 0, "VID125", teleborgPremises);
    Booking booking4 = new Booking(LocalDateTime.parse("2022-05-11T11:00:00"), 0, "VID126", teleborgPremises);

    System.out.println("Booking Table");
    System.out.println(booking1);
    System.out.println(booking2);
    System.out.println(booking3);
    System.out.println(booking4);
    System.out.println("----------------------");

    UserCredentials userCredentialsForPation1 = new UserCredentials("pation1", "123456", "user");
    ContactInfo contactInfoForPation1 = new ContactInfo("mehrdad.javan@lexicin.se", "123456789");
    Patient patient1 = new Patient("19890227-1234", "Mehrdad", "Javan", LocalDate.parse("1989-02-27"), userCredentialsForPation1, contactInfoForPation1);


    UserCredentials userCredentialsForPation2 = new UserCredentials("pation2", "111111", "user");
    ContactInfo contactInfoForPationt2 = new ContactInfo("simon.elbrink@lexicin.se", "999999999");
    Patient patient2 = new Patient("19900303-1234-1234", "Mehrdad", "Javan", LocalDate.parse("1990-03-03"), userCredentialsForPation2, contactInfoForPationt2);


    if (booking1.isVacant()) {
      booking1.setPatient(patient1);
    } else {
      System.out.println("Booking time is not valid!");
    }

    if (booking4.isVacant()) {
      booking4.setPatient(patient2);
    } else {
      System.out.println("Booking time is not valid!");
    }

    if (booking4.isVacant()) {
      booking4.setPatient(patient2);
    } else {
      System.out.println("Booking time is not valid!");
    }

    System.out.println("Booking Table");
    System.out.println(booking1);
    System.out.println(booking2);
    System.out.println(booking3);
    System.out.println(booking4);
    System.out.println("----------------------");


  }
}
