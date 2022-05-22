<div align="center">

**TỔNG LIÊN ĐOÀN LAO ĐỘNG VIỆT NAM**<br>
**TRƯỜNG ĐẠI HỌC TÔN ĐỨC THẮNG**<br>
**KHOA CÔNG NGHỆ THÔNG TIN**

<img src="https://upload.wikimedia.org/wikipedia/vi/1/1b/TĐT_logo.png"  alt="TDT-Logo" width="100">

#### BÀI TẬP TIỂU LUẬN GIỮA KỲ MÔN

#### MẪU THIẾT KẾ

## CHUYỂN ĐỔI ĐỊNH DẠNG TẬP TIN

</div>

<div align="right" style="margin-top: 150px">

_Người hướng dẫn:_ **Thầy Đặng Huỳnh Trung Tín** <br>
_Người thực hiện:_ **Đặng Hoàng Nam - 51900708** <br>
**Lê Tuấn Anh - 51900698** <br>
_Khóa:_ **23**

</div>

<div align="center" style="margin-top: 50px">

**THÀNH PHỐ HỒ CHÍ MINH, NĂM 2022**

</div>

---

- [CHUYỂN ĐỔI ĐỊNH DẠNG TẬP TIN](#chuyển-đổi-định-dạng-tập-tin)
  - [1. GIỚI THIỆU VỀ ỨNG DỤNG](#1-giới-thiệu-về-ứng-dụng)
  - [2. YÊU CẦU](#2-yêu-cầu)
    - [2.1 Thư viện JSON-Java (org.json)](#21-thư-viện-json-java-orgjson)
  - [3. CÁCH THỰC THI ỨNG DỤNG](#3-cách-thực-thi-ứng-dụng)
  - [4. KIẾN THỨC CƠ BẢN](#4-kiến-thức-cơ-bản)
    - [4.1 Pattern Stategy](#41-pattern-stategy)
      - [4.1.1 <b>Giới thiệu: </b>](#411-bgiới-thiệu-b)
      - [4.1.2 <b>Lý do sử dụng:</b>](#412-blý-do-sử-dụngb)
      - [4.1.3 <b>Class Diagram</b>](#413-bclass-diagramb)

---

### 1. GIỚI THIỆU VỀ ỨNG DỤNG

Công nghệ đã và đang phát triển không ngừng theo thời gian, kéo theo đó là sự đa dạng về các loại file mặc dù chúng có chung chức năng.

Ví dụ như, ta có file .png , .jpeg, .ico , .bmp, đều có chung chức năng là hiển thị hình ảnh. File .xml, .json, .csv, đều dùng để lưu trữ dữ liệu. Nhưng có những dịch vụ mà chúng yêu cầu đầu vào là file .abc mà không phải là file .xyz, mặc dù chúng đều có chung 1 chức năng. Vì thế, yêu cầu đặt ra là làm thế nào để chúng ta có thể chuyển đổi giữa các loại file với nhau.

Do đó, nhóm chúng em đã nghiên cứu, phát triển và áp dụng các design pattern thành một terminal app dùng để chuyển đổi một file từ định dạng này sang một định dạng khác có cùng chức năng, mà không cần đổi đuôi file, vì đôi khi đổi đuôi file thì có thể xảy ra lỗi hoặc không đọc file được.

### 2. YÊU CẦU

#### 2.1 Thư viện JSON-Java (org.json)

### 3. CÁCH THỰC THI ỨNG DỤNG

### 4. KIẾN THỨC CƠ BẢN
#### 4.1 Pattern Stategy
##### 4.1.1 <b>Giới thiệu: </b>
 - Strategy Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern). 
 - Nó cho phép định nghĩa tập hợp các thuật toán, đóng gói từng thuật toán lại, và dễ dàng thay đổi linh hoạt các thuật toán bên trong object-
 - Strategy cho phép thuật toán biến đổi độc lập khi người dùng sử dụng chúng
  
##### 4.1.2 <b>Lý do sử dụng:</b>
 - Đảm bảo nguyên tắc Single responsibility principle (SRP) : một lớp định nghĩa nhiều hành vi và chúng xuất hiện dưới dạng với nhiều câu lệnh có điều kiện. Thay vì nhiều điều kiện, chúng ta sẽ chuyển các nhánh có điều kiện liên quan vào lớp Strategy riêng lẻ của nó.
 - Đảm bảo nguyên tắc Open/Closed Principle (OCP) : chúng ta dễ dàng mở rộng và kết hợp hành vi mới mà không thay đổi ứng dụng.
 - Cung cấp một sự thay thế cho kế thừa.

##### 4.1.3 <b>Class Diagram</b>

<div align="center">

![MarineGEO circle logo](./Strategy.png "Strategy Class Diagram")
</div>
