package Assignment1;

public class main {
    public static void main(String args[]) {
        char[] c = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', '0', 'j', 'r'};
        int[] intList = new int[20];
        int index = 0;
        for (char chardata : c) {
            try {
                String s = String.valueOf(chardata);
                int rawData = Integer.parseInt(s);
                intList[index] = rawData;
                index++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i : intList) {
            System.out.println(i);
        }
    }
}
