/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let n = x
    let rev = 0

    if(x < 0){
        return false
    }

    if(x == 0){
        return true
    }
    while(x !== 0){
        digit = x % 10
        rev = (10 * rev) + digit
        x = parseInt(x /10)
    }

    if( n == rev){
        return true
    }else{
        return false
    }
};