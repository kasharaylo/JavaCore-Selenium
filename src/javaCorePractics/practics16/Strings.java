package javaCorePractics.practics16;

public class Strings {
    public static void main(String args[]) {

        String strSample = "RockStar";
        System.out.println(strSample);

        char[] arChar = strSample.toCharArray();
        for (int i = 0; i < arChar.length; i++) {
            if (i != 3) {
                System.out.print(arChar[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Character ae position 5: " + strSample.charAt(5));
        System.out.println("Index of character 'S': " + strSample.indexOf('S'));
        System.out.println("EndsWith character 'r': " + strSample.endsWith("r"));
        //Compare to
        System.out.println("Compare to 'ROCKSTAR': " + strSample.compareTo("rockstar"));
        System.out.println("Compare to 'ROCKSTAR' - Case Ignored: " + strSample.compareToIgnoreCase("ROCKSTAR"));
        System.out.println("Contains sequence 'tar': " + strSample.contains("tar"));
        System.out.println("Replace 'Rock' with 'Duke': " + strSample.replace("Rock", "Duke"));
        //Upper-Lower case
        System.out.println("Convert to LoverCse: " + strSample.toLowerCase());
        System.out.println("Convert to UpperCase: " + strSample.toUpperCase());
        //IndexOf
        String alphabet = "ABCDEFGHIKLMNOPQRSTVXYZ";
        int beginOfTheEnd = alphabet.indexOf("XYZ");
        System.out.println(beginOfTheEnd);
        //Substring
        String fullAddress = "3425 Stone Street, Apt. 2A, Jacksonville, FL 39404";
        String streetAddressAndCity = fullAddress.substring(0, fullAddress.indexOf(","));
        System.out.println(streetAddressAndCity);
        //Split
        String essay = "The ModernNerd coded everyday to build something great.";
        String[] allWordsInEssay = essay.split(" ");
        int numWorldsIEssay = allWordsInEssay.length;
        System.out.println("Word Count: " + numWorldsIEssay);
        //Reverse string
        String result = new StringBuffer(strSample).reverse().toString();
        System.out.println(result);
    }
}
