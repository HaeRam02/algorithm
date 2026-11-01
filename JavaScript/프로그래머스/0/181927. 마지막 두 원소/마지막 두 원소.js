function solution(num_list) {
    let val1 = num_list.pop();
    let val2 = num_list.pop();
    if(val1 > val2) {
        num_list.push(val2);
        num_list.push(val1);
        num_list.push(val1 - val2);
    }else {
        num_list.push(val2);
        num_list.push(val1);
        num_list.push(val1 * 2);
    }
    
    return num_list;
}