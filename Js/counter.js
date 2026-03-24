function counter() {
    let count = 0;
    return {
        increment: () => {
            return count++;
        },
       decrement: () => {
            return count--;
        },
        getCount: () => count
    }
}


const c = counter();
console.log(c.getCount())
c.increment()
c.increment()
console.log(c.getCount())
c.decrement()
console.log(c.getCount())
