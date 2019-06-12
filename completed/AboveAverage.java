import java.util.*;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    int cases = in.nextInt();
    int n = 0;

    while(cases != 0) {
      n = in.nextInt();
      double sum = 0;
      int [] k = new int[n];

      for (int i = 0; i < n; i++) {
        k[i] = in.nextInt();
        sum += k[i];
      }

      double avg = sum / n;
      double counter = 0;

      for (int i = 0; i < n; i++) {
        if(k[i] > avg)
          counter++;
      }

      double ans = counter / n * 100;

      System.out.printf("%5.3f%s\n", ans, "%");

      cases--;
    }
	}
}
