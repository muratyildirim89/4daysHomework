public class Main {
    public static void main(String[] args) {
        int sayi1=30;
        int sayi2=25;
        int sayi3=200;
        /* Kendi Çözümüm...
        if (sayi3>sayi2){
            if (sayi3>sayi1){
                System.out.println("Sayi3 en diğerlerinden en büyüktür");
            }else if(sayi2>sayi1){
                System.out.println("Sayi 1 ise en küçüktür");
            }else{
                System.out.println("Sayı 2 En Küçüktür");
            }
        }*/
        int enBuyuk=sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk);
    }
}