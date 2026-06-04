setTimeout(() =>{
    console.log(" timeout -1 ");
    Promise.resolve().then(()=> {
        console.log(" Promise inside the timeout");

    })
    process.nextTick(()=> {
        console.log("NextTick")
    })
})


