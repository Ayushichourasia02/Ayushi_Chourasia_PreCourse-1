class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top == 0 ){
            System.out.println("Yes Empty");
            return true;
        }
        else{
            System.out.println("Not Empty");
            return false;
        }
    }

    Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
        //Write your code here
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }

    }

    int peek() {
        //Write your code here
        return a[top];
    }
}

// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.isEmpty();
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peeked from stack");
        s.push(40);
        System.out.println(s.peek() + " Peeked from stack");

    }
}
