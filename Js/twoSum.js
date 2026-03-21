

let result = checkTwoSum([3,2,4], 6);
console.log(" Result ",result)

function checkTwoSum(arr, target) {
    for(let i = 0; i< arr.length; i++) {
    console.log(" 1 ")
        for(let j = i+1; j <arr.length; j++) {
            console.log("arr[i],arr[j] ",arr[i],arr[j])
            if(arr[i] +arr[j] == target) {
                return [arr[i], arr[j]]
            }

        }

    }
    return [-1,-1]
}