
let result = checkTwoSum([3,2,4], 6);
console.log(" Result ",result)

function checkTwoSum(arr, target) {

    let store = new Map();

    for( let i = 0 ; i < arr.length; i++) {

        let value = target - arr[i];

        if(store.has(value)) {
            return [store.get(value), i]
        }
        
        store.set(arr[i], i);

    }

}