public class Main {
    public static void main(String[] args) {
        int numeros[];
        numeros = new int [10]; 

        int novos[] = new int [10];

        String frutas[] = {"Laranja", "Abacaxi", "Uva"};

        //System.out.println(frutas[0]);
        //System.out.println(frutas[1]);
        //System.out.println(frutas[2]);

        int cont = 0;
        while(cont < 3) {
            System.out.println(frutas[cont++]);
        }

        int cont2 = 0;
        do {
            System.out.println(frutas[cont2++]);
        } while(cont2 < 3);

        for(int i = 0;i < 3;i++) {
            System.out.println(frutas[i]);
        }
            
    }
}