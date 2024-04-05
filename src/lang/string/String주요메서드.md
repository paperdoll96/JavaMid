# String 클래스의 주요 메서드 요약

Java의 `String` 클래스는 문자열을 다루기 위한 다양한 메서드를 제공합니다. 아래는 자주 사용되는 메서드들의 요약입니다.

## 문자열 정보 조회

- `length()`: 문자열의 길이를 반환합니다.
- `isEmpty()`: 문자열이 비어 있는지 확인합니다. (길이가 0)
- `isBlank()`: 문자열이 공백(Whitespace)만 있는지 확인합니다. (Java 11)
- `charAt(int index)`: 지정된 인덱스에 있는 문자를 반환합니다.

## 문자열 비교

- `equals(Object anObject)`: 두 문자열이 동일한지 비교합니다.
- `equalsIgnoreCase(String anotherString)`: 두 문자열을 대소문자 구분 없이 비교합니다.
- `compareTo(String anotherString)`: 두 문자열을 사전 순으로 비교합니다.
- `compareToIgnoreCase(String str)`: 두 문자열을 대소문자 구분 없이 사전적으로 비교합니다.
- `startsWith(String prefix)`: 문자열이 특정 접두사로 시작하는지 확인합니다.
- `endsWith(String suffix)`: 문자열이 특정 접미사로 끝나는지 확인합니다.

## 문자열 검색

- `contains(CharSequence s)`: 문자열이 특정 문자열을 포함하고 있는지 확인합니다.
- `indexOf(String ch) / indexOf(String ch, int fromIndex)`: 문자열에서 처음 등장하는 위치를 반환합니다.
- `lastIndexOf(String ch)`: 문자열에서 마지막으로 등장하는 위치를 반환합니다.

## 문자열 조작 및 변환

- `substring(int beginIndex) / substring(int beginIndex, int endIndex)`: 문자열의 부분 문자열을 반환합니다.
- `concat(String str)`: 문자열의 끝에 다른 문자열을 붙입니다.
- `replace(CharSequence target, CharSequence replacement)`: 특정 문자열을 새 문자열로 대체합니다.
- `replaceAll(String regex, String replacement)`: 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체합니다.
- `replaceFirst(String regex, String replacement)`: 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체합니다.
- `toLowerCase() / toUpperCase()`: 문자열을 소문자나 대문자로 변환합니다.
- `trim()`: 문자열 양쪽 끝의 공백을 제거합니다.
- `strip()`: Whitespace와 유니코드 공백을 포함해서 제거합니다. (Java 11)

## 문자열 분할 및 조합

- `split(String regex)`: 문자열을 정규 표현식을 기준으로 분할합니다.
- `join(CharSequence delimiter, CharSequence... elements)`: 주어진 구분자로 여러 문자열을 결합합니다.

## 기타 유틸리티

- `valueOf(Object obj)`: 다양한 타입을 문자열로 변환합니다.
- `toCharArray()`: 문자열을 문자 배열로 변환합니다.
- `format(String format, Object... args)`: 형식 문자열과 인자를 사용하여 새로운 문자열을 생성합니다.
- `matches(String regex)`: 문자열이 주어진 정규 표현식과 일치하는지 확인합니다.
