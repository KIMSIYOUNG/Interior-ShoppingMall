# Interior-ShoppingMall
- 20 - 30대를 타겟으로 한, 인테리어 쇼핑몰 입니다. 
## 프로젝트 구조 및 결과 화면

- 실행화면

<div>
<img width="1680" alt="스크린샷 2019-12-02 오후 4 22 21" src="https://user-images.githubusercontent.com/49060374/69938614-1ba31c80-1521-11ea-8bf4-5ea4346094f4.png">

- 프로젝트 구조

<div>
<img width="1000" alt="bit-structure" src="https://user-images.githubusercontent.com/49060374/69938605-1a71ef80-1521-11ea-91c1-2c7333a5d90e.png">
</div>


## 실행
1. console : mvn clean package

2. src-main-java- AcademyApplication 실행

3. http://localhost:8080/main/index
 
## 구현 기능
- 사용자

    - 로그인 관련
    
        - 회원가입  
        - 로그인
        - 아이디 비밀번호 찾기
        - 내 정보 조회
        
    - 게시판 관련 (Q & A 게시판)
     
        - 게시판 작성
        - 수정 & 삭제 & 조회
        
    - 상품 관련
    
        - 상품 조회(카테고리 별)
        - 장바구니
        - 상품 구매
            - 주소 입력
            - 실제 결제 연동만 되어 있음. (사업자 등록되어 있지 않아 환불되는 형태)

- 관리자

    - 회원 조회
    - 제품 판매량 조회
    - Q&A 게시판 답변 권한
    - 상품 등록 및 수정             
            
## 사용 기술

- Spring boot project 

- Project Structure : Web MVC 

- Build Tool : Maven

- DB : aws rds mysql, MyBatis

- View : Thymeleaf , Bootstrap

- VCS : Git , Github
