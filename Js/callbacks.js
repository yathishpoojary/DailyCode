function fetchData(callback) {
    setTimeout(()=> {
        callback("Data received")
    },10000)
}

fetchData((result)=> {
    console.log(" Result received ",result)
});