# BoardWebMVC
MVC 프레임워크를 적용시킨 커뮤니케이션 웹

### 레포지토리 소개
```
Spring MVC 학습 전 MVC 프레임워크 구조 학습을 위한 프로젝트
JavaBeans, Jsp
JSTL과 EL을 이용 
```


### MVC 프레임워크?
```
1. Model1에서 jsp 내부에 View와 Controller가 같이 있는 것을 분리 시키기 위해 등장 
2. Controller, View, Model로 이루어짐
```

### 전체적인 흐름 
```
1. 클라이언트의 요청이 DispatherServlet으로 들어옴 
2. DispatherServlet은 HandlerMapping 클래스를 통해 요청에 해당되는 Controller를 받아내고 수행시킴 
3. Controller는 로직을 수행하고, 이동할 화면이 어디인지 알려줌 
4. DispatcherServlet은 이동할 화면이 어디인지 알아내고 ViewResolver를 통해 전체적인 URI를 받아냄
5. 화면을 이동함
```

### 기능?
```
1. 로그인, 로그아웃 기능
2. 게시물 등록, 수정, 삭제 기능
```
