import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    int age;

    Student(int id, String name, int age) {
        this.studentId = id;
        this.studentName = name;
        this.age = age;
    }
}

class Room {
    int roomNumber;
    String roomType;
    boolean vacancy;

    Room(int roomNumber, String roomType, boolean vacancy) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.vacancy = vacancy;
    }
}

public class HostelRoomAllocation {

    public static boolean checkEligibility(Student s) {
        return s.age >= 18;
    }

    public static boolean checkVacancy(Room r) {
        return r.vacancy;
    }

    public static double calculateFee(Room r) {
        if (r.roomType.equalsIgnoreCase("AC"))
            return 50000;
        else if (r.roomType.equalsIgnoreCase("Deluxe"))
            return 40000;
        else
            return 30000;
    }

    public static void allocateRoom(Student s, Room r) {

        System.out.println("\n----- HOSTEL ALLOCATION REPORT -----");
        System.out.println("Student ID      : " + s.studentId);
        System.out.println("Student Name    : " + s.studentName);
        System.out.println("Age             : " + s.age);
        System.out.println("Room Number     : " + r.roomNumber);
        System.out.println("Room Type       : " + r.roomType);
        System.out.println("Hostel Fee      : Rs." + calculateFee(r));

        r.vacancy = false;

        System.out.println("Allocation Status : SUCCESS");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("HOSTEL ROOM ALLOCATION SYSTEM");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Room Type (AC/Deluxe/Normal): ");
        String roomType = sc.nextLine();

        Room room = new Room(roomNo, roomType, true);

        if (checkEligibility(student)) {

            if (checkVacancy(room)) {
                allocateRoom(student, room);
            } else {
                System.out.println("Room Not Available");
            }

        } else {
            System.out.println("Student Not Eligible For Hostel");
        }

        sc.close();
    }
}
