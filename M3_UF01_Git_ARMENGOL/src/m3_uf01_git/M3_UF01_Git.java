/*
Eric Armengol
*/
package m3_uf01_git;

public class M3_UF01_Git {
    
    public static void main(String[] args) {
        String day = birthDay_Zeller(9, 6, 2000);
        System.out.println("International programmer's day: " + day + " sep 2021");
    }
    
    private static String birthDay_Zeller(int day, int month, int year){
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
}
