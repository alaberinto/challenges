import java.util.*;
import java.io.*;
import java.awt.*;

public class QualityAdjustedLifeYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    float sum = 0;
    for(int i = 0; i < n; i++) {
      float qaly = in.nextFloat();
      float years = in.nextFloat();

      sum += qaly * years;
    }

    System.out.printf("%5.3f", sum);
	}
}
