# exampleHibernateWithSpring

### **1. Description**
* **exampleSpringSecurity**를 기본 틀로 활용
* **Spring**을 기반으로 **Hibernate**를 사용하여 DB와 연동한 예제 프로그램
* 현재 저장된 Offer 조회와 새로운 Offer를 생성하는 기능만 구현


### **2. Environment**
* **Eclispe**
  + Spring Legacy Project
    - Template : Spring MVC 선택
* **Server**
  + Tomcat
* **Database**
  + MySQL
  
  
### **3. Packages**
* **controller**
  + 사용자의 요청(request)을 처리하는 Class
  + Service Class의 객체를 사용하여 필요한 작업을 수행
  + **Custom Login Form**을 사용하기 위해 LoginController 클래스 사용
  + **HomeController, LoginController, OfferController**
* **dao**
  + DAO Class를 위한 패키지
  + DB에 접근하여 수행할 작업을 메서드로 구현
  + **Hibernate를 사용하여 이전보다 간략하게 CRUD 구현**
  + **OfferDao**
* **model**
  + 애플리케이션에서 사용할 Model Class를 위한 패키지
  + Annotation을 통해 Data Validation을 위한 제약 조건 설정
  + **Offer**
* **service**
  + Service Layer를 구현하는 Class
  + DAO Class의 객체를 사용하여 필요한 작업을 수행(**DAO의 CR만 사용함**)
  + **OfferService**
* **filter**
  + 기본 Filter 클래스를 포함하는 패키지
  + 사용자의 URL 요청을 콘솔에 출력
  + **TestFilter**


### **4. 주요 Files**
* **pom.xml**
  + 프로젝트 기본 정보 및 Dependency 관리
  + 사용한 Dependency(Spring Legacy Project 기반)
    - lombok
    - spring-orm
    - hibernate-core
    - hibernate-validator
    - spring-jdbc
    - mysql-connector-java
    - commons-dbcp2
    - spring-security-core
    - spring-security-web
    - spring-security-config
* **web.xml**
  + contextConfigLocation 설정(dao-context.xml, service-context.xml, security-context.xml)
  + DispatcherServlet 설정(servlet-context.xml)
  + SpringSecurityFilter
  + CharacterEncodeingFilter(한글 깨짐 필터링)
  + src/main/webapp/WEB-INF
* **jdbc.properties**
  + Database를 접근하기 위한 Property 정보
  + src/main/webapp/WEB-INF/props
* **views**
  + custom login 페이지를 포함한 웹 페이지들
  + **login.jsp**, **home.jsp**, **offers.jsp**, **createoffer.jsp**, **offercreated.jsp**
  + src/main/webapp/WEB-INF/views
* **css**
  + JSP 파일에 적용되는 CSS 스타일 정보
  + src/main/webapp/resources/css
