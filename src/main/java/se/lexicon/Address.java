package se.lexicon;

import java.util.UUID;

public class Address {

  private String id;
  private String streetAddress;
  private String zipCode;
  private String city;

  public Address(String id, String streetAddress, String zipCode, String city) {
    if (id == null) throw new RuntimeException("id was null");
    this.id = id;
    setCity(city);
    setStreetAddress(streetAddress);
    setZipCode(zipCode);
  }

  public Address(String streetAddress, String zipCode, String city) {
    this(UUID.randomUUID().toString(),streetAddress,zipCode,city);
  }

  public String getId() {
    return id;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    if (streetAddress == null) throw new IllegalArgumentException("Parameter: String streetAddress was null");
    this.streetAddress = streetAddress;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    if (zipCode == null) throw new IllegalArgumentException("Parameter: String zipCode was null");
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    if (city == null) throw new IllegalArgumentException("Parameter: String city was null");
    this.city = city;
  }
}
