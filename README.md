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
**Đinh Nguyễn Thanh Tuyền - 51900617** <br>
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
    - [2.2 Visual Studio Code](#22-visual-studio-code)
    - [2.3 Extension:](#23-extension)
      - [2.3.1 Extension Pack for Java](#231-extension-pack-for-java)
      - [2.3.1 Maven for Java](#231-maven-for-java)
    - [2.4 Java Development Kit (JDK)](#24-java-development-kit-jdk)
  - [3. CÁCH THỰC THI ỨNG DỤNG](#3-cách-thực-thi-ứng-dụng)
    - [3.1 Mở thư mục project bằng Visual Studio Code](#31-mở-thư-mục-project-bằng-visual-studio-code)
    - [3.2 Truy cập App.java](#32-truy-cập-appjava)
    - [3.3 Chọn Run Java](#33-chọn-run-java)
    - [3.4 Thực thi ứng dụng](#34-thực-thi-ứng-dụng)
  - [4. KIẾN THỨC CƠ BẢN](#4-kiến-thức-cơ-bản)
    - [4.1 Pattern Strategy](#41-pattern-strategy)
      - [4.1.1 Giới thiệu](#411-giới-thiệu)
      - [4.1.2 Lý do sử dụng](#412-lý-do-sử-dụng)
    - [4.2 Pattern Template Method](#42-pattern-template-method)
      - [4.2.1 Giới thiệu](#421-giới-thiệu)
      - [4.2.2 Lý do sử dụng](#422-lý-do-sử-dụng)
    - [4.3 Pattern Abstract Facroty](#43-pattern-abstract-facroty)
      - [4.3.1 Giới thiệu](#431-giới-thiệu)
      - [4.3.2 Lý do sử dụng](#432-lý-do-sử-dụng)
    - [4.4 Pattern Adapter](#44-pattern-adapter)
      - [4.4.1 Giới thiệu](#441-giới-thiệu)
      - [4.4.2 Lý do sử dụng](#442-lý-do-sử-dụng)
  - [5. TRIỂN KHAI ỨNG DỤNG](#5-triển-khai-ứng-dụng)
    - [5.1 Chi tiết ứng dụng](#51-chi-tiết-ứng-dụng)
      - [5.1.1 Ngôn ngữ lập trình](#511-ngôn-ngữ-lập-trình)
      - [5.1.2 Cấu trúc thư mục](#512-cấu-trúc-thư-mục)
    - [5.2 Pattern](#52-pattern)
    - [5.3 Class Diagram](#53-class-diagram)
  - [6. KẾT QUẢ THỰC TẾ](#6-kết-quả-thực-tế)
  - [THÔNG TIN NGƯỜI PHÁT TRIỀN](#thông-tin-người-phát-triền)

---

### 1. GIỚI THIỆU VỀ ỨNG DỤNG

Công nghệ đã và đang phát triển không ngừng theo thời gian, kéo theo đó là sự đa dạng về các loại file mặc dù chúng có chung chức năng.

Ví dụ như, ta có file .png , .jpeg, .ico , .bmp, đều có chung chức năng là hiển thị hình ảnh. File .xml, .json, .csv, đều dùng để lưu trữ dữ liệu. Nhưng có những dịch vụ mà chúng yêu cầu đầu vào là file .abc mà không phải là file .xyz, mặc dù chúng đều có chung 1 chức năng. Vì thế, yêu cầu đặt ra là làm thế nào để chúng ta có thể chuyển đổi giữa các loại file với nhau.

Do đó, nhóm chúng em đã nghiên cứu, phát triển và áp dụng các design pattern thành một terminal app dùng để chuyển đổi một file từ định dạng này sang một định dạng khác có cùng chức năng, mà không cần đổi đuôi file, vì đôi khi đổi đuôi file thì có thể xảy ra lỗi hoặc không đọc file được.

### 2. YÊU CẦU

#### 2.1 Thư viện JSON-Java (org.json)

#### 2.2 Visual Studio Code

#### 2.3 Extension:

##### 2.3.1 Extension Pack for Java

##### 2.3.1 Maven for Java

#### 2.4 Java Development Kit (JDK)

### 3. CÁCH THỰC THI ỨNG DỤNG

#### 3.1 Mở thư mục project bằng Visual Studio Code

#### 3.2 Truy cập App.java

 - Đường dẫn: /src/main/java/com/example/App.java

#### 3.3 Chọn Run Java

#### 3.4 Thực thi ứng dụng

 - Copy tập tin input vào thư mục input

 - Nhập lệnh chuyển đổi:
   - json2xml: json to xml
   - xml2json: xml to json
   - json2csv: json to csv
   - csv2json: csv to json

 - Ứng dụng trả kết quả qua thư mục output

### 4. KIẾN THỨC CƠ BẢN
#### 4.1 Pattern Strategy
##### 4.1.1 Giới thiệu

 - Strategy Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern). 
 - Nó cho phép định nghĩa tập hợp các thuật toán, đóng gói từng thuật toán lại, và dễ dàng thay đổi linh hoạt các thuật toán bên trong object
 - Strategy cho phép thuật toán biến đổi độc lập khi người dùng sử dụng chúng
  
##### 4.1.2 Lý do sử dụng

 - Đảm bảo nguyên tắc Single responsibility principle (SRP) : một lớp định nghĩa nhiều hành vi và chúng xuất hiện dưới dạng với nhiều câu lệnh có điều kiện. Thay vì nhiều điều kiện, chúng ta sẽ chuyển các nhánh có điều kiện liên quan vào lớp Strategy riêng lẻ của nó.
 - Đảm bảo nguyên tắc Open/Closed Principle (OCP) : chúng ta dễ dàng mở rộng và kết hợp hành vi mới mà không thay đổi ứng dụng.
 - Cung cấp một sự thay thế cho kế thừa.

#### 4.2 Pattern Template Method

##### 4.2.1 Giới thiệu

 - Template Method là một trong những Pattern thuộc nhóm hành vi (Behavioral Pattern)
 - Template Method là một mẫu thiết kế được dùng để thực hiện một thứ tự các phương thức theo một khuôn mẫu và các lớp con của nó có thể ghi đè một vài hoặc toàn bộ phương thức tương ứng với đặc trưng của riêng mỗi lớp con
 - Ví dụ một hệ thống thanh toán bằng tiền mặt hoặc card phải qua 3 bước tương ứng 3 method : Nhập số tiền, Xử lý thanh toán và Thông báo. Có thể dùng method nhập tiền chung, nhưng method xử lý và thông báo thì lớp tiền mặt sẽ khác card.

##### 4.2.2 Lý do sử dụng

 - Tạo quy trình và rút gọn, tối ưu hoá các bước khi thực hiện các method
 - Thay vì gọi một lúc nhiều method để thực thi thì chỉ cần dùng 1 method, method này sẽ gọi toàn bộ các method khác theo một trình tự được sắp xếp từ trước

#### 4.3 Pattern Abstract Facroty

##### 4.3.1 Giới thiệu

 - Abstract Factory là một trong những Pattern thuộc nhóm khởi tạo (Creational Pattern)
 - Abstract Factory cung cấp một giao diện giúp khởi tạo ra những Factory khác có liên quan hoặc phụ thuộc mà không cần quan tâm đến các lớp con cụ thể được tạo ra sao.
 - Mỗi một giao diện có nhiệm vụ tạo ra một Factory của các Object có liên quan đến nhau mà không cần phải chỉ ra class cụ thể của chúng.
 - Ví dụ chúng ta muốn tạo một loạt các đối tượng liên quan đến nhau theo một loạt những đặc trưng riêng như: Ghế, Bàn, Gỗ, Nhựa. Ta sẽ có 2 factory Ghế, Bàn mỗi factory sẽ có đặc tính Gỗ và Nhựa. Từ đó tạo ra Ghế Nhựa, Bàn Nhựa, Ghế Gỗ, Bàn Gỗ

##### 4.3.2 Lý do sử dụng

 - Dùng Abstract Factory để tạo ra những Factory cung cấp các đối tượng chuyển đổi loại tập tin và tránh bùng nổ những đối tượng con có liên quan hoặc phụ thuộc nhau như JSON to XML, XML to JSON, ...
 - Dễ dàng maintain và thêm vào những Factory hoặc đối tượng mới có liên quan hoặc phụ thuộc nhau như mở rộng chức năng, chỉnh sửa phương thức.

#### 4.4 Pattern Adapter 

##### 4.4.1 Giới thiệu

 - Adapter Pattern là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). 
 - Adapter Pattern đóng vai trò trung gian, tương thích cho hệ thống sẵn có đối ứng với các component mới mà không cần phải sửa đổi code, cho phép các interface không liên quan đến nhau có thể làm việc cùng nhau.

##### 4.4.2 Lý do sử dụng

 - Sử dụng và nâng cấp một hệ thống mới và không muốn đụng vào mô hình của các thế hệ trước kia. 
 - Cần phải có sự chuyển đổi interface từ nhiều nguồn khác nhau.
 - Cần đảm bảo nguyên tắc Open/ Close trong một ứng dụng.
 - Tạo ra những lớp có khả năng sử dụng lại, chúng phối hợp với các lớp không liên quan hay những lớp không thể đoán trước được và những lớp này không có những interface tương thích.

### 5. TRIỂN KHAI ỨNG DỤNG

#### 5.1 Chi tiết ứng dụng

##### 5.1.1 Ngôn ngữ lập trình

 - Java

##### 5.1.2 Cấu trúc thư mục



#### 5.2 Pattern

#### 5.3 Class Diagram

<div align="center">

<img src="https://files-provider.up.railway.app/strategy.png" alt="Class Diagram" width="500">

</div>

### 6. KẾT QUẢ THỰC TẾ

### THÔNG TIN NGƯỜI PHÁT TRIỀN

 - Đặng Hoàng Nam - 51900708
 - Lê Tuấn Anh - 51900698
 - Đinh Nguyễn Thanh Tuyền - 51900617