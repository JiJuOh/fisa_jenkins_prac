<div align="center">
  
<h1 style="font-size: 0.5em;">fisa_jenkins_prac <img src="https://www.jenkins.io/images/logos/belarus/belarus.png" height="100px"/> </h1>

**TITLE**
<br/>
2개의 EC2 인스턴스를 이용한 IaaS 프로젝트
<br/><br/>
**DURATION**
<br/>
2024.02.21 - 2024.02.22

**GOAL**
<br/><br/>
젠킨스 서버 인스턴스, 웹서버 인스턴스(프리티어) 를 연동 하여 CI 완성하기 
<br/><br/><br/>

**SKILLS**
<br/><br/>
![java](https://img.shields.io/badge/java-007396.svg?&style=for-the-badge&logo=openjdk&logoColor=white)
![spring](https://img.shields.io/badge/spring-6DB33F.svg?&style=for-the-badge&logo=spring&logoColor=white)
![ubuntu](https://img.shields.io/badge/ubuntu-E95420?&style=for-the-badge&logo=ubuntu&logoColor=white)
<br/>
![git](https://img.shields.io/badge/git-F05032.svg?&style=for-the-badge&logo=git&logoColor=white)
![github](https://img.shields.io/badge/github-181717.svg?&style=for-the-badge&logo=github&logoColor=white)
![ngrok](https://img.shields.io/badge/ngrok-1F1E37.svg?&style=for-the-badge&logo=ngroks&logoColor=white)
![aws](https://img.shields.io/badge/aws-232F3E.svg?&style=for-the-badge&logo=amazonaws&logoColor=white)
![docker](https://img.shields.io/badge/docker-2496ED.svg?&style=for-the-badge&logo=docker&logoColor=white)
<br/><br/><br/>



**STAGES**
<br/><br/>
<p>1. 스프링 프로젝트 만들기</p>
<p>2. 깃허브에 repository 생성</p>
<p>3. 깃 배쉬로 add, commit, push</p>
<p>4. 젠킨스서버 인스턴스 만들기 myec2_14, t2.2xlarge 사이즈</p>
<p>5. myec2_14에 도커 설치</p>
<p>6. myec2_14 도커에 젠킨스 80:8080 로 컨테이너 스타트</p>
<p>7. 웹서버 인스턴스 만들기 myec2_14_micro, 프리티어 사이즈</p>
<p>8. myec2_14_micro의 pem key 생성해서 젠킨스 서버에서 ssh 코드생성</p>
<p>9. 젠킨스 서버에서 파이프라인 생성 : 깃 클론, 빌드, 웹서버에서 jar파일 푸쉬</p>
<p>10. 웹서버에서 java -jar *.jar로 실행해서 curl로 확인해보기</p>
<p>11. myec2_14 젠킨스를 ngrok에 연결, github webhooks 추가</p>
<p>12. 커밋 발생할 때마다 CI되고 있는 지 확인하기</p>
<p>(예정)웹서버에서도 자동 execute 될 수 있게 파이프라인에 추가해서 확인하기</p>
<br/><br/><br/>

**ARCHITECTURE**

![0220mission](https://github.com/JiJuOh/fisa_jenkins_prac/assets/31668639/250427ec-2a7b-4c31-8634-8136264d8b21)



</div>
