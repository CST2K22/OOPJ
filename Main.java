import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = scanner.nextLine();

        System.out.print("Enter index for charAt: ");
        int b = scanner.nextInt();
        System.out.println("Character at index " + b + ": " + a.charAt(b));

        int c = a.length();
        System.out.println("Length of the string: " + c);

        System.out.print("Enter start index for substring: ");
        int d = scanner.nextInt();
        String e = a.substring(d);
        System.out.println("Substring starting from index " + d + ": " + e);

        System.out.print("Enter start and end index for substring: ");
        int f = scanner.nextInt();
        String g = a.substring(d, f);
        System.out.println("Substring from index " + d + " to " + (f - 1) + ": " + g);

        scanner.nextLine();
        System.out.print("Enter a string to concatenate: ");
        String h = scanner.nextLine();
        String i = a.concat(h);
        System.out.println("Concatenated String: " + i);

        System.out.print("Enter a substring to find its index: ");
        String j = scanner.nextLine();
        int k = a.indexOf(j);
        System.out.println("Index of '" + j + "': " + k);

        int l = a.lastIndexOf(" ");
        System.out.println("Last index of space: " + l);

        System.out.print("Enter a string to compare for equality: ");
        String m = scanner.nextLine();
        boolean n = a.equals(m);
        System.out.println("Is the string equal to '" + m + "'? " + n);

        System.out.print("Enter a string to compare (case-insensitive): ");
        String o = scanner.nextLine();
        boolean p = a.equalsIgnoreCase(o);
        System.out.println("Is the string equal to '" + o + "' (case-insensitive)? " + p);

        System.out.print("Enter a prefix to check: ");
        String q = scanner.nextLine();
        boolean r = a.startsWith(q);
        System.out.println("Does the string start with '" + q + "'? " + r);

        System.out.print("Enter a suffix to check: ");
        String s = scanner.nextLine();
        boolean t = a.endsWith(s);
        System.out.println("Does the string end with '" + s + "'? " + t);

        System.out.print("Enter character to replace and the replacement character (oldChar newChar): ");
        char u = scanner.next().charAt(0);
        char v = scanner.next().charAt(0);
        String w = a.replace(u, v);
        System.out.println("String after replacing '" + u + "' with '" + v + "': " + w);

        scanner.nextLine();
        System.out.print("Enter a regex pattern to replace and replacement string: ");
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        String z = a.replaceAll(x, y);
        System.out.println("String after replacing pattern with replacement: " + z);

        String aa = a.toLowerCase();
        System.out.println("String in lowercase: " + aa);

        String ab = a.toUpperCase();
        System.out.println("String in uppercase: " + ab);

        char[] ac = a.toCharArray();
        System.out.print("Character array representation: ");
        for (char ad : ac) {
            System.out.print(ad + " ");
        }
        System.out.println();

        boolean ae = a.isEmpty();
        System.out.println("Is the string empty? " + ae);

        String af = a.trim();
        System.out.println("String after trimming leading and trailing whitespaces: '" + af + "'");

        System.out.print("Enter an integer to convert to string: ");
        int ag = scanner.nextInt();
        String ah = String.valueOf(ag);
        System.out.println("String representation of the integer " + ag + ": " + ah);

        scanner.nextLine();
        System.out.print("Enter a string for comparison: ");
        String ai = scanner.nextLine();
        int aj = a.compareTo(ai);
        System.out.println("Comparison result with '" + ai + "': " + aj);

        System.out.print("Enter a string for case-insensitive comparison: ");
        String ak = scanner.nextLine();
        int al = a.compareToIgnoreCase(ak);
        System.out.println("Case-insensitive comparison result with '" + ak + "': " + al);

        System.out.print("Enter a substring to check if it exists in the string: ");
        String am = scanner.nextLine();
        boolean an = a.contains(am);
        System.out.println("Does the string contain '" + am + "'? " + an);
    }
}
