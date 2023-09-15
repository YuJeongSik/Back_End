function user(){
    let userId=document.getElementById('user').value;
    let size=userId.length;
    let mid=''
    if(size<5){
        mid='5글자보다 아이디는 더 커야합니다'
    }
    else{
        mid='사용가능합니다'
    }
    result.innerHTML=mid; //innerHTML은 <body>에 출력시켜주는 명령어!
}
function check(){
    let pw1Value=document.getElementById('pw1').value;
    let pw2Value=document.getElementById('pw2').value;

    let mid='';
    if(pw1Value==pw2Value){
        mid='일치';
    }
    else{
        mid='불일치';
    }
    result.innerHTML=mid;
}