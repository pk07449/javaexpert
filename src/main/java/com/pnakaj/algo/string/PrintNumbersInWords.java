package com.pnakaj.algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pankaj on 6/1/2017.
 */
public class PrintNumbersInWords {


    public static void main(String[] args) {
        System.out.println(convertNumberToWord("132562",100000,""));
    }

    private static Map<String,String> getNumberTypes() {
        Map<String,String> numbersTypes = new HashMap<String, String>();
        numbersTypes.put("1","one");
        numbersTypes.put("2","two");
        numbersTypes.put("3","three");
        numbersTypes.put("4","four");
        numbersTypes.put("5","five");
        numbersTypes.put("6","six");
        numbersTypes.put("7","seven");
        numbersTypes.put("8","eight");
        numbersTypes.put("9","nine");
        numbersTypes.put("10","ten");
        numbersTypes.put("11","eleven");
        numbersTypes.put("12","tweleve");
        numbersTypes.put("13","thirteen");
        numbersTypes.put("14","fourteen");
        numbersTypes.put("15","fivteen");
        numbersTypes.put("16","sixteen");
        numbersTypes.put("17","seventeen");
        numbersTypes.put("18","eighteen");
        numbersTypes.put("19","nineteen");
        numbersTypes.put("20","twenty");
        numbersTypes.put("30","thirty");
        numbersTypes.put("40","fourty");
        numbersTypes.put("50","fivety");
        numbersTypes.put("60","sixty");
        numbersTypes.put("70","seventy");
        numbersTypes.put("80","eithty");
        numbersTypes.put("90","ninety");
        numbersTypes.put("100","hundred");
        numbersTypes.put("1000","thousand");
        numbersTypes.put("100000","lacks");
        numbersTypes.put("10000000","crore");

        return numbersTypes;
    }

    private static String convertNumberToWord(String number,int supportNumberToBePrintUpto,String wordToPrint) {
        if(number.length() < supportNumberToBePrintUpto) {
            String updatedWordToPrint = isRemaingNumberApartFromGreaterThanTwo(number) ?
                    handlingToPrintApartFromLastTwoDigit(number, supportNumberToBePrintUpto, wordToPrint) :
                    handlingToPrintLastTwoDigit(number, wordToPrint);
            return  convertNumberToWord(number.substring(1),supportNumberToBePrintUpto/10,updatedWordToPrint);
    }

    return wordToPrint;


}

    private static boolean isRemaingNumberApartFromGreaterThanTwo(String number) {
        return number.length() != 2;
    }

    private static String handlingToPrintApartFromLastTwoDigit(String number, int upto, String word) {
        if(getNumberTypes().get(""+upto) == null){
            word += " "+ getNumberTypes().get(""+Integer.parseInt(""+number.charAt(0))*10);
        } else {
            word += " "+ getNumberTypes().get(""+number.charAt(0)) + getNumberTypes().get(""+upto) ;
        }
        return word;
    }

    private static String handlingToPrintLastTwoDigit(String number, String word) {
        word += " "+getNumberTypes().get(""+(Integer.parseInt(number)/10)*10) + getNumberTypes().get(""+Integer.parseInt(number)%10);
        return word;
    }
}
