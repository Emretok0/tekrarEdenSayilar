public class Main {

    public static boolean isFind(int[] arr, int value) {
        for (int a : arr) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sayilar = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrarEdenSayilar = new int[sayilar.length];
        int i = 0;
        for (int a = 0; a < sayilar.length; a++) {
            for (int b = 0; b < sayilar.length; b++) {
                if (a != b && sayilar[b] == sayilar[a]) {
                    if (!isFind(tekrarEdenSayilar, sayilar[b])) {
                        tekrarEdenSayilar[i++] = sayilar[b];
                    }
                }
            }
        }
        int t = 0;
        for (int tekrarEdenSayi : tekrarEdenSayilar) {
            for (int sayi : sayilar) {
                if (tekrarEdenSayi != 0 && sayi == tekrarEdenSayi) {
                    t++;
                }
            }
            if (tekrarEdenSayi != 0) {
                System.out.println(t + " tane " + tekrarEdenSayi);
                t = 0;
            }
        }
        boolean h =false;
        for (int sayi: sayilar){
            for (int tekrarEdenSayi: tekrarEdenSayilar){
                if (tekrarEdenSayi==sayi){
                    h=false;
                    break;
                } else {
                    h=true;
                }
            }
            if (h){
                System.out.println("1 tane "+sayi);
            }
            h=false;
        }

    }
}
