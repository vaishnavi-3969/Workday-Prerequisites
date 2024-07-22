// Exercise: Array Methods
// Your task is to add the missing logic to a transformToObjects() function that should transform a list of numbers into a list of JavaScript objects.

// In the newly returned array, every object must have a val key and the input array's number as a value.

// For example, for the provided input [1, 2, 3] the transformToObjects([1, 2, 3]) function should return [{val: 1}, {val: 2}, {val: 3}].


function transformToObjects(numberArray) {
    //TODO: Add your logic
    // should return an array of objects
    return numberArray.map((item) => {
        return {val: item}
    })
}

const arr = [1,2,3,4,5]
console.log(transformToObjects(arr))


// Output
// D:\github_folder\Workday-Prerequisites\React JS\section2_js refersher\coding_ex2_array methods>node array.js
// [ { val: 1 }, { val: 2 }, { val: 3 }, { val: 4 }, { val: 5 } ]
