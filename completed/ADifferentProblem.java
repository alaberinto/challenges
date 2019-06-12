import java.util.*;

public class ADifferentProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    while(in.hasNext()) {
      String line = in.nextLine();

      String[] nums = line.split(" ");
      long ans = Math.abs(Long.parseLong(nums[0]) - Long.parseLong(nums[1]));

      System.out.println(ans);
    }
	}
}
