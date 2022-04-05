// 버튼 가져오기
const btn = document.getElementById('btn');
// 버튼이 잘 가져와졌는지 확인
// console.dir(btn);

// 버튼 가져오기2
const btn2 = document.getElementById('btn2');
// 버튼이 잘 가져와졌는지 확인
// console.dir(btn2);

// index.html에 있는 span클래스(클래스 이름 = 'color') 호출
const color = document.querySelector('.color');

// 버튼 클릭
btn.addEventListener('click', () => {
    // 클릭되었는지 확인
    // console.log('클릭확인');

    // getRandomNumber함수를 이용하여 색깔표현 숫자 범위인 0~255 에서 랜덤하게 숫자 호출
    // const randomArray = getRandomNumber(0,255);
    // const [r, g, b] = randomArray;

    // 위에 두문장을 하나로 합침
    const [r, g, b] = getRandomNumber(0, 255);

    // 템플릿 리터럴 (backtric)
    const rgbColor = `rgb(${r}, ${g}, ${b})`;
    // 실제 값 바인딩, 매핑
    color.textContent = rgbColor;
    // 색상변경
    color.style.color = rgbColor;

    // 배경색깔을 변경되는 btn 숫자와 똑같이 변경
    document.body.style.backgroundColor = rgbColor;
});

// 마우스 오버
btn2.addEventListener('mouseover', () => {
    // 마우스 오버 되었는지 확인
    // console.log('마우스 오버확인');
    
    const [r, g, b] = getRandomNumber(0, 255);

    // 템플릿 리터럴 (backtric)
    const rgbColor = `rgb(${r}, ${g}, ${b})`;
    // 실제 값 바인딩, 매핑
    color.textContent = rgbColor;
    // 색상변경
    color.style.color = rgbColor;

    // 배경색깔을 변경되는 btn 숫자와 똑같이 변경
    document.body.style.backgroundColor = rgbColor;
});


// 색깔을 표현하는 숫자를 랜덤으로 불러오기위한 함수
function getRandomNumber() {
    // rgb 랜덤값 추출을 위한 배열 생성
    let randomArray = [];

    // 숫자 세게를 랜덤으로 호출하여 배열에 저장
    for (let i = 0; i < 3; i++) {
        const randomNumber = Math.floor(Math.random() * (255 - 0 + 1)) + 0;
        randomArray.push(randomNumber);
    }
    return randomArray;
}