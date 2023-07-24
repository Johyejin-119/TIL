# 1. 마크다운 이란?
> 일반 텍스트 기반의 경량 마크업 언어
> 일반 텍스트로 서식이 있는 문서를 작성하는 사용
> ex) 지금 작성중이 velog도 마크다운 기반으로 작성할 수 있다. 그외 tistory, github도 마크다운을 지원한다.

# 2. 마크다운 장점

- 문법 쉽고 간결
- 관리 쉬움
- 지원가능한 플랫폼, 프로그램이 다양함

# 3. 마크다운 단점

- 표준이 없음
- 모든 HTML 마크업을 대신하지 못함

# 제목(Header)

# 제목 1
## 제목 2
### 제목 3
#### 제목 4
##### 제목 5
###### 제목 6

# 문장(Paragraph)

동해물과 백두산임 마르고 닳도록
하느님이 보우하사 우리나라 만세

# 줄바꿈(Line Breaks)

동해물과 백두산임 마르고 닳도록  
하느님이 보우하사 우리나라 만세  
무궁화 삼천리 화려 강산<br/>
대한 사람 대한으로 길이 보전하세<br/>
띄어쓰기 2번 넣거나 br태그

# 강조 (Emphasis)

_이텔릭_  
**두껍게**  
**_이텔릭 + 두껍게_**  
~~취소선~~  
<u>밑줄</u>

# 목록(List)

1. 순서가 필요한 목록
1. 순서가 필요한 목록
1. 순서가 필요한 목록
    1. 순서가 필요한 서브 목록 들여쓰기 4번 또는 tab
    1. 순서가 필요한 서브 목록
1. 순서가 필요한 목록


- 순서가 필요하지 않은 목록
- 순서가 필요하지 않은 목록
- 순서가 필요하지 않은 목록
    - 순서가 필요하지 않은 서브 목록
    - 순서가 필요하지 않은 서브 목록
- 순서가 필요하지 않은 목록

# 링크(Links)

[google](https://google.com)  
[naver](https://naver.com "네이버로 이동하기")  


# 이미지(Images)
- 이미지 불러오기</br>
![블로그 프로필](https://media.vlpt.us/images/yeppi/profile/681653b9-42a4-4082-b945-7a2ab3ad64bc/%EB%B8%94%EB%A1%9C%EA%B7%B8%ED%94%84%EB%A1%9C%ED%95%84_%EB%B9%85%EC%8A%A4%EB%B9%84AR%EC%82%AC%EC%A7%84.png?w=240)  
</br>
- 이미지에 링크 바로 연결</br>
[![블로그 프로필과 링크](https://media.vlpt.us/images/yeppi/profile/681653b9-42a4-4082-b945-7a2ab3ad64bc/%EB%B8%94%EB%A1%9C%EA%B7%B8%ED%94%84%EB%A1%9C%ED%95%84_%EB%B9%85%EC%8A%A4%EB%B9%84AR%EC%82%AC%EC%A7%84.png?w=240)](https://media.vlpt.us/images/yeppi/profile/681653b9-42a4-4082-b945-7a2ab3ad64bc/%EB%B8%94%EB%A1%9C%EA%B7%B8%ED%94%84%EB%A1%9C%ED%95%84_%EB%B9%85%EC%8A%A4%EB%B9%84AR%EC%82%AC%EC%A7%84.png?w=240)

# 인용문(BlockQuote)

> 남의 말이나 글에서 직접 또는 간접으로 따온 문장  
> 네이버 국어 사전
>> 중첩된 인용문
>>> 중첩된 인용문

# 인라인(inline) 코드 강조

css에서 `background` 혹은 `background-image` 속성으로  
요소에 배경 이미지 삽입  
해당 `코드 드래그`한 후 백틱기호 누르면 한번에 적용

# 블록(Block) 코드 강조
```html
<a href=(https://google.com>
```

```bash
$ git commit -m 'Study Markdown'
```

```plaintext
동해물과 백두산임 마르고 닳도록  
하느님이 보우하사 우리나라 만세  
```

# 표(Table)

posistion 속성
값 | 의미 | 기본값
--|:--:|--:
기본 왼쪽 정렬 | 가운데 정렬 | 오른쪽 정렬
static | 기준 없음 | 0
relative | 요소 자신 | X
absolute | 위치 상 부모 요소 | X
fixed | 뷰포트 | X

# 원시 HTML(Raw HTML)

동해물과 <u>백두산임</u> 마르고 닳도록<br/>
하느님이 보우하사 우리나라 만세<br/>  

```plaintext
동해물과 <u>백두산임</u> 마르고 닳도록<br/>
하느님이 보우하사 우리나라 만세<br/>
```


# 수평선(Horizontal Rule)

- `--- 방식`
--- 
- `*** 방식`
***
- `___ (언더바) 방식`
___