# Java-Ver.3

자바 스터디

---

### **Part 1: Java Basics (기초)**

*관련 챕터: Chapter 1 ~ 10 (변수, 연산자, 조건문, 반복문, 배열)*

1. **계산기 만들기 (Switch문 활용)**
    - 두 개의 정수와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 프로그램을 작성하세요.
    - `switch` 문(또는 Java 12+ Switch 식)을 사용하여 연산자에 따른 분기 처리를 하세요.
    - 나눗셈의 경우 0으로 나누는 상황을 고려할 필요는 없으나, 기본적인 사칙연산이 동작해야 합니다.
2. **배열 통계 구하기 (For문 & 배열)**
    - 정수 10개를 저장할 수 있는 배열을 만들고, 임의의 숫자 10개(예: `10, 25, 33...`)를 초기화하세요.
    - `for` 문(또는 향상된 for문)을 사용하여 배열 내 모든 숫자의 합계(sum)와 최대값(max)을 구하여 출력하세요.
3. **구구단 출력 (이중 반복문)**
    - 사용자로부터 2에서 9 사이의 숫자를 입력받지 않고, 2단부터 9단까지 전체 구구단을 출력하세요.
    - 이중 `for` 문 혹은 `while` 문을 사용하여 `2 * 1 = 2` 형식으로 출력되도록 구현하세요.
4. **짝수/홀수 판별 (조건문)**
    - 사용자로부터 정수 하나를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
    - `if-else` 문과 나머지 연산자(`%`)를 활용하세요.
5. **별 찍기 (반복문)**
    - 사용자로부터 줄 수 n을 입력받아 직각삼각형 모양의 별을 출력하세요.
    - n이 5라면 1줄에 별 1개, 2줄에 별 2개, ... 5줄에 별 5개가 출력되어야 합니다.
    - 이중 반복문을 사용하세요.
6. **소수 판별 (반복문 + 조건문)**
    - 사용자로부터 2 이상의 정수를 입력받아 해당 숫자가 소수(Prime number)인지 판별하세요.
    - 2부터 √n 까지 반복문으로 나누어보며 소수 여부를 확인하세요.

---

### **Part 2: OOP (객체 지향 프로그래밍)**

*관련 챕터: Chapter 11 ~ 20 (클래스, 생성자, 상속, 다형성, 인터페이스)*

1. **Book 클래스 설계 (클래스와 생성자)**
    - `Book` 클래스를 만들고 `title`(제목), `author`(저자), `price`(가격) 필드를 선언하세요.
    - 모든 필드를 초기화하는 생성자를 작성하세요.
    - `displayInfo()` 메서드를 만들어 책의 정보를 출력하고, `Main` 클래스에서 객체를 생성하여 테스트하세요.
2. **동물 농장 (상속과 오버라이딩)**
    - `Animal` 클래스를 정의하고 `cry()` 메서드("동물이 웁니다")를 만드세요.
    - `Animal`을 상속받는 `Cat`과 `Dog` 클래스를 만들고, `cry()` 메서드를 오버라이딩하여 각각 "야옹", "멍멍"을 출력하게 하세요.
    - 다형성을 활용하여 `Animal` 타입 변수에 `Cat` 객체를 담아 `cry()`를 호출해 보세요.
3. **리모컨 인터페이스 (인터페이스)**
    - `RemoteControl` 인터페이스를 정의하고 `turnOn()`, `turnOff()` 추상 메서드를 선언하세요.
    - 이 인터페이스를 구현하는 `Television` 클래스를 작성하세요.
    - 전원이 켜지고 꺼지는 메시지를 출력하도록 메서드를 구현하세요.
4. **은행 계좌 (캡슐화)**
    - `BankAccount` 클래스를 만들고 `owner`, `balance` 필드를 `private`으로 선언하세요.
    - `deposit(int amount)`, `withdraw(int amount)`, `displayBalance()` 메서드를 작성하세요.
    - 잔액보다 큰 금액을 출금하려고 하면 "잔액이 부족합니다" 메시지를 출력하세요.
5. **추상 클래스 도형 (Abstract Class)**
    - 추상 클래스 `Shape`를 만들고 추상 메서드 `area()`를 선언하세요.
    - `Shape`를 상속받는 `Circle`, `Rectangle` 클래스를 작성하고 각각 넓이를 계산하도록 구현하세요.
    - `Shape[]` 배열에 두 객체를 담아 반복문으로 넓이를 출력해 보세요.
6. **사람과 학생 (super 활용)**
    - `Person` 클래스에 `name`, `age` 필드를 선언하고, `introduce()` 메서드를 구현하세요.
    - `Person`을 상속받는 `Student` 클래스를 만들고 `major` 필드를 추가하세요.
    - `Student`의 `introduce()`에서 `super.introduce()`를 호출한 뒤 전공 정보도 출력하세요.

---

### **Part 3: Essential API (필수 API)**

*관련 챕터: Chapter 21 ~ 28 (String, Wrapper, 예외처리, 날짜/시간)*

1. **회문(Palindrome) 판별기 (String & StringBuilder)**
    - 특정 문자열(예: "level", "java")이 앞으로 읽으나 뒤로 읽으나 같은지 판별하는 메서드를 작성하세요.
    - `StringBuilder`의 `reverse()` 기능을 활용하거나 `String`의 문자들을 비교하여 구현하세요.
