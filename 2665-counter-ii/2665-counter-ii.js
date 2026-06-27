/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let pres = init;
     function increment(){
        return ++pres;
     }
     function reset(){
        return (pres = init);
     }     
     function decrement(){
        return --pres;

        
     }
     return { increment, decrement, reset};


};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */