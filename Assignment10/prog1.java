package Assignment10;
//Nested
class prog1{

    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[]={1,2,3};
                    System.out.println(arr[7]);
                }
                catch(ArithmeticException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array size is the problem");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
