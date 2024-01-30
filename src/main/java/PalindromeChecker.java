public void setup() {
  String lines[] = loadStrings("palindromes.txt");
  System.out.println("there are " + lines.length + " lines");
  
  for (int i = 0; i < lines.length; i++) {
    if (palindrome(lines[i])==true) {
      System.out.println(lines[i] + " IS a palindrome.");
    } else {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}

public boolean palindrome(String word) {
  String simplifiedWord = new String();
  
  for (int i = 0; i  < word.length(); i++) {
    if ((! word.substring(i, i + 1).equals(" ")) && (Character.isLetter(word.charAt(i)))) {
      simplifiedWord = simplifiedWord + (word.substring(i, i + 1)).toLowerCase();
    }
  } 
  
  if (simplifiedWord.equals(reverse(word))) {
    return true;
  } else {
    return false;
  }
}

public String reverse(String str) {
  String result = new String();
  
  for (int i = str.length() - 1; i >= 0; i--) {
    if ((! str.substring(i, i + 1).equals(" ")) && (Character.isLetter(str.charAt(i)))) {
      result = result + (str.substring(i, i + 1)).toLowerCase();
    }
  } 
  
  return result;
}
