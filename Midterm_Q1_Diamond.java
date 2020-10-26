import java.util.Scanner;

public class Midterm_Q1_Diamond {
  public static void main(String args[]) {
    int i, j;
    int nlines_total, nlines, nprint;
    int print_start_pos;
    Scanner input = new Scanner(System.in);

    System.out.print("How many lines?? ");
    nlines_total = input.nextInt();

    if ( nlines_total <= 0 ) {
      System.out.println("Wrong number of lines: " + nlines_total);
      return;
    }  

    // print upper half
    nlines = (nlines_total+1)/2;	// even: nlines_total/2, odd: (nlines_total+1)/2
    for (i=0; i<nlines; i++) {  
      nprint = i*2+1;	// 1 * 2 *** 3 ***** ...
      print_start_pos = (nlines-1)-i;

      for (j=0; j<print_start_pos; j++) System.out.print(" ");
      for (j=nprint-1; j>=0; j--) { System.out.print('*'); }
      System.out.println();
    }

    // print lower half
    nlines = nlines_total/2;	// even: nlines_total/2, odd: (nlines_total-1)/2
    for (i=0; i<nlines; i++) {
      nprint = (nlines-1-i)*2+1;	// 1 * 2 *** 3 ***** ...
      print_start_pos = i+nlines_total%2;	// even: start from 0, odd: start from 1

      for (j=0; j<print_start_pos; j++) System.out.print(" ");
      for (j=nprint-1; j>=0; j--) { System.out.print('*'); }
      System.out.println();
    }
  }
}
