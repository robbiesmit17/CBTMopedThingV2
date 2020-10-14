package im.ucm.co4025;

import java.util.Scanner;

public class Main {
    //note for self, anything declared in the brackets of a loop only exist in that specific loop
    public static void main(String[] args) {
        Scanner ScannyBoi = new Scanner(System.in);
        char olderthan17;
        char validlicense;
        char validcbt;
        do {
            System.out.print("Are you 17 or older? y/n");
            olderthan17 = Character.toLowerCase(ScannyBoi.next().charAt(0));

            if (olderthan17 != 'n' && olderthan17 != 'y') {
                System.out.println("Error: Please enter Yes or No.");
            }
        } while (olderthan17 != 'n' && olderthan17 != 'y');
        switch (olderthan17) {
            case 'y' -> {

                do {
                    System.out.print("Do you have a valid provisional license with motorcycle entitlement?");
                    validlicense = Character.toLowerCase(ScannyBoi.next().charAt(0));

                    if (validlicense != 'n' && validlicense != 'y') {
                        System.out.println("Error: Please enter Yes or No.");
                    }
                } while (validlicense != 'n' && validlicense != 'y');
                switch (validlicense) {
                    case 'y' -> {
                        do {
                            System.out.print("Do you have a valid CBT?");
                            validcbt = Character.toLowerCase(ScannyBoi.next().charAt(0));

                            if (validcbt != 'n' && validcbt != 'y') {
                                System.out.println("Error: Please enter Yes or No.");
                            }
                        } while (validcbt != 'n' && validcbt != 'y');
                        switch (validcbt) {
                            case 'y' -> System.out.println("You can ride an A1 motorcycle with L plates");
                            case 'n' -> System.out.println("You need a valid CBT to ride an A1 motorcycle");
                            default -> System.out.println("Achievement Get! How did we get here?");

                        }
                    }
                    case 'n' -> System.out.println("Sorry, you need a valid license with provisional motorcycle entitlement");
                    default -> System.out.println("Achievement Get! How did we get here?");
                }
            }
            case 'n' -> System.out.println("Sorry, you have to be over 17 to ride an A1 light motorcycle.");
            default -> System.out.println("Achievement Get! How did we get here?");
        }


        // I HAVE EXPERIMENTED WITH THE AUTO FORMAT OPTIONS FROM INTELLIJ
        validcbt = 'z';
        validlicense = 'z';
        olderthan17 = 'Z';
        do {
            System.out.print("Are you 17 or older? y/n");
            olderthan17 = Character.toLowerCase(ScannyBoi.next().charAt(0));

            if (olderthan17 != 'n' && olderthan17 != 'y') {
                System.out.println("Error: Please enter Yes or No.");
            }
        } while (olderthan17 != 'n' && olderthan17 != 'y');
        if (olderthan17 == 'y') {
            do {
                System.out.print("Do you have a valid provisional license with motorcycle entitlement?");
                validlicense = Character.toLowerCase(ScannyBoi.next().charAt(0));

                if (validlicense != 'n' && validlicense != 'y') {
                    System.out.println("Error: Please enter Yes or No.");
                }
            } while (validlicense != 'n' && validlicense != 'y');
            if (validlicense == 'y') {
                do {
                    System.out.print("Do you have a valid CBT?");
                    validcbt = Character.toLowerCase(ScannyBoi.next().charAt(0));

                    if (validcbt != 'n' && validcbt != 'y') {
                        System.out.println("Error: Please enter Yes or No.");
                    }
                } while (validcbt != 'n' && validcbt != 'y');
                if (validcbt == 'y') {
                    System.out.println("You can ride an A1 motorcycle with L plates");
                } else if (validcbt == 'n') {
                    System.out.println("You need a valid CBT to ride an A1 motorcycle");
                } else {
                    System.out.println("Achievement Get! How did we get here?");
                }
            } else if (validlicense == 'n') {
                System.out.println("Sorry, you need a valid license with provisional motorcycle entitlement");
            } else {
                System.out.println("Achievement Get! How did we get here?");
            }
        } else if (olderthan17 == 'n') {
            System.out.println("Sorry, you have to be over 17 to ride an A1 light motorcycle.");
        } else {
            System.out.println("Achievement Get! How did we get here?");
        }
    }
}
