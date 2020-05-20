# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 계산기 Todo List
- InputView
    - [X] 입력값 중 기본 구분자(:와 ,)를 제외한 숫자만 골라서 콜렉션으로 만든다.
    - [X] 콜렉션 전환 시 Number 타입으로 바꾼다.
    - [X] 커스텀 구분자가 있는 경우 해당 구분자를 추출해야 한다.
    
- Calculator
    - [X] 숫자 콜렉션을 받아서 콜렉션의 합을 계산할 수 있다.
    
- Number
    - [X] 양수로 전환 가능한 정수형을 담는 클래스를 만들어서 입력값 검증을 담당시킨다.
    
- CalculatorService
    - [X] InputView에서 넘어온 값을 기반으로 연산을 수행한 뒤 결과값 반환
    
## 문자열 계산기 리뷰 반영
- [X] Calculator 객체에서 자주 쓰는 값 캐싱하기
- [ ] if문의 자바 컨벤션 지키기 (Number, InputView)
- [ ] 자료구조 형이 들어간 변수명 개선하기
- [ ] Number 객체의 add 메서드 파라미터 이름 수정
- [ ] InputView에서 의미가 있는 변수들 상수화 하기
- [ ] 비싼 연산(Pattern) 줄이기
