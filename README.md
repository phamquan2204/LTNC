1. Thiết kế một lớp có tên Fan để đại diện cho một chiếc quạt. Lớp chứa:

- Ba hằng số SLOW, MEDIUM và FAST với các giá trị 1, 2 và 3 để biểu thị tốc độ quạt.

- Trường dữ liệu speed (private, int) chứa tốc độ của quạt (mặc định là SLOW).

- Trường dữ liệu on (private, boolean) chỉ định quạt có bật hay không (giá trị mặc định là false).

- Trường dữ liệu radius (private, double) chứa bán kính của quạt (mặc định là 5).

- Trường dữ liệu color (string) chứa màu của quạt (mặc định là màu xanh lam).

- Các phương thức get, set cho cả bốn trường dữ liệu.

- Phương thức khởi tạo không đối số tạo ra một quạt với các giá trị mặc định.

- Phương thức có tên toString () trả về một chuỗi ký tự mô tả quạt. Nếu quạt đang bật, phương thức trả về tốc độ, màu sắc và bán kính của quạt trong một chuỗi kết hợp. Nếu quạt không được bật, phương thức trả về màu và bán kính của quạt cùng với chuỗi “quạt tắt” trong một chuỗi kết hợp.

Vẽ biểu đồ UML cho lớp sau đó triển khai lớp. Viết chương trình thử nghiệm tạo hai đối tượng Fan. Gán tốc độ tối đa, bán kính 10, màu vàng và được bật cho đối tượng đầu tiên. Gán tốc độ trung bình, bán kính 5, màu xanh lam và bị tắt cho đối tượng thứ hai. Hiển thị các đối tượng bằng cách gọi phương thức toString.

2. Thiết kế một lớp có tên MyInteger. Lớp chứa:

- Trường dữ liệu value (int) lưu trữ giá trị một số nguyên

- Phương thức khởi tạo có đối.

- Phương thức getValue() trả về giá trị.

- Các phương thức isEven (), isOdd () và isPrime () trả về true nếu giá trị trong đối tượng này tương ứng là chẵn, lẻ hoặc nguyên tố.

- Các phương thức tĩnh isEven (int), isOdd (int) và isPrime (int) trả về true nếu giá trị được được truyền vào hàm tương ứng là chẵn, lẻ hoặc nguyên tố..

- Các phương thức tĩnh isEven (MyInteger), isOdd (MyInteger) và isPrime (MyInteger) trả về true nếu đối tượng được truyền vào hàm tương ứng là chẵn, lẻ hoặc nguyên tố

- Các phương equals (int) và equals (MyInteger) trả về true nếu giá trị trong đối tượng này bằng giá trị được truyền vào hàm.

- Phương thức tĩnh parseInt (char []) chuyển đổi một mảng các ký tự số thành giá trị int.

- Phương thức tĩnh parseInt (String) chuyển đổi một chuỗi thành giá trị int.

Vẽ biểu đồ UML cho lớp sau đó triển khai lớp. Viết một chương trình khách kiểm tra tất cả các phương thức trong lớp.

 

3. Thiết kế một lớp có tên Tài khoản chứa:

- Trường dữ liệu id (private, int) chứa mã tài khoản (mặc định là 0).

- Trường dữ liệu balance (private, double) chứa số dư tài khoản (mặc định là 0)

- Trường dữ liệu annualInterestRate  để lưu trữ lãi suất năm (mặc định là 0) ở thời điểm hiện tại. Giả sử rằng tất cả các tài khoản có cùng lãi suất năm.

- Trường dữ liệu dateCreated (private, Date) lưu trữ ngày tài khoản được tạo.

- Phương thức khởi tạo không đối số tạo tài khoản mặc định.

- Phương thức khởi tạo tạo tài khoản với mã tài khoản và số dư ban đầu được chỉ định

- Các phương pháp lấy (get) và gán (set) cho id, balance  và annualInterestRate.

- Phương thức lấy (get) ngày được tạo.

- Phương thức getMonthlyInterestRate () trả về lãi suất tháng.

- Phương thức getMonthlyInterest () trả về tiền lãi hàng tháng.

- Phương thức withdraw rút một số tiền cụ thể từ tài khoản.

- Phương thức deposit gửi một số tiền cụ thể vào tài khoản.

Vẽ biểu đồ UML cho lớp sau đó triển khai lớp. Gợi ý:

Tiền lãi hàng tháng là balance * monthlyInterestRate.

monthInterestRate là annualInterestRate / 12

 Viết một chương trình thử nghiệm tạo một đối tượng Tài khoản với ID tài khoản là 1012, số dư là 20.000.000 và lãi suất hàng năm là 4,5%. Sử dụng phương thức rút tiền để rút 1.500.000, sử dụng phương thức gửi tiền để gửi 3.000.000 và in số dư, tiền lãi hàng tháng và ngày tài khoản này được tạo.

4. Sử dụng lớp Tài khoản được tạo trong Bài 3 để mô phỏng một máy ATM. Tạo 10 tài khoản trong một mảng có id 0, 1,. . . , 9 và số dư ban đầu là 1.000.000. Hệ thống sẽ nhắc người dùng nhập id. Nếu id được nhập không chính xác, hãy yêu cầu người dùng nhập đúng id. Một khi một id được chấp nhận, menu chính được hiển thị như hình mẫu dưới đây (Assignment3-pic.png). Ta có thể nhập lựa chọn 1 để xem số dư hiện tại, 2 để rút tiền, 3 để gửi tiền và 4 để thoát khỏi menu chính. Sau khi thoát, hệ thống sẽ nhắc nhập lại id. Vì vậy, một khi hệ thống khởi động, nó sẽ không dừng lại.