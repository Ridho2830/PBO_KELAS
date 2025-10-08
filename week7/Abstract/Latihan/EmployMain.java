package Abstract.Latihan;

abstract class Employ {
  private String name;
  private int salary;

  abstract int calculateBonus();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}

class Manager extends Employ {
  public int calculateBonus() {
    return 500000;
  }
}

class Staff extends Employ {
  public int calculateBonus() {
    return 200000;
  }
}

public class EmployMain {
  public static void main(String[] args) {
    Employ manager = new Manager();
    Employ staff = new Staff();

    manager.setName("Budi");
    manager.setSalary(1000000);

    staff.setName("Andi");
    staff.setSalary(500000);

    System.out.println(manager.getName() + " gaji: Rp." + manager.getSalary() + " & Bonus: Rp." + manager.calculateBonus());
    System.out.println("Total Gaji Manager: Rp. " + (manager.getSalary() + manager.calculateBonus()));
    
    System.out.println(staff.getName() + " gaji: Rp." + staff.getSalary() + " &  Bonus: Rp." + staff.calculateBonus());
    System.out.println("Total Gaji Staff: Rp. " + (staff.getSalary() + staff.calculateBonus()));
  }
}
