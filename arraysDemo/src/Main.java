public class Main {
    public static void main(String[] args) {
        String ogrenci1="Murat";
        String ogrenci2="Muhammed";
        String ogrenci3="Emin";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("---------------------------------");

        String[] ogrenciler= new String[4];
        ogrenciler[0]="Murat";
        ogrenciler[1]="Muhammed";
        ogrenciler[2]="Emin";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali";

        for (int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}