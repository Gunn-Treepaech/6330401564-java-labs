package treeechan.treepaech.mockupexam;

class Adder{
    private int number1;
    private int number2;
    public Adder(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public void add(){
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }
}

public class TestExamV1 {
    public static void main(String[] args) {
        Adder adder1 = new Adder(2, 3);
        adder1.add();
    }
}
