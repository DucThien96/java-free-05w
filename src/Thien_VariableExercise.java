package lesson01;

/**
 * Các bạn sẽ phát triển code của các bạn ở đây, lưu ý mỗi người tạo 01 file và đặt tên theo rule
 * 1. Copy file này, và change name của file theo cú pháp sau: YourName_VariableExercise.java
 *  Ví dụ: Nguyễn Văn An -> NguyenVanAn_VariableExercise.java
 * 2. Truy cập file gitCommitMac.sh hoặc gitCommitWin.bat (Lựa chọn theo HĐH bạn đang sử dụng) và thêm thông tin commit của bạn.
 *   2.1 Tại dòng 8: Thay đường dẫn file của bạn tại [Your file Path] (Ví dụ: src/lesson01/Thien_VariableExercise.java)
 *   2.2 Truy cập terminal có sử dụng IntelliJ IDEA: Vào View -> Tool Windows -> Terminal và thực thi dòng lệnh sau:
 *    - Trên Mac: sh gitCommitMac.sh
 *    - Trên Windows: gitCommitWin.bat
 *    2.3 Nếu gặp lỗi về quyền truy cập thì bạn cần cấp quyền cho file .sh hoặc .bat đó, mở terminal và thực thi lệnh sau:
 *    - Trên Mac: chmod +x gitCommitMac.sh
 *    - Trên Windows: Không cần thực thi lệnh này
 *  3. Sau khi thực thi xong, bạn sẽ thấy thông báo "Git commit successfully" trên terminal
 */
public class Thien_VariableExercise {
    public static void main(String[] args) {
        //region Bài 01
        /* Implement your code here */

    int a = 28;
    double b = 28.8;
    char word = 'Y';
    boolean isAnswer = true;
    String end = "-- End -- ";

        System.out.println("Các phép toán cộng, trừ, nhân, chia với các biến số nguyên và số thực: ");

        System.out.print("- Phep cong: a + b = ");
        System.out.println(a+b);
        System.out.print("- Phep tru: a - b = ");
        System.out.println(a-b);
        System.out.print("- Phep nhan: a * b = ");
        System.out.println(a*b);
        System.out.print("- Phep chia: a / b = ");
        System.out.println(a/b);

        System.out.println("bien word la: " + word);


        if (isAnswer == true){
            System.out.println("tat ca dap an:" + isAnswer);
        }

        System.out.println(end);


        //endregion

        //region Bài 02
        /* Implement your code here */


        //endregion
    }
}
