package se.lexicon;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {
  private String id;
  private LocalDateTime dateTime;
  private double price;
  private String administrator;
  private String vaccineId;
  private boolean vacant;
  private Patient patient;
  private Premises premises;


  public Booking(String id,
                 LocalDateTime dateTime,
                 double price,
                 String administrator,
                 String vaccineId,
                 boolean vacant,
                 Patient patient,
                 Premises premises) {
    this.id = id;
    this.dateTime = dateTime;
    this.price = price;
    this.administrator = administrator;
    this.vaccineId = vaccineId;
    this.vacant = vacant;
    this.patient = patient;
    this.premises = premises;
  }

  public Booking(LocalDateTime dateTime,
                 double price,
                 String vaccineId,
                 Premises premises) {
    this(UUID.randomUUID().toString(), dateTime, price, null, vaccineId, true, null, premises);
  }

  public String getId() {
    return id;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    if(dateTime == null) throw new IllegalArgumentException("Parameter DateTime was null");
    this.dateTime = dateTime;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getAdministrator() {
    return administrator;
  }

  public void setAdministrator(String administrator) {
    this.administrator = administrator;
  }

  public String getVaccineId() {
    return vaccineId;
  }

  public void setVaccineId(String vaccineId) {
    if(dateTime == null) throw new IllegalArgumentException("Parameter VaccineId was null");
    this.vaccineId = vaccineId;
  }

  public boolean isVacant() {
    return vacant;
  }

  public void setVacant(boolean vacant) {
    this.vacant = vacant;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
    setVacant(this.patient == null);
  }

  public Premises getPremises() {
    return premises;
  }

  public void setPremises(Premises premises) {
    this.premises = premises;
  }

  public String bookingInformation() {
    return "Booking{" +
            "id='" + id + '\'' +
            ", dateTime=" + dateTime +
            ", price=" + price +
            ", administrator='" + administrator + '\'' +
            ", vaccineId='" + vaccineId + '\'' +
            ", vacant=" + vacant +
            '}';
  }

  @Override
  public String toString() {
    return "Booking{" +
            "id='" + id + '\'' +
            ", dateTime=" + dateTime +
            ", price=" + price +
            ", administrator='" + administrator + '\'' +
            ", vaccineId='" + vaccineId + '\'' +
            ", vacant=" + vacant +
            ", patient=" + patient +
            ", premises=" + premises +
            '}';
  }


}
