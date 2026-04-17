console.log(" Funcion starts");

setTimeout(()=> {
    console.log(" Macrotask is callling");
},1000);

Promise.resolve().then(()=> {
    console.log(" Microtask is callling")
})

console.log(" Funciton ends")