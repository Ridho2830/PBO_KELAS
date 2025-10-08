public class Array2D {

  public static void main(String[] args) {
    String[][] negaraIbukota = {
        { "Indonesia", "Jakarta" },
        { "Jepang", "Tokyo" },
        { "Amerika", "Washington DC" },
    };

    for (int i = 0; i < negaraIbukota.length; i++) {
      // for (int j = 0; j < negaraIbukota[i].length; j++) {
      System.out.print("ibu kota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
      System.out.print(" ");
      // }
      System.out.println();
    }

  }
}
