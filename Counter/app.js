//DOM 활용
// number id호출
const countNumber = document.getElementById('number');
// 호출확인
// console.log(countNumber);

// 버튼들을 class name으로 호출
let countButtons = document.getElementsByClassName('btn');
//호출확인
// console.log(countButtons);

//배열 타입으로 변환
countButtons= Array.from(countButtons);

const [increaseButton, resetButton,
decreaseButton] = countButtons;

// count설정
let count = 0;
// 색깔 설정
let countNumbercolor = '';

// forEach문 사용

countButtons.forEach((button) => {
    // 버튼 호출 확인
    // console.log(button);
    button.addEventListener('click', (event) => {
    
    // 이벤트 핸들러에 바인딩된 DOM객체
    const curTarget = event.currentTarget;
    // 버튼들을 구별하기 위해 classList사용
    const styles = curTarget.classList[1];

    // 삼항연산자 사용
    count = styles !== 'reset' ? (count = styles === 'decrease' ? --count : ++count) : 0;
    
    // count값이 0이면 grey, 양수면 green, 음수면 red
    countNumberColor = count !== 0 ? (countValueColor = count > 0 ? 'green' : 'red' ): 'grey';

    // 실제값 매핑
    countNumber.textContent = count;
    // 색상변경
    countNumber.style.color = countValueColor;


    




    });
});
