import java.util.Scanner;

class Cellulitis {
    Scanner scanner = new Scanner(System.in);
    char choice = scanner.next().charAt(0);
    int length = scanner.nextInt();
    int generation = scanner.nextInt();
    int index;
    boolean[] currentGeneration = new boolean[length + 2];
    boolean[] nextArray = new boolean[length + 2];
    char[] displayArray = new char[length];

    void run() {
        while (scanner.hasNextInt()) {
            index=scanner.nextInt();
            currentGeneration[index] = true;
        }
        if(choice=='A'){
            printGeneration(currentGeneration);
            automataA();
        }
        else if(choice=='B'){
            printGeneration(currentGeneration);
            automataB();
        }

    }

    void automataA() {
        for (int i = 0; i < generation - 1; i++) {
            for (int j = 1; j < currentGeneration.length-1; j++) {
                if (currentGeneration[j] && (currentGeneration[j - 1] ^ currentGeneration[j + 1])) {
                    nextArray[j] = true;
                } else if (currentGeneration[j] && (currentGeneration[j - 1] && currentGeneration[j + 1])) {
                    nextArray[j] = false;
                }

                if (!currentGeneration[j] && (!currentGeneration[j - 1] && !currentGeneration[j + 1])) {
                    nextArray[j] = false;
                } else {
                    nextArray[j] = true;
                }
            }
            printGeneration(nextArray);
            currentGeneration = nextArray;
        }
    }

    void automataB(){
        for (int i = 0; i < generation - 1; i++) {
            for (int j = 1; j < currentGeneration.length-1; j++) {
                if (currentGeneration[j]) {
                    if(!currentGeneration[j + 1]){
                        nextArray[j] = true;
                    }else{
                        nextArray[j]=false;
                    }
                }
                if (!currentGeneration[j]) {
                    if((currentGeneration[j - 1] ^ currentGeneration[j + 1])){
                        nextArray[j] = true;
                    }else{ 
                        nextArray[j] = false;
                    }
                } 
            }
            printGeneration(nextArray);
            currentGeneration = nextArray;
        }

    }

    void printGeneration(boolean[] arr) {
        for (int i = 1; i < arr.length-2; i++) {
            if (arr[i]) {
                displayArray[i-1] = '*';
            } else {
                displayArray[i-1] = ' ';
            }
        }
        System.out.println(displayArray);
    }

    public static void main(String[] args) {
        (new Cellulitis()).run();
    }
}
