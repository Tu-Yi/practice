import img from './1.jpg'  // 引用图片  需要url-loader,file-loader


var app = {
    template:`
    <div>
        <img :src='imgSrc' />>
    </div>
    `,
    data(){
        return {
            imgSrc:img
        }
    }
}

export var num1= 1;

export var num2=2;

export default app