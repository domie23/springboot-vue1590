<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>首页</title>
		<link rel="stylesheet" href="../../layui/css/layui.css">
		<!-- 样式 -->
		<link rel="stylesheet" href="../../css/style.css" />
		<!-- 主题（主要颜色设置） -->
		<link rel="stylesheet" href="../../css/theme.css" />
		<!-- 通用的css -->
		<link rel="stylesheet" href="../../css/common.css" />
	</head>
	<body>

		<div id="app">

			<div class="data-detail">
				<div class="data-detail-breadcrumb">
					<span class="layui-breadcrumb">
						<a href="../home/home.jsp">首页</a>
						<a><cite>{{title}}</cite></a>
					</span>
					
					                    <a @click="storeUp()" href="javascript:void(0)">
						<i class="layui-icon" style="font-size: 20px;color: red;">&#xe67a;</i>点我收藏
					</a>
                    					
				</div>
				<div class="layui-row">
					<div class="layui-col-md5">
						<div class="layui-carousel" id="swiper">
							<div carousel-item id="swiper-item">
								<div v-for="(item,index) in swiperList" v-bind:key="index">
									<img class="swiper-item" :src="item.img">
								</div>
							</div>
						</div>
						
                                                
					</div>
					<div class="layui-col-md7" style="padding-left: 20px;">
						<h1 class="title">{{title}}</h1>
						
												
						<div v-if="detail.price" class="detail-item">
							<span>价格：</span>
							<span class="price">
								{{detail.price}}RMB
							</span>
						</div>
						<div v-if="detail.jifen" class="detail-item">
							<span>积分：</span>
							<span class="price">
								{{detail.jifen}}
							</span>
						</div>
						<div v-if="detail.onelimittimes" class="detail-item">
							<span>单次购买：</span>
							<span class="desc">
								{{detail.onelimittimes}}
							</span>
						</div>
						<div v-if="detail.alllimittimes" class="detail-item">
							<span>库存：</span>
							<span class="desc">
								{{detail.alllimittimes}}
							</span>
						</div>
						
						

						
																		<div class="detail-item">
							<span>产品编号：</span>
							<span class="desc">
								{{detail.chanpinbianhao}}
							</span>
						</div>
																																										<div class="detail-item">
							<span>农产品分类：</span>
							<span class="desc">
								{{detail.nongchanpinfenlei}}
							</span>
						</div>
																								<div class="detail-item">
							<span>供应商：</span>
							<span class="desc">
								{{detail.gongyingshang}}
							</span>
						</div>
																								<div class="detail-item">
							<span>来自地区：</span>
							<span class="desc">
								{{detail.laizidiqu}}
							</span>
						</div>
																																																																								
						
						
																																																																																																												

						<div class="detail-item">
							
														<div class="num-picker">
								<button type="button" @click="buynumber>0?buynumber--:buynumber" class="layui-btn layui-btn-primary">-</button>
								<input type="number" v-model="buynumber" id="buynumber" name="buynumber" class="layui-input" disabled="disabled"></input>
								<button type="button" @click="buynumber++" class="layui-btn layui-btn-primary">+</button>
							</div>
							<button @click="addCartTap" type="button" class="layui-btn layui-btn-warm">
								添加到购物车
							</button>
							
														<button @click="buyTap" type="button" class="layui-btn btn-submit">
								立即购买
							</button>
							
							
						</div>
						
						<div class="detail-item" style="text-align: right;">
							
							
							
														

						</div>
					</div>
				</div>
				
				
																																																																								
				
				<div class="layui-row">
					<div class="layui-tab layui-tab-card">
						
						<ul class="layui-tab-title">
							
																																																																																																									<li class="layui-this">产品介绍</li>
																																																								
							
							
														<li>评价</li>
														
							
							
														

						</ul>
						
						<div class="layui-tab-content">
							
																																																																																																									<div class="layui-tab-item layui-show">
								<div v-html="detail.chanpinjieshao"></div>
							</div>
																																																								
							
							
														<div class="layui-tab-item">
								<div class="message-container">
									<form class="layui-form message-form" style="padding-right: 20px;border-bottom: 0;">
										<div class="layui-form-item layui-form-text">
											<label class="layui-form-label">评价</label>
											<div class="layui-input-block">
												<textarea name="content" required lay-verify="required" placeholder="请输入内容" class="layui-textarea"></textarea>
											</div>
										</div>
										<div class="layui-form-item">
											<div class="layui-input-block">
												<button class="layui-btn btn-submit" lay-submit lay-filter="*">立即提交</button>
												<button type="reset" class="layui-btn layui-btn-primary">重置</button>
											</div>
										</div>
									</form>
									<div class="message-list">
										<div class="message-item" v-for="(item,index) in dataList" v-bind:key="index">
											<div class="username-container">
												<img class="avator" src="../../img/avator.png">
												<span class="username">用户：{{item.userid}}</span>
											</div>
											<div class="content">
												<span class="message">
													{{item.content}}
												</span>
											</div>
										</div>
									</div>
									<div class="pager" id="pager"></div>
								</div>
							</div>
														
							
							
														
							
						</div>
					</div>
				</div>
			</div>

		</div>


		<script src="../../layui/layui.js"></script>
		<script src="../../js/vue.js"></script>
		<!-- 组件配置信息 -->
		<script src="../../js/config.js"></script>
		<!-- 扩展插件配置信息 -->
		<script src="../../modules/config.js"></script>
		<!-- 工具方法 -->
		<script src="../../js/utils.js"></script>

		<script>
			var vue = new Vue({
				el: '#app',
				data: {
					// 轮播图
					swiperList: [],
					// 数据详情
					detail: {
						id: 0
					},
					// 商品标题
					title: '',
					// 倒计时
					count: 0,
					// 加入购物车数量
					buynumber: 1,
					// 当前详情页表
					detailTable: 'nongchanpin',
					// 评价列表
					dataList: [],
					// 选座座位列表
					numberList: []
				},
				// 倒计时效果
				computed: {
					SecondToDate: function() {
						var time = this.count;
						if (null != time && "" != time) {
							if (time > 60 && time < 60 * 60) {
								time =
									parseInt(time / 60.0) +
									"分钟" +
									parseInt((parseFloat(time / 60.0) - parseInt(time / 60.0)) * 60) +
									"秒";
							} else if (time >= 60 * 60 && time < 60 * 60 * 24) {
								time =
									parseInt(time / 3600.0) +
									"小时" +
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) +
									"分钟" +
									parseInt(
										(parseFloat(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											) -
											parseInt(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											)) *
										60
									) +
									"秒";
							} else if (time >= 60 * 60 * 24) {
								time =
									parseInt(time / 3600.0 / 24) +
									"天" +
									parseInt(
										(parseFloat(time / 3600.0 / 24) - parseInt(time / 3600.0 / 24)) *
										24
									) +
									"小时" +
									parseInt(
										(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
									) +
									"分钟" +
									parseInt(
										(parseFloat(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											) -
											parseInt(
												(parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60
											)) *
										60
									) +
									"秒";
							} else {
								time = parseInt(time) + "秒";
							}
						}
						return time;
					}
				},
				//  清除定时器
				destroyed: function() {
					window.clearInterval(this.inter);
				},
				methods: {
					jump(url) {
						jump(url)
					},
					isAuth(tablename, button) {
						return isFrontAuth(tablename, button)
					},
					// 倒计时初始化
					countDown() {
						let reversetime = new Date(this.detail.reversetime).getTime()
						let now = new Date().getTime();
						let count = reversetime - now;
						if (count > 0) {
							this.count = count / 1000
							var _this = this;
							this.inter = window.setInterval(function() {
								_this.count = _this.count - 1;
								if (_this.count < 0) {
									window.clearInterval(_this.inter);
									layer.msg("活动已结束", {
										time: 2000,
										icon: 5
									})
								}
							}, 1000);
						}
					},
					
                    					// 下载文件
					downFile(url) {
						var download = $("#download");
						download.append(
							"<a id=\"down\" href=\"aaaa.txt\" target=\"_blank\" download=\"aaaa.txt\" style=\"display:none\">下载该文件</a>");
						console.log(download);
						$("#down")[0].click();
					},
					// 跨表
					onAcrossTap(acrossTable){
						localStorage.setItem('crossTable',`nongchanpin`);
						localStorage.setItem('crossObj', JSON.stringify(this.detail));
						jump(`../${acrossTable}/add.jsp?corss=true`);
					},
					
										// 添加到购物车
					addCartTap() {
						// 活动倒计时限制
												// 单次购买限制
						if (this.detail.onelimittimes && this.detail.onelimittimes > 0 && this.detail.onelimittimes < this.buynumber) {
							layer.msg(`每人单次只能购买${this.detail.onelimittimes}次`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 库存限制
						if (this.detail.alllimittimes && this.detail.alllimittimes > 0 && this.detail.alllimittimes < this.buynumber) {
							layer.msg(`商品已售罄`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 查询是否已经添加到购物车
						layui.http.request('cart/list', 'get', {
							userid: localStorage.getItem('userid'),
							tablename: `${this.detailTable}`,
							goodid: this.detail.id
						}, (res) => {
							if (res.data.list.length > 0) {
								layer.msg("该商品已经添加到购物车", {
									time: 2000,
									icon: 5
								});
								return
							}
							layui.http.requestJson('cart/save', 'post', {
								tablename: `${this.detailTable}`,
								goodid: this.detail.id,
								goodname: this.title,
								picture: this.swiperList[0],
								buynumber: this.buynumber,
								userid: localStorage.getItem('userid'),
								price: this.detail.price,
								discountprice: this.detail.vipprice ? this.detail.vipprice : 0
							}, (res) => {
								layer.msg("添加到购物车成功", {
									time: 2000,
									icon: 6
								});
							});
						})
					},
					
										// 立即购买
					buyTap() {
						// 活动倒计时限制
												// 单次购买限制
						if (this.detail.onelimittimes && this.detail.onelimittimes > 0 && this.detail.onelimittimes < this.buynumber) {
							layer.msg(`每人单次只能购买${this.detail.onelimittimes}次`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 库存限制
						if (this.detail.alllimittimes && this.detail.alllimittimes > 0 && this.detail.alllimittimes < this.buynumber) {
							layer.msg(`商品已售罄`, {
								time: 2000,
								icon: 5
							});
							return
						}
						// 保存到storage中，在确认下单页面中获取要购买的商品
						localStorage.setItem('orderGoods', JSON.stringify([{
							tablename: `${this.detailTable}`,
							goodid: this.detail.id,
							goodname: this.title,
							picture: this.swiperList[0],
							buynumber: this.buynumber,
							userid: localStorage.getItem('userid'),
							price: this.detail.price,
							discountprice: this.detail.vipprice ? this.detail.vipprice : 0
						}]));
						// 跳转到确认下单页面
						jump('../order/confirm.jsp');
					},
										
					
					                    // 收藏商品
					storeUp() {
						layui.http.requestJson('storeup/save', 'post', {
							userid: localStorage.getItem('userid'),
							name: this.title,
							picture: this.swiperList[0],
							refid: this.detail.id,
							tablename: this.detailTable
						}, function(res) {
							layer.msg(`收藏成功`, {
								time: 2000,
								icon: 6
							});
						});
					},
                    					
					
				}
			})

			layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery', 'laypage'], function() {
				var layer = layui.layer;
				var element = layui.element;
				var form = layui.form;
				var carousel = layui.carousel;
				var http = layui.http;
				var jquery = layui.jquery;
				var laypage = layui.laypage;

				var limit = 10;

				// 数据ID
				var id = http.getParam('id');
				vue.detail.id = id;

				// 商品信息
				http.request(`${vue.detailTable}/detail/` + id, 'get', {}, function(res) {
					// 详情信息
					vue.detail = res.data
																									vue.title = vue.detail.chanpinmingcheng;
																																																												// 轮播图片
					vue.swiperList = vue.detail.chanpintupian ? vue.detail.chanpintupian.split(",") : [];
																									var swiperItemHtml = '';
					for (let item of vue.swiperList) {
						swiperItemHtml +=
							'<div>' +
							'<img class="swiper-item" src="' + item + '">' +
							'</div>';
					}
					jquery('#swiper-item').html(swiperItemHtml);
					// 轮播图
					carousel.render({
						elem: '#swiper',
						width: swiper.width,height:swiper.height,
						arrow: swiper.arrow,
						anim: swiper.anim,
						interval: swiper.interval,
						indicator: swiper.indicator
					});

										
					
				});

								// 获取评论
				http.request(`discuss${vue.detailTable}/list`, 'get', {
					page: 1,
					limit: limit,
					refid: vue.detail.id,
					userid: localStorage.getItem('userid')
				}, function(res) {
					vue.dataList = res.data.list
					// 分页
					laypage.render({
						elem: 'pager',
						count: res.data.total,
						limit: limit,
						jump: function(obj, first) {
							//首次不执行
							if (!first) {
								http.request(`discuss${vue.detailTable}/list`, 'get', {
									page: obj.curr,
									limit: obj.limit,
									userid: localStorage.getItem('userid')
								}, function(res) {
									vue.dataList = res.data.list
								})
							}
						}
					});
				})
				
				// 提交评论
				form.on('submit(*)', function(data) {
					data = data.field;
					data.userid = localStorage.getItem('userid')
					data.refid = vue.detail.id
					http.requestJson(`discuss${vue.detailTable}/save`, 'post', data, function(res) {
						layer.msg('评价成功', {
							time: 2000,
							icon: 6
						}, function() {
							window.location.reload();
						});
						return false
					});
					return false
				});
				
			});
		</script>
	</body>
</html>
