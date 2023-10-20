import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        //String[]lessons = new String[4];
        //lessons[0] = "Maths";
        //lessons[1] = "Physics";
        // lessons[2] = "Chemical";
        //lessons[3] = "Kuchen";
        //for(int i = 0; i< lessons.length; i++){
        //System.out.println(lessons[i]);

        //int[]array = new int[5];
        // for(int i = 0; i < array.length; i++){
        // System.out.println(array[i]);

        //Random random = new Random();
        //int[] array = new int[10];
        //for (int index = 0; index < array.length; index++) {
        //array[index] = random.nextInt(30);

        //}
        //for (int index = 0; index < array.length; index++) {
        //System.out.println(array[index]);
        String[][] friends = {{"Olga", "Anna"},{"Max", "Ryan"}};
        friends[0][0] = "Olga";
        friends[0][1] = "Anna";
        friends[1][0] = "Max";
        friends[1][1] = "Ryan";
        for (int i = 0; i < friends.length; i++) {
            System.out.println();
            for (int b = 0; b < friends[i].length; b++) {
                System.out.println(friends[i][b] + "");
            }
        }
    }
}


