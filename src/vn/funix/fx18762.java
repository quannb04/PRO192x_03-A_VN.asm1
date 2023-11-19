package vn.funix;
//import vn.funix.com.gpcoder.RandomStringExmple;
import java.util.*;
import java.util.function.Consumer;
public class fx18762 {
    static Scanner sc = new Scanner(System.in);
    //hiển thị thông tin ban đầu
    public static void main(String[] args) {
        System.out.println("+----------+--------------------+----------+");
        System.out.println("| NGAN HANG SO | FX18762@v1.0.0            |");
        System.out.println("+----------+--------------------+----------+");
        System.out.println("| 1. Nhap CCCD                             |");
        System.out.println("| 0. Thoat                                 |");
        System.out.println("+----------+--------------------+----------+");
        System.out.println("Chuc nang:");
        //chạy hàm chức năng
        chucNang();
    }
    //hàm chức năng
    public static void chucNang() {
        try {
            int nhapVao = sc.nextInt();
            switch (nhapVao) {
                case 1:
                    //chạy hàm xác nhận mã xác thực
                    maXacThuc();
                    break;
                case 0:
                    System.out.println("Tam biet, hen gap lai");
                    break;
                default:
                    System.out.println("Nhap khong chinh xac, con so lua chon la 1 hoac 0");
                    chucNang();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Sai thong tin, xin thu lai");
        }
    }
    //hàm xác nhận mã xác thực
    public static void maXacThuc() {
        try {
            //tạo số  ngẫu nhiên
            int code = (int) Math.floor(((Math.random() * 899) + 100));
            System.out.println("Vui long nhap ma xac thuc: " + code);
            //phần nhập số ngẫu nhiên
            int input = sc.nextInt();
            while (true) {
                if (input == code) {
                    System.out.println("Ma xac thuc thanh cong: ");
                    //chạy hàm kiểm tra số CCCD
                    checkCCCD();
                } else {
                    //tạo số ngẫu nhiên mới
                    System.out.println("Ma xac thuc khong dung");
                    maXacThuc();
                }
            }
        } catch (Exception e) {
            System.out.println("Sai thong tin, xin thu lai");
        }
    }
    //hàm kiểm nhập CCCD hợp lệ
    public static void checkCCCD() {
//        try {
            System.out.println("Xin moi nhap day so Can cuoc cong dan:");
            //System.out.println(cCCD.length());
            while (true) {
                //nhập số CCCD
                String cCCD = sc.nextLine();
                if (cCCD.length() == 12 && cCCD.length() > 0) {
                    luaChon(cCCD);
                }
                if (cCCD.length() != 12 && cCCD.length() > 0) {
                    //System.out.println(cCCD);
                    System.out.println("So CCCD khong hop le. \nVui long nhap lai hoac ‘No’ de thoat!");
                    //check người dùng xác nhận no thì thoát chương trình
                    cCCD = sc.nextLine();
                    if (cCCD.equals("No")) {
                        System.exit(0);
                    }
                }
            }
//        } catch (Exception e) {
//            System.out.println("Sai thong tin, xin thu lai");
//        }
    }
    //hàm lựa chọn thông tin cần hiển thị
    public static void luaChon(String inFo) {
        try {
            System.out.println(
                    "1. Kiem tra noi sinh.\n" +
                    "2. Kiem tra tuoi, gioi tinh.\n" +
                    "3. Kiem tra so ngau nhien. \n" +
                    "0. Thoat");
            //nhập lựa chọn
            int check = sc.nextInt();
            switch (check) {
                case 1:
                    //lấy 3 số chứa thông tin tỉnh
                    String soTinh = inFo.substring(0, 3);
                    System.out.println(soTinh);
                    //chạy hàm hiển thị thông tin tỉnh
                    maTinh(soTinh);
                    luaChon(inFo);
                    break;
                case 2:
                    //lấy 3 số chứa thông tin giới tính + năm sinh
                    String sex = inFo.substring(3, 6);
                    System.out.println(sex);
                    //chạy hàm hiển thị thông tin giới tính + năm sinh
                    gioiTinh(sex);
                    luaChon(inFo);
                    break;
                case 3:
                    //lấy 6 số ngẫu nhiên
                    String soNgauNhien = inFo.substring(6, 12);
                    System.out.println("Con so ngau nhien la: " + soNgauNhien);
                    luaChon(inFo);
                    break;
                case 0:
                    //thoát chương trình
                    System.exit(0);
                    break;
                default:
                    System.out.println("So khong hop le, vui long nhap lai");
                    luaChon(inFo);
                    break;
            }
        } catch(Exception e) {
            System.out.println("Sai thong tin, xin thu lai");
        }
    }
    //hàm hiển thị thông tin tỉnh
    public static void maTinh(String soTinh) {
        switch (soTinh){
            case "001":
                System.out.println("Noi sinh: Ha Noi");
                break;
            case "002":
                System.out.println("Noi sinh: Ha Giang");
                break;
            case "004":
                System.out.println("Noi sinh: Cao Bang");
                break;
            case "006":
                System.out.println("Noi sinh: Bac Kan");
                break;
            case "008":
                System.out.println("Noi sinh: Tuyen Quang");
                break;
            case "010":
                System.out.println("Noi sinh: Lao Cai");
                break;
            case "011":
                System.out.println("Noi sinh: Dien Bien");
                break;
            case "012":
                System.out.println("Noi sinh: Lai Chau");
                break;
            case "014":
                System.out.println("Noi sinh: Son La");
                break;
            case "015":
                System.out.println("Noi sinh: Yen Bai");
                break;
            case "017":
                System.out.println("Noi sinh: Hoa Binh");
                break;
            case "019":
                System.out.println("Noi sinh: Thai Nguyen");
                break;
            case "020":
                System.out.println("Noi sinh: Lang Son");
                break;
            case "022":
                System.out.println("Noi sinh: Quang Ninh");
                break;
            case "024":
                System.out.println("Noi sinh: Bac Giang");
                break;
            case "025":
                System.out.println("Noi sinh: Phu Tho");
                break;
            case "026":
                System.out.println("Noi sinh: Vinh Phuc");
                break;
            case "027":
                System.out.println("Noi sinh: Bac Ninh");
                break;
            case "030":
                System.out.println("Noi sinh: Hai Duong");
                break;
            case "031":
                System.out.println("Noi sinh: Hai Phong");
                break;
            case "033":
                System.out.println("Noi sinh: Hung Yen");
                break;
            case "034":
                System.out.println("Noi sinh: Thai Binh");
                break;
            case "035":
                System.out.println("Noi sinh: Ha Nam");
                break;
            case "036":
                System.out.println("Noi sinh: Nam Dinh");
                break;
            case "037":
                System.out.println("Noi sinh: Ninh Binh");
                break;
            case "038":
                System.out.println("Noi sinh: Thanh Hoa");
                break;
            case "040":
                System.out.println("Noi sinh: Nghe An");
                break;
            case "042":
                System.out.println("Noi sinh: Ha Tinh");
                break;
            case "044":
                System.out.println("Noi sinh: Quang Binh");
                break;
            case "045":
                System.out.println("Noi sinh: Quang Tri");
                break;
            case "046":
                System.out.println("Noi sinh: Thua Thien Hue");
                break;
            case "048":
                System.out.println("Noi sinh: Da Nang");
                break;
            case "049":
                System.out.println("Noi sinh: Quang Nam");
                break;
            case "051":
                System.out.println("Noi sinh: Quang Ngai");
                break;
            case "052":
                System.out.println("Noi sinh: Binh Dinh");
                break;
            case "054":
                System.out.println("Noi sinh: Phu Yen");
                break;
            case "056":
                System.out.println("Noi sinh: Khanh Hoa");
                break;
            case "058":
                System.out.println("Noi sinh: Ninh Thuan");
                break;
            case "060":
                System.out.println("Noi sinh: Binh Thuan");
                break;
            case "062":
                System.out.println("Noi sinh: Kon Tum");
                break;
            case "064":
                System.out.println("Noi sinh: Gia Lai");
                break;
            case "066":
                System.out.println("Noi sinh: Dak Lak");
                break;
            case "067":
                System.out.println("Noi sinh: Dak Nong");
                break;
            case "068":
                System.out.println("Noi sinh: Lam Dong");
                break;
            case "070":
                System.out.println("Noi sinh: Binh Phuoc");
                break;
            case "072":
                System.out.println("Noi sinh: Tay Ninh");
                break;
            case "074":
                System.out.println("Noi sinh: Binh Duong");
                break;
            case "075":
                System.out.println("Noi sinh: Dong Nai");
                break;
            case "077":
                System.out.println("Noi sinh: Ba Ria - Vung Tau");
                break;
            case "079":
                System.out.println("Noi sinh: Ho Chi Minh");
                break;
            case "080":
                System.out.println("Noi sinh: Long An");
                break;
            case "082":
                System.out.println("Noi sinh: Tien Giang");
                break;
            case "083":
                System.out.println("Noi sinh: Ben Tre");
                break;
            case "084":
                System.out.println("Noi sinh: Tra Vinh");
                break;
            case "086":
                System.out.println("Noi sinh: Vinh Long");
                break;
            case "087":
                System.out.println("Noi sinh: Dong Thap");
                break;
            case "089":
                System.out.println("Noi sinh: An Giang");
                break;
            case "091":
                System.out.println("Noi sinh: Kien Giang");
                break;
            case "092":
                System.out.println("Noi sinh: Can Tho");
                break;
            case "093":
                System.out.println("Noi sinh: Hau Giang");
                break;
            case "094":
                System.out.println("Noi sinh: Soc Trang");
                break;
            case "095":
                System.out.println("Noi sinh: Bac Lieu");
                break;
            case "096":
                System.out.println("Noi sinh: Ca Mau");
                break;
            default:
                System.out.println("Ma tinh chua chinh xac, vui long nhap lai CCCD");
                checkCCCD();
                break;
        }
    }
    //hàm hiển thị thông tin giới tính + năm sinh
    public static void gioiTinh(String sex) {
        switch (sex.charAt(0)){
            case '0':
                System.out.println("Gioi tinh: Nam | Sinh nam: 19" + sex.substring(1));
                break;
            case '1':
                System.out.println("Gioi tinh: Nu | Sinh nam: 19" + sex.substring(1));
                break;
            case '2':
                System.out.println("Gioi tinh: Nam | Sinh nam: 20" + sex.substring(1));
                break;
            case '3':
                System.out.println("Gioi tinh: Nu | Sinh nam: 20" + sex.substring(1));
                break;
            case '4':
                System.out.println("Gioi tinh: Nam | Sinh nam: 21" + sex.substring(1));
                break;
            case '5':
                System.out.println("Gioi tinh: Nu | Sinh nam: 21" + sex.substring(1));
                break;
            case '6':
                System.out.println("Gioi tinh: Nam | Sinh nan: 22" + sex.substring(1));
                break;
            case '7':
                System.out.println("Gioi tinh: Nu | Sinh nam: 22" + sex.substring(1));
                break;
            case '8':
                System.out.println("Gioi tinh: Nam | Sinh nam: 23" + sex.substring(1));
                break;
            case '9':
                System.out.println("Gioi tinh: Nu | Sinh nam: 23" + sex.substring(1));
                break;
            default:
                System.out.println("Thong tin gioi tinh va nam sinh chua chinh xac, vui long nhap lai");
                checkCCCD();
                break;
        }
    }
    //hàm tạo mã xác thực ngẫu nhiên
//    public class RandomStringExmple {
//        private static final String alpha = "abcdefghijklmnopqrstuvwxyz";
//        // a-z
//        private static final String alphaUpperCase = alpha.toUpperCase();
//        // A-Z
//        private static final String digits = "0123456789";
//        // 0-9
//        private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
//        private static Random generator = new Random();
//        // Random string with a-zA-Z0-9
//        public String randomAlphaNumeric(int numberOfCharactor) {
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < numberOfCharactor; i++) {
//                int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
//                char ch = ALPHA_NUMERIC.charAt(number);
//                sb.append(ch);
//            }
//            return sb.toString();
//        }
//        public static int randomNumber(int min, int max) {
//            return generator.nextInt((max - min) + 1) + min;
//        }
//        public static void main(String a[]) {
//            int numberOfCharactor = 6;
//            vn.funix.com.gpcoder.RandomStringExmple rand = new vn.funix.com.gpcoder.RandomStringExmple();
//            System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//            System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//            System.out.println("randomString1: " + rand.randomAlphaNumeric(numberOfCharactor));
//        }
//    }
}

