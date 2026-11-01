function solution(a, b) {
    let answer1 = Number(String(a) + String(b));
    let answer2 = Number(String(b) + String(a));
    if(answer1 > answer2){
        return answer1;
    }else{
        return answer2;
    }

}