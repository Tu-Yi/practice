// {
//     const arr = 10;
//     let brr = 10;
//     var crr = 10;
//     console.log(arr);
//     console.log(brr);
// }
// console.log(crr);

// {
//     let a,b,rest;
//     [a,b]=[1,2];
//     [a,b,...rest]=[1,2,3,4,5,6]
//     console.log(a,b,rest);
// }

// {
//     let a,b,c,rest;
//     ({a,b}={a:1,b:2});
//     console.log(a,b);
// }


// {
//     let a,b,c,rest;
//     [a,b,c=3] = [1,2];
//     console.log(a,b,c);
// }

// {
//     let a=1,b=2,c,rest;
//     [a,b]=[b,a];
//     console.log(a,b);
// }

// {
//     let metaData={
//         title:'abc',
//         test:[
//             {
//                 title:'test',
//                 des:'test of my'
//             }
//         ]
//     }

//     let {title:cntitle,test:[{title:testTitle}]} = metaData;
//     console.log(cntitle,testTitle);
// }

// {
//     let a;
//     ({a} = {a:1,b:2});
//     console.log(a);
// }

// {
//     function f([a,b]){
//         return a+1;
//     }
//     console.log(f([3,2]));
// }

// {
//     var name='yuankun';
//     console.log(`my name is ${name}`);
// }


// {
//     let str='string';
//     console.log(str.includes('r'));
//     console.log(str.startsWith('st'));
//     console.log(str.endsWith('ing'));
// }

// {
//     let str='abc';
//     console.log(str.repeat(2));
// }

// {
//     console.log('1'.padStart(2,'0'));
//     console.log('1'.padEnd(2,'0'));
// }


// {
//     let arr = Array.of(1,2,3,4,5,6);
//     console.log(arr);
// }

// {
//     let arr ='abcdefg';
//     let brr = Array.from(arr);
//     brr.forEach(
//         function(item){
//             console.log(item);
//         }
//     )
// }

// {
//     ((x,y='world') =>{
//         console.log(x,y);
//     })('hello');

// }

// {
//     function test3(...arg){
//         for(let v of arg){
//             console.log(v);
//         }
//     }
//     test3(1,2,3,4,5,6,'a');
// }

// {
//     let arrow = v => v*2;
//     console.log(arrow(3));
// }


// {
//     let o=1,k=2;
//     let es5={
//         o:o,
//         k:k
//     };
//     let es6={
//         o,
//         k
//     };
//     console.log(es5,es6);

//     let es6_method={
//         hello(){
//             console.log('hello');
//         }
//     }
//     es6_method.hello();
// }

// {
//     let a='b';
//     let es6={
//         [a]:'b'
//     }
//     console.log(es6);
// }

// {
//     console.log(Object.is('123','123'));

//     console.log(Object.assign({a:'a'},{b:'b'}));
// }


// {
//     let a1= Symbol();
//     let a2 = Symbol();
//     console.log(a1===a2);
// }

// {
//     let list = new Set();
//     list.add(5);
//     list.add(7);
//     let arr = [1,2,3,4,5];
//     console.log(new Set(arr),list);
// }

// {
//     let map = new Map();
//     let arr = [123];
//     map.set(arr,456);
//     console.log(map,map.get(arr));
// }

// {
//     class Parent{
//         constructor(name='imooc'){
//             this.name=name;
//         }
//     }
//     let v_parent = new Parent('v');
//     console.log(v_parent);
// }

// {
//     class Parent{
//         constructor(name='imooc'){
//             this.name=name;
//         }
//     }
//     class child extends Parent{
//         constructor(name='child'){
//             super(name);
//             this.type = 'child';
//         }
//     }
//     console.log(new child('hello'));
// }

// {
//     class Parent{
//         constructor(name='imooc'){
//             this.name=name;
//         }
//         get longname(){
//             return 'mk' + this.name;
//         }
//         set longname(value){
//             this.name=value;
//         }
//     }
//     let arr = new Parent();
//     arr.longname='hello';
//     console.log(arr.longname);
// }

// {
//     class Parent{
//         constructor(name='imooc'){
//             this.name=name;
//         }
//         static tell(){
//             console.log(123);
//         }
//     }
//     Parent.tell();
// }

// {
//     class Parent{
//         constructor(name='imooc'){
//             this.name=name;
//         }
//         static tell(){
//             console.log(123);
//         }

//     }
//     Parent.type='test';
//     console.log(Parent.type);
// }

export let a=123;

export function f(){
    console.log(123);
}

export class hello{
    test(){
        console.log('class');
    }
}