/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.java.solutions;

/**
 *
 * @author SivaReddy Uppathi
 */
import java.util.*;

class Student1 implements Comparable<Student> {

    String name = new String();
    double cgpa;
    int id;

    public Student1(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Student1 s) {
        if (cgpa == s.cgpa) {
            if (name.compareTo(s.name) == 0) {
                if (id == s.id) {
                    return 0;
                } else if (id > s.id) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return name.compareTo(s.name);
            }
        } else if (cgpa > s.cgpa) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public int compareTo(Student o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Priorities {

    public ArrayList<Student1> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student1> pq = new PriorityQueue<>();
        for (String i : events) {
            String[] s = new String[4];
            s = i.split("\\s");
            if (s.length > 1) {
                pq.add(new Student1(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
            } else {
                pq.poll();
            }
        }
        while (pq.size() > 1) {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student1>(pq);
    }
}

public class JavaPriorityQue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
