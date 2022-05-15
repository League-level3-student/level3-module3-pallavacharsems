package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
  StringBuilder stri = new StringBuilder(str);
 stri.append(characters);  
 
  return stri.toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder stri = new StringBuilder(str);
    	stri.reverse();
    	return stri.toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder stri = new StringBuilder(str);
    	stri.insert(index, newChar);
    	return stri.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder stri = new StringBuilder(str);
    	stri.delete(startIndex, endIndex);
    	return stri.toString();
    }
}