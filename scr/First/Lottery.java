package First;

class Lottery {
public static int[] nus = new int[50];
    public static void main(String[] args) {


        for (int i = 1; i < 50; i++) {
            nus[i] = i;
                  }
        for (int i = 1; i < 50; i++) {
            int r = (int) Math.ceil(Math.random() * 49);
            int temp = nus[i];
            nus[i] = nus[r];
            nus[r] = temp;


        }
        for (int i = 1; i < 7; i++) {

            System.out.print(Integer.toString(nus[i])  +" ");
        }

        System.out.println(nus[1]+" ");
        System.out.println(nus[2]+" ");
        System.out.println(nus[3]+" ");
    }

}
