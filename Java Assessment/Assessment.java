import java.util.*;

class Assessment {
    public static void main(String[] args) {
         //findFileAndMemorySize();
         //countFileTotalAndAverage();
       createUserName();
    }
    static void findFileAndMemorySize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter the number of files");
        int numSize = scanner.nextInt();
        int memorySize = 0;
        String fileName = "";

        for (int i = 1; i <= numSize; i++) {
            System.out.println("inter the size of file number " + i + " (MB) ");
            int fileSize = scanner.nextInt();
            if (fileSize > memorySize) {
                memorySize = fileSize;
                fileName = "number " + i;
            }
        } // end of for loop
        if (memorySize > 0) {
            System.out.println("the file is " + fileName + " with  memory size of : " + memorySize);
        } else {
            System.out.println("File not found!");
        }
    }// end of method find file and memory size

    static void countFileTotalAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" inter the  number of file ");
        int numFile = scanner.nextInt();
        int numberOfFile = 0;
        int totalMemory = 0;
        double averageSize = 0;
        for (int i = 1; i <= numFile; i++) {
            System.out.println("inter the memory size of file :" + i);
            int memorySize = scanner.nextInt();
            numberOfFile++;
            totalMemory += memorySize;
            averageSize = totalMemory / numberOfFile;
        }
        System.out.println("the numbers of files: " + numberOfFile);
        System.out.println("the total of memory size: " + totalMemory + " the average size : " + averageSize);
    }

    static void createUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your first name");
        String firstName = scanner.next();
        System.out.println("inter your sure name");
        String sureName = scanner.next();
        String subName = firstName.substring(0, 1);
        System.out.println("your first name:  " + firstName);
        System.out.println("your sure name:  " + sureName);
        System.out.println("your full name: " + subName + sureName);

    }//end of method createUserName
}