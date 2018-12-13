package skiena.three;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinearDictionaryTest {


  LinearDictionary linearDictionary = new LinearDictionary(10);

  @Test
  public void deleteElement() {
    assertTrue(linearDictionary.delete(3));
    assertFalse(linearDictionary.delete(3));
    assertThat(linearDictionary.search(3), is(-1));
    assertThat(linearDictionary.search(10), is(10));

    assertTrue(linearDictionary.insert(3));
    assertThat(linearDictionary.search(14), is(-1));
  }


}