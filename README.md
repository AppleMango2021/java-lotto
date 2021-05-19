# 🚀2단계 - 문자열 덧셈 계산기

##문자열 덧셈 계산기란?
쉼표(,) 또는 콜론(:) 등을 구분자로 가지는 문자열을 전달하였을 때, 구분자를 기준으로 분리한 
각 숫자의 합을 반환하는 계산기 
(ex) "1,2" => 3

##요구사항
> 📍 표시가 있는 부분은, 프로그램의 기능을 조금 더 명확히 하기 위해 제가 추가로 
> 명시한 요구사항 혹은 제약 사항입니다.  
1. 문자열을 입력 받는다. 
   * 빈 문자열 또는 null값인 경우에는 0을 반환한다. 
   * 📍 숫자 이외의 값 또는 음수가 전달되는 경우, `IllegalArgumentException`을 던진다.
2. 쉼표(,) 또는 콜론(:)을 구분자로 하여 문자열을 분리할 수 있다.
3. 쉼표와 콜론 이외의 커스텀 구분자를 사용하여서도 문자열을 분리할 수 있다. 
    * 커스텀 구분자는 "//"와 "\n" 사이에 위치하는 문자이다.
    * 커스텀 구분자를 사용하는 경우, 문자열 앞에 먼저 입력된다.
    * 📍 커스텀 구분자는 1개까지만 입력 가능하다 
    * 📍 쉼표,콜론 그리고 커스텀 구분자를 섞어서 사용할 수 있다. 
      * ex. 커스텀 구분자가 '-'인 경우, "1-2:3,4"와 같이 입력하여도 분리 가능하다.  



---
# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)