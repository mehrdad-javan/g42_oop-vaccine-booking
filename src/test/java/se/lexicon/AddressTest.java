package se.lexicon;

// import the static method
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class AddressTest {

  Address testObject;

  @BeforeEach
  public void setup() {
    testObject = new Address("Hjlmar petris väg 32", "35247", "Växjö");
  }

  @Test
  public void testObject_successfully_created(){
    assertNotNull(testObject);
    String id = testObject.getId();
    assertNotNull(id);
    assertEquals("35247",testObject.getZipCode());
  }

  @Test
  public void given_null_id_constructor_throws_runtime_exception(){

    assertThrows(RuntimeException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Address address = new Address(null,null, null,null);
      }
    });

  }




}
