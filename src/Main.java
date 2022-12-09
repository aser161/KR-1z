import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String [] a = {"aa", "bb","cc","aa","bb"};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(Objects.equals(a[i], a[j]) && i!=j){
                    a[j] = null;
                }
            }
        }
        String a1 = new String();
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                a1 += a[i];

            }
        }
        System.out.println(a1);
    }
}