import java.util.LinkedHashMap;
import java.util.Locale;

public class ZeichenZaehlen {

  LinkedHashMap<Character, Integer> countCharactersCaseSensitive(String input){
    LinkedHashMap<Character, Integer> dictionary = new LinkedHashMap<>();

    for(int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (dictionary.containsKey(currentChar)){
        dictionary.put(currentChar, dictionary.get(currentChar) + 1);
      }
      else
        dictionary.put(currentChar, 1);
    }

    return dictionary;
  }

  LinkedHashMap<Character, Integer> countCharactersCaseInsensitive(String input){
    LinkedHashMap<Character, Integer> dictionary = new LinkedHashMap<>();
    input = input.toLowerCase(Locale.ROOT);

    for(int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (dictionary.containsKey(currentChar)){
        dictionary.put(currentChar, dictionary.get(currentChar) + 1);
      }
      else
        dictionary.put(currentChar, 1);
    }

    return dictionary;
  }


}
