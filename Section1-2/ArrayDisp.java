public class ArrayDisp {
    //create a generic class with anything using the <T> to set a argument for the type you can then define the type by calling T
    static <T> void Display(T[] arr) {
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] != null){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        String[] names = new String[10];
        names[0] = "Logan";
        names[1] = "Isabel";
        names[2] = "Kindred";
        names[3] = "Susan";
        names[4] = "Kevin";
        names[5] = "Hannah";
        names[6] = "Troy";
        names[7] = "Tricia";
        Display(names);
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Display(numbers);
    }    
}
