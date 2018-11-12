console.log('this is a module');

const testvar = 100;

function test(){
    console.log(testvar);
}

module.exports.testvar = testvar;
module.exports.fntest = test;