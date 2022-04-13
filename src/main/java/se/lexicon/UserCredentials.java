package se.lexicon;

import java.util.UUID;

public class UserCredentials {

  private String id;
  private String username;
  private String password;
  private String role;

  public UserCredentials(String id, String username, String password, String role) {
    this.id = id;
    setUsername(username);
    setPassword(password);
    setRole(role);
  }

  public UserCredentials(String username, String password, String role) {
    this(UUID.randomUUID().toString(), username, password, role);
  }

  public String getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    if(username == null) throw new IllegalArgumentException("Username should not be null");
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if(password == null) throw new IllegalArgumentException("Password should not be null");
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    if(role == null) throw new IllegalArgumentException("Role should not be null");
    this.role = role;
  }
}
