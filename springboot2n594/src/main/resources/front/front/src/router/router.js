import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jiaoshiList from '../pages/jiaoshi/list'
import jiaoshiDetail from '../pages/jiaoshi/detail'
import jiaoshiAdd from '../pages/jiaoshi/add'
import banjikebiaoList from '../pages/banjikebiao/list'
import banjikebiaoDetail from '../pages/banjikebiao/detail'
import banjikebiaoAdd from '../pages/banjikebiao/add'
import jiaoshixinxiList from '../pages/jiaoshixinxi/list'
import jiaoshixinxiDetail from '../pages/jiaoshixinxi/detail'
import jiaoshixinxiAdd from '../pages/jiaoshixinxi/add'
import kechengxinxiList from '../pages/kechengxinxi/list'
import kechengxinxiDetail from '../pages/kechengxinxi/detail'
import kechengxinxiAdd from '../pages/kechengxinxi/add'
import diaokeshenqingList from '../pages/diaokeshenqing/list'
import diaokeshenqingDetail from '../pages/diaokeshenqing/detail'
import diaokeshenqingAdd from '../pages/diaokeshenqing/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jiaoshi',
					component: jiaoshiList
				},
				{
					path: 'jiaoshiDetail',
					component: jiaoshiDetail
				},
				{
					path: 'jiaoshiAdd',
					component: jiaoshiAdd
				},
				{
					path: 'banjikebiao',
					component: banjikebiaoList
				},
				{
					path: 'banjikebiaoDetail',
					component: banjikebiaoDetail
				},
				{
					path: 'banjikebiaoAdd',
					component: banjikebiaoAdd
				},
				{
					path: 'jiaoshixinxi',
					component: jiaoshixinxiList
				},
				{
					path: 'jiaoshixinxiDetail',
					component: jiaoshixinxiDetail
				},
				{
					path: 'jiaoshixinxiAdd',
					component: jiaoshixinxiAdd
				},
				{
					path: 'kechengxinxi',
					component: kechengxinxiList
				},
				{
					path: 'kechengxinxiDetail',
					component: kechengxinxiDetail
				},
				{
					path: 'kechengxinxiAdd',
					component: kechengxinxiAdd
				},
				{
					path: 'diaokeshenqing',
					component: diaokeshenqingList
				},
				{
					path: 'diaokeshenqingDetail',
					component: diaokeshenqingDetail
				},
				{
					path: 'diaokeshenqingAdd',
					component: diaokeshenqingAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
