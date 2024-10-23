package Team42Maths.src;

public class Team42Maths {
    
    public static void main(String[] args)
    {
        test();
    }

    public static class Maths {
        
        public static int max(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

        public static int min(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

        public static int add(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

        public static int sub(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

        public static int multiply(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

<<<<<<< Updated upstream
        public static int divide(int num1, int num2)
        {
            // complete implementation
        	return 0;
=======
        /*Developer: Tayyab Iqbal
        //University ID: 230410644
        Function: This function takes two inputs and divides the first by the second and return it*/
        public int divide(int num1, int num2)
        {
            int d = num1/num2;
            return d;
>>>>>>> Stashed changes
        }

        public static int power(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }

        public static int mod(int num1, int num2)
        {
            // complete implementation
        	return 0;
        }
        
        /********************************
        Developer: Haroun Boutounes
        University ID: 230370429
        Function: This function the float input and round the number down
        ********************************/

        public static float floor(float num) {
            return (float) Math.floor(num);
        }

        public static float ceil(float num)
        {
            // complete implementation

        	return 0;
        }
    }

    public static void test()
    {
        if (Maths.max(2, 4) == 4)
        {
            System.out.println("Max test passed!");
        }
        else
        {
            System.out.println("Max test failed!");
        }

        if (Maths.min(8, 4) == 4)
        {
            System.out.println("Min test passed!");
        }
        else
        {
            System.out.println("Min test failed!");
        }

        if (Maths.add(2, 2) == 4)
        {
            System.out.println("Addition test passed!");
        }
        else
        {
            System.out.println("Addition test failed!");
        }

        if (Maths.sub(7, 3) == 4)
        {
            System.out.println("Subtraction test passed!");
        }
        else
        {
            System.out.println("Subtraction test failed!");
        }

        if (Maths.multiply(3, 4) == 12)
        {
            System.out.println("Multiplication test passed!");
        }
        else
        {
            System.out.println("Multiplication test failed!");
        }

        if (Maths.divide(8, 4) == 2)
        {
            System.out.println("Division test passed!");
        }
        else
        {
            System.out.println("Division test failed!");
        }

        if (Maths.power(2, 3) == 8)
        {
            System.out.println("Power test passed!");
        }
        else
        {
            System.out.println("Power test failed!");
        }

        if (Maths.mod(5, 2) == 1)
        {
            System.out.println("Modulo test passed!");
        }
        else
        {
            System.out.println("Modulo test failed!");
        }

        if (Maths.ceil(4.5f) == 5)
        {
            System.out.println("Ceiling test passed!");
        }
        else
        {
            System.out.println("Ceiling test failed!");
        }

        if (Maths.floor(4.5f) == 4)
        {
            System.out.println("Floor test passed!");
        }
        else
        {
            System.out.println("Floor test failed!");
        }
    }
}
