package se.lexicon;

import java.util.UUID;

public class Premises {

  private String id;
  private String name;
  private Address address;
  public ContactInfo contactInfo;

  public Premises(String id, String name, Address address, ContactInfo contactInfo) {
    if (id == null) throw new RuntimeException("Id was null");
    this.id = id;
    setName(name);
    setAddress(address);
    setContactInfo(contactInfo);
  }

  public Premises(String name, Address address, ContactInfo contactInfo) {
    this(UUID.randomUUID().toString(), name, address, contactInfo);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    if (address == null) throw new IllegalArgumentException("Address should not be null");
    this.address = address;
  }

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(ContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }
}
