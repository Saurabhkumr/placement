package designPattern;

enum OperatorType{
    ADD,SUB,MUL,DIV
}

interface ArithmeticExp{
   double evaluate();
}

class Operand implements ArithmeticExp{

    public double num;

    public Operand(double n){
        this.num=n;
    }
    @Override
    public double evaluate() {
      return this.num;
    }
}

class Operator implements ArithmeticExp{

    OperatorType opr;
    ArithmeticExp left;
    ArithmeticExp right;

    public Operator(ArithmeticExp num1 , ArithmeticExp num2 , OperatorType opr){
        this.opr = opr;
        this.left=num1;
        this.right=num2;
    }

    @Override
    public double evaluate() {
          double value =0.0;
          switch (this.opr){
              case ADD : value= left.evaluate()+right.evaluate();
              break;
              case SUB : value= left.evaluate()-right.evaluate();
              break;
              case MUL : value= left.evaluate()*right.evaluate();
              break;
              case DIV : value= left.evaluate()/right.evaluate();
              break;

          }
          return value;
    }
}


public class ArithmeticComposite {
    public static void main(String[] args) {
        ArithmeticExp num1 = new Operand(4.0);
        ArithmeticExp num2 = new Operand(7.0);
        ArithmeticExp num3 = new Operand(3.0);
        ArithmeticExp opn1 = new Operator(num1 , num2 , OperatorType.ADD);
        ArithmeticExp opn2 = new Operator(num3 , opn1 , OperatorType.MUL);
        System.out.println(opn2.evaluate());

    }
}
