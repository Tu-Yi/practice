import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home/Home'
import Member from '@/components/Member/Member'
import Search from '@/components/Search/Search'
import ShopCart from '@/components/ShopCart/ShopCart'
import NewsList from '@/components/News/NewsList'
import NewsDetail from '@/components/News/NewsDetail'
import PhotoList from '@/components/Photo/PhotoList'
import PhotoDetail from '@/components/Photo/PhotoDetail'
import GoodsList from '@/components/Goods/GoodsList'
import GoodsDetail from '@/components/Goods/GoodsDetail'

// const Home = () => import('@/components/Home/Home')
// const Member = () => import('@/components/Member/Member')
// const Search = () => import('@/components/Search/Search')
// const ShopCart = () => import('@/components/ShopCart/ShopCart')
// const NewsList = () => import('@/components/News/NewsList')
// const NewsDetail = () => import('@/components/News/NewsDetail')
// const PhotoList = () => import('@/components/Photo/PhotoList')
// const PhotoDetail = () => import('@/components/Photo/PhotoDetail')
// const GoodsList = () => import('@/components/Goods/GoodsList')
// const GoodsDetail = () => import('@/components/Goods/GoodsDetail')

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: {
        name: 'home'
      }
    },
    {
      path: '/home',
      name: 'home',
      component: Home
    },
    {
      path: '/member',
      name: 'member',
      component: Member
    },
    {
      path: '/search',
      name: 'search',
      component: Search
    },
    {
      path: '/shopcart',
      name: 'shopcart',
      component: ShopCart
    },
    {
      path: '/news/list',
      name: 'news.list',
      component: NewsList
    },
    {
      path: '/news/detail',
      name: 'news.detail',
      component: NewsDetail
    },
    {
      path: '/photo/list/:categoryId',
      name: 'photo.list',
      component: PhotoList
    },
    {
      path: '/photo/detail/:photoId',
      name: 'photo.detail',
      component: PhotoDetail
    },
    {
      path: '/goods/list',
      name: 'goods.list',
      component: GoodsList
    },
    {
      path: '/goods/detail/:id',
      name: 'goods.detail',
      component: GoodsDetail
    },
    {
      path: '/goods/detail/info',
      name: 'goods.detail.info',
      component: NewsDetail
    }
  ]
})
