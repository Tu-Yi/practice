import EventBus from './EventBus'
let obj = {}
obj.getGoodsList = function () {
  return JSON.parse(window.localStorage.getItem('goods') || '{}')
}
obj.saveGoods = function (goodsList) {
  window.localStorage.setItem('goods', JSON.stringify(goodsList))
  EventBus.$emit('addShopCart', obj.getTotalCount())
}
obj.add = function (goods) {
  let goodsList = this.getGoodsList()
  goodsList[goods.id] = goods.num
  this.saveGoods(goodsList)
}
obj.getTotalCount = function () {
  let goodsList = this.getGoodsList()
  let values = Object.values(goodsList)
  let sum = 0
  values.forEach(val => { sum += val })
  return sum
}
export default obj
