# GITADORA Pattern Recommender Backend
GITADORA Pattern Recommender Backend

## 사용 기술
- Java 17
- Spring Boot 2.7.5 -> 3.0.1
- Lombok
- Spring Data JPA
- H2 Database
- MySQL

## 패키지 구조
- domain
  - 도메인 모델 (곡, 버전, 패턴, 난이도)
- application
  - 도메인 모델을 둘러싼 서비스 계층
- adapter
  - application의 incoming port를 호출하거나 outgoing port의 구현 제공