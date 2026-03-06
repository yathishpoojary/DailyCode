
function isPalindrome(value) {
    let val = value.split("").reverse().join("");
    return val ==value;
return false;
}

console.log(" India ",isPalindrome("india"));
console.log(" ABcBA ", isPalindrome("ABcBA"));