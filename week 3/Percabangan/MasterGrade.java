// package Percabangan;
public class MasterGrade {
  double nilai;

  public MasterGrade(double nilai) {
    this.nilai = nilai;
  }

  public static void grade(double nilai) {
    char grade = ' ';
    if (nilai >= 85 && nilai <= 100) {
      grade = 'A';
    } else if (nilai >= 70 && nilai <= 84) {
      grade = 'B';
    } else if (nilai >= 60 && nilai <= 69) {
      grade = 'C';
    } else if (nilai >= 50 && nilai <= 59) {
      grade = 'D';    
    } else if (nilai >= 0 && nilai <= 49) {
      grade = 'E'; }

    if (nilai >= 60) {
      System.out.println("Anda Lulus dengan predikat : " + grade);
    }
    else {
      System.out.println("Anda tidak lulus!");
    }
  }
}