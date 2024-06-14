public class Operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Arithmetic operation: Calculate sum
        int sum = num1 + num2; // sum will be 15 (calculation)

        // Assignment operator: Assign sum to another variable
        int total = sum; // total will be assigned the value of sum (15)

        // Compound assignment operator: Add and assign sum to a variable
        total += 3; // total will be modified to 18 (15 + 3)

        int num = 7;
        // num=num+2;
        // num+=2;
        // num*=2;

        num++; // post increment
        ++num; // pre increment
        num--; // post decrement
        --num; // pre decrement
        System.out.println(num);

        int result = num++; // fetch the value and then increment
        // int result = ++num; //it'll increment then fetch
        System.out.println(result);

    }

}
