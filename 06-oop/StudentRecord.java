public class StudentRecord {
    public static void main(String[] args) {
        Pupil p = new Pupil("Priya", 85, 90, 78);
        System.out.println("Name: " + p.name);
        System.out.println("Total: " + p.total());
        System.out.println("Grade: " + p.grade());
    }
}

class Pupil {
    String name;
    int m1, m2, m3;

    Pupil(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }

    String grade() {
        double avg = total() / 3.0;
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }
}
