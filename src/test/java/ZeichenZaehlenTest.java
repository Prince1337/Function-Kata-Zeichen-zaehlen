import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class ZeichenZaehlenTest {

  ZeichenZaehlen zeichenZaehlen;

  @Test
  void countCharactersDasDarfNichtSein() {
    zeichenZaehlen = new ZeichenZaehlen();
    String input = "Das darf nicht sein";
    LinkedHashMap<Character, Integer> actual = zeichenZaehlen.countCharactersCaseSensitive(input);
    LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
    expected.put('D', 1);
    expected.put('a', 2);
    expected.put('s', 2);
    expected.put(' ', 3);
    expected.put('d', 1);
    expected.put('r', 1);
    expected.put('f', 1);
    expected.put('n', 2);
    expected.put('i', 2);
    expected.put('c', 1);
    expected.put('h', 1);
    expected.put('e', 1);
    expected.put('t', 1);

    assertEquals(expected, actual, "String: " + input);
  }

  @Test
  void countCharactersDasDarfNichtSeinCaseInsensitiv() {
    zeichenZaehlen = new ZeichenZaehlen();
    String input = "Das darf nicht sein";
    LinkedHashMap<Character, Integer> actual = zeichenZaehlen.countCharactersCaseInsensitive(input);
    LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
    expected.put('d', 2);
    expected.put('a', 2);
    expected.put('s', 2);
    expected.put(' ', 3);
    expected.put('r', 1);
    expected.put('f', 1);
    expected.put('n', 2);
    expected.put('i', 2);
    expected.put('c', 1);
    expected.put('h', 1);
    expected.put('e', 1);
    expected.put('t', 1);

    assertEquals(expected, actual, "String: " + input);
  }
}