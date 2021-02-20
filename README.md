# Spring-Example
## 회원 관리 예제 : 백엔드 개발, 웹 MVC 개발

1. 비즈니스 요구사항 정리

2. 회원 도메인과 리포지토리 만들기
 2.1 Member Class
 2.2 Member Repository : 사용하고자하는 기능(.interface)
 2.3 Memory Member Repository : 기능 설계
 
3. 회원 리포지토리 테이스 케이스 작성
 3.1 Test Code
 
4. 회원 서비스 개발
 4.1 Domain을 활용한 비즈니스 로직 작성
 
5. 회원 서비스 테스트
 5.1 Controller와 View Templates를 통한 화면 구성
 
#### Folder 계층 구조

* main
 ** Domain
  *** DomainApplication.java
  *** Member.java
 ** repository
  *** MemberRepository.java
  *** MemoryMemberRepository.java
 ** service
  *** MemberService.java
 ** controller
  *** HomeController.java
  *** MemberController.java
  *** MemberForm.java
 
* resources
 ** templates
  *** home.html : 회원 웹 기능 - 홈 화면 추가
  *** members
   **** createMemberForm.html : 회원 웹 기능 - 등록
   **** memberList.html : 회원 웹 기능 -조회

* test
 ** Domain
  *** DomainApplicationTests.java
  *** repository
   **** MemoryMemberRepositoryTest.java
 ** service
  *** MemberServiceTest.java
  
#### Intelij 단축키 

1. Code generation 단축키
 * Alt + Insert
 * 기능 : Constructor, getter and setter

2. Return 반환 단축키
 * Ctrl + Alt + V

3. Extract method 단축키
 * Ctrl + Alt + Shift + T
 
4. 선택 요소 Rename 단축키
 * Shift + F6

5. 라인 이동 단축키
 * Shift + Enter

6. 그 외 유용한 Intelij 단축키
 <a href "https://blog.jetbrains.com/idea/2020/03/top-15-intellij-idea-shortcuts/">Top 15 IntelliJ IDEA Shortcuts</a>
 
#### Test Code 작성 요령
- given, when, then 으로 나눠 작성
- Class명에 마우스 커서 위치 후 Alt + Enter : Test Case 구조 생성 










