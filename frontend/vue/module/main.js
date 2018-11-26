import Vue from './vue.js';
import App from './App.js'
import {num1,num2}  from './App';
import *  as obj from './App';
import cal from './Cal'

console.log(obj.num1,obj.num2);
console.log(cal);
console.log('abc');

import   './main.css';


new Vue(
    {
        el:'#app',
        components:{
            'app':obj.default
        },
        template:`<app/>`
    }
);