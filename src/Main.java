import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {

            // Kullanıcı adı ve şifre alınır
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            // Kullanıcı adı ve şifre kontrol edilir eğer doğru ise giriş yapılır ve işlem ekranı görünür
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                // Seçim 4 olmadığı sürece işlem ekranı tekrar tekrar yazdırılır
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    // Switch - case ile seçim değeri kontrol edilir
                    switch (select) {

                        case 1:

                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:

                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:

                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:

                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
                // Seçim değeri 4 olduğunda sistem durdurulur.
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                // Her şifre ve kullanıcı adı denemesinde right değeri bir azaltılır ve 0 a eşit olduğunda hesap blokelenir ve sistem durdurulur
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                } else {
                    System.out.println("Kalan Hakkınız : " + right);

                }
            }
        }
    }
}