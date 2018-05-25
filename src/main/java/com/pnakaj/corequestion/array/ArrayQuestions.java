package com.pnakaj.corequestion.array;

/**
 * Created by pankaj on 5/22/2018.
 */
public class ArrayQuestions {

    public static void main(String[] args) {

//        q1();  ->
//        q2(); -> 225
//        q3(); ->ArrayIndexOutOfBoundsException: 2
//        q4(); -->  int b[3];
//        q5(); -> ArrayIndexOutOfBoundsException
//        q6(); ->CompileError
//        q7(); -> 123

    }

    private static void q7() {
        Object obj = new int[] { 1, 2, 3 }; // line 12
        int[] someArray = (int[])obj; // line 13
        for (int i : someArray) System.out.print(i + " "); // line 14
    }

    private static void q6() {

        byte b1= 25;
        byte b2=45;
//        byte b3= b1+b2;//CompileError
    }

    final static int x[] = new int[5];
    private static void q5() {

            final int x = new ArrayQuestions().x[5];
            if (x <= 10)
                System.out.println("javachamp");
    }

    private static void q4() {

        //Which of the following declarations of an array is incorrect?
        int[] a[];
//        int b[3];
        int []c[];
        int[] d[];
    }

    private static void q3() {

        String entries[] = {"entry1","entry2"};
        int count=0;
        while (entries [count++]!=null){
            System.out.println(count);
        }
        System.out.println(count);
    }

    private static void q2() {
        int[] a = new int[5];
        q2A(a);
        System.out.print(a.length);
    }

    static void q2A(int[] a) {
        int[] b = new int[2];
        a = b;
        System.out.print(b.length);
        System.out.print(a.length);
    }

    private static void q1() {
        int[] a = new int[0];
        System.out.print(a.length);
    }
}
