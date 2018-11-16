import img from  './w15.png';

var app={
    template:`
        <div>
            hello module!
            <img :src="imgSrc" />
        </div>
    `,
    data:function(){
        return {
            imgSrc:img
        }
    }
}

export var num1 = 1;
export var num2 = 2;

export default app;