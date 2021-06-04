package ru.megalomaniac.tests.course2.nested.local_inner_class;

public class LocalInnerExample {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult(){

        class Division{
            private int a;
            private int b;

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }

            public int getB() {
                return b;
            }

            public void setB(int b) {
                this.b = b;
            }

            public int divide(){
                return a/b;
            }

            public int getOstatok(){
                return a%b;
            }
        }

        Division division = new Division();
        division.setA(10);
        division.setB(2);
        System.out.println("A="+division.getA());
        System.out.println("B="+division.getB());
        System.out.println("division="+division.divide());
        System.out.println("ostatok="+division.getOstatok());
    }
}
