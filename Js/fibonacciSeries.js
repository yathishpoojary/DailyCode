let count = 5;

function fibonacciSeries(count) {
    let a = 0, b = 1, c;
    console.log(a);
    console.log(b);
    for (let i = 2; i < count; i++) {
        c = a + b;
        console.log(c);
        a = b;
        b = c;
    }
}

fibonacciSeries(count);