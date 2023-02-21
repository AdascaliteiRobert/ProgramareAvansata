public class LAB1 {
    public static void main(String[] args) {
      //1 
        System.out.println("Hello World");
        System.out.println();
        //2
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        for (int i = 0; i < languages.length; i++) {
            System.out.print(languages[i] + " ");
        }
        //3
        System.out.println("\n");
        int n = (int) (Math.random() * 1_000_000);
       
        System.out.println(n + "\n");
         //4

                n *= 3;
           
                n += Integer.parseInt("10101", 2);
           
                n += Integer.parseInt("FF", 16);
           
                n *= 6;
        System.out.println(n + "\n");
        //5
        int sum = 0;
        int rez = 0;
        do {
            while(n!=0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            n = sum;
            rez = sum;
            sum = 0;
        }while(rez>=10);

        n = rez;
        System.out.println(n);

        //6

        System.out.println("\nWilly-nilly, this semester I will learn " + languages[rez]);

    }
}