2. **안전한 나눗셈 (Exception Handling)**
    - 사용자(혹은 변수)로부터 두 정수를 받아 나눗셈을 하는 프로그램을 작성하세요.
    - 분모가 0일 때 발생하는 `ArithmeticException`을 `try-catch` 블록으로 처리하여 "0으로 나눌 수 없습니다"라는 메시지를 출력하세요.
3. **오늘 날짜 포맷팅 (Date/Time API)**
    - `LocalDateTime`을 사용하여 현재 날짜와 시간을 가져오세요.
    - `DateTimeFormatter`를 활용하여 "2024년 05월 20일 14시 30분"과 같은 형식으로 출력하세요.
4. **문장 단어 분리 (String.split)**
    - 한 문장(예: "Java is fun and powerful")을 공백 기준으로 분리하세요.
    - `String.split()`을 사용하여 단어 배열을 만들고, 각 단어와 총 단어 수를 출력하세요.
5. **사용자 정의 예외 (Custom Exception)**
    - `Exception`을 상속한 `InvalidAgeException`을 정의하세요.
    - 나이가 19세 미만이면 해당 예외를 던지는 `checkAge(int age)` 메서드를 작성하세요.
    - `try-catch`로 예외를 잡아 메시지를 출력하세요.
6. **두 날짜 사이의 일수 (ChronoUnit)**
    - `LocalDate`로 두 날짜를 정의하세요 (예: 2024-01-01, 2024-12-31).
    - `ChronoUnit.DAYS.between()`을 사용하여 두 날짜 사이의 일수를 계산해 출력하세요.

---

### **Part 4: Data Structure (자료구조)**

*관련 챕터: Chapter 29 ~ 33 (Generics, List, Set, Map)*

1. **학생 명단 관리 (List)**
    - `ArrayList<String>`을 생성하여 학생 5명의 이름을 저장하세요.
    - 특정 학생의 이름을 리스트에서 삭제하고, 남은 학생들의 이름을 향상된 `for` 문으로 출력하세요.
2. **중복 제거기 (Set)**
    - `{10, 20, 10, 30, 20, 40, 50}`과 같이 중복된 숫자가 포함된 배열이 있습니다.
    - 이 배열의 내용을 `HashSet`에 넣어 중복을 제거하고, 최종적으로 남은 숫자들을 출력하세요.
3. **단어 사전 (Map)**
    - `HashMap<String, String>`을 사용하여 영단어와 뜻을 저장하세요 (예: "apple" -> "사과").
    - 3개의 단어를 저장한 뒤, 특정 영단어(Key)로 뜻(Value)을 찾아 출력하는 코드를 작성하세요.
4. **우선순위 큐 (PriorityQueue)**
    - `PriorityQueue<Integer>`에 임의의 정수 5개를 `offer()`로 삽입하세요.
    - `poll()`을 사용하여 큐가 빌 때까지 꺼내며, 작은 값부터 출력되는 것을 확인하세요.
5. **단어 빈도수 계산 (Map.getOrDefault)**
    - 문장(예: "apple banana apple orange banana apple")을 공백으로 분리하세요.
    - `HashMap`과 `getOrDefault`를 사용해 각 단어가 몇 번 등장하는지 카운트하여 출력하세요.
6. **정렬된 Set (TreeSet)**
    - `TreeSet<String>`에 임의의 이름 여러 개를 중복 포함해 저장하세요.
    - 중복이 자동 제거되고 알파벳 순으로 정렬되어 출력되는 것을 확인하세요.

---

### **Part 5: Advanced Modern Java (고급)**

*관련 챕터: Chapter 34 ~ 40 (람다, 스트림, IO, 쓰레드)*

1. **문자열 필터링 (Stream API)**
    - `List<String>`에 {"Apple", "Banana", "Avocado", "Cherry", "Apricot"}를 저장하세요.
    - Stream을 사용하여 **'A'로 시작하는 단어**만 필터링하고, 이를 대문자로 변환하여 출력하세요.
2. **파일 쓰기와 읽기 (File I/O)**
    - `java.nio.file.Files`를 사용하여 "test.txt" 파일에 "Hello Java"라는 문자열을 쓰세요.
    - 다시 그 파일을 읽어 콘솔에 내용을 출력하는 코드를 작성하세요. (예외 처리가 필요합니다)
3. **카운트다운 쓰레드 (Thread)**
    - 1부터 10까지 숫자를 1초 간격으로 출력하는 쓰레드를 구현하세요.
    - `Thread.sleep(1000)`을 사용하여 1초 대기 효과를 주고, 람다 표현식을 사용하여 `Runnable`을 구현해 보세요.
4. **Stream 통계 (IntSummaryStatistics)**
    - 정수 10개가 담긴 `List<Integer>`를 만드세요.
    - Stream의 `mapToInt`와 `summaryStatistics()`를 사용하여 합계, 평균, 최대, 최소를 한 번에 구하세요.
5. **Optional 사용하기 (Optional)**
    - `findUserName(int id)` 메서드가 `Optional<String>`을 반환하도록 작성하세요.
    - 존재하지 않는 ID를 조회했을 때 `orElse` 또는 `ifPresentOrElse`로 적절한 분기 처리를 구현하세요.
6. **함수형 인터페이스 (Predicate & Function)**
    - `Predicate<Integer>`로 짝수 판별 람다, `Function<Integer, Integer>`로 제곱 계산 람다를 정의하세요.
    - 정수 리스트를 Stream으로 처리하여 짝수만 필터링하고 제곱 결과를 출력하세요.
