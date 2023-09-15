package javaChallenges;

public class PrimaryNumbers {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrimary = isPrimaryNumbers(num);
        System.out.println(isPrimary);
        for (int i = 0; i < num; i++) {
            if (isPrimaryNumbers(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrimaryNumbers(int primary) {
        if (primary <= 1) {
            return false;
        }
        if (primary <= 3) {
            return true;
        }
        if (primary % 2 == 0 || primary % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i < primary; i++) {
            if (primary % i == 0 || primary % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
