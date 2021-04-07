/*
    Halit Burak Yeşildal
    18050111043
 */

package com.company;


public class WordOperations {

    //remove characters except uppercase and lover case letters.
    public static String onlyLetters(String sentence){

        StringBuilder sb= new StringBuilder(sentence);
        for(int i=0;i<sb.length();i++)
            if((sb.charAt(i)>'z' || sb.charAt(i)<'a') && (sb.charAt(i)>'Z' ||  sb.charAt(i)<'A')){
                sb.deleteCharAt(i);
                i=0;
            }
        return sb.toString();
    }

   //divide sentence 2 and push the half of them. Then pop and check with other half.
    public static void isPalindrome(String sentence){
        MyDeque<Character> myDeque = new MyDeque<>();
        String  editedSentence= onlyLetters(sentence);

        for(int i=0;i<editedSentence.length()/2;i++)
            myDeque.push(editedSentence.charAt(i));

        if(check(editedSentence,myDeque))
            System.out.println(sentence+" : is Palindrome!\n*******************");
        else
            System.out.println(sentence+" : is not Palindrome!\n*******************");


    }

    //pop 1 letter and check with letter which from another half.
    private static boolean check(String sentence, MyDeque<Character> myDeque){
        int begin = (sentence.length()%2==1) ? sentence.length()/2+1: sentence.length()/2;
        Character tmp;
        boolean control=true;
        for(int i= begin;i<sentence.length();i++) {
            tmp = myDeque.pop();
            if (Character.toLowerCase(tmp) !=Character.toLowerCase(sentence.charAt(i))) {
                control = false;
                break;
            }
        }
        return control;

    }
}
