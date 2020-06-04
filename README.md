# TodoListApp
Term project TodoList with LBS using AndroidStudio 

위치기반서비스를 추가시킨 TodoList입니다.
할 일을 정리해도 막상 나가서 바쁘게 생활하다보면 볼 일을 까먹고 지나치곤 합니다.
이 어플은 할 일을 추가할때 위치정보도 추가하여 그 위치 근방을 지나가면 할 일을 팝업으로 알려줍니다.

#200602 위치기반앱프로그래밍 전공 사이드프로젝트

Term project TodoList with LBS using AndroidStudio 

06/04 현재 fragment2 할 일 추가 layout 완성

앞으로
1) fragment2에서 locationProvider를 통해 장소를 입력하면 lat,lon으로 바꾸기
그 후에 정하기 
1-1. 받은 lat,lon과 현재 lat,lon을 비교해서 일정 range안에 있을시 시스템상 alarm
1-2. GoogleMap API를 통해 지도상에 받은 lat,lon을 표시하고 현재 내 위치도 표시하여 시각화
(지도를 보며 할 일을 기억할수도 / 또는 단순 길찾기 효과도 누릴 수 있다.)
구현 : fragment를 추가할지, 단순 intent를 통해 지도를 나타낼지

2) fragment3에서 시스템상 alarm을 리스트로 저장해둔다.
(못 보고 지나친 알람을 보고 기억을 할 수 있다.)
2-1. 구현방법 찾아보기.

3) 기능 구현 완성시 UI 꾸미기
