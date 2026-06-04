let count = 1;

function nextIteration() {

    if(count < 5 ) {
      setImmediate(nextIteration)
    } else {
        console.log(" Done Inside")
    }
    count ++;
}

nextIteration();