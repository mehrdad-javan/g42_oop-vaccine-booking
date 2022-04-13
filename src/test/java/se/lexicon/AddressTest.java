package se.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {


  public static final String STREET_ADDRESS = "Hjalmar petris väg 32";
  public static final String ZIP_CODE = "35247";
  public static final String CITY = "Växjö";

  private Address testObject;

  @BeforeEach
  public void setUp() {
    testObject = new Address(
            STREET_ADDRESS,
            ZIP_CODE,
            CITY
    );
  }

  @Test
  public void testObject_successfully_created() {
    assertNotNull(testObject);
    assertNotNull(testObject.getId());
    assertEquals(STREET_ADDRESS, testObject.getStreetAddress());
    assertEquals(ZIP_CODE, testObject.getZipCode());
    assertEquals(CITY, testObject.getCity());
  }

  @Test
  public void given_null_id_constructor_throws_runtime_exception() {
    //Address address = new Address(null, null,null,null);

    assertThrows(
            RuntimeException.class, new Executable() {
              @Override
              public void execute() throws Throwable {
               Address address = new Address(null, null,null);
              }
            }
    );
  }

}
