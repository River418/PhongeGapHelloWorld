// JavaScript Document
var HelloWorldPlugin = {
   createEvent:function(name,successCallback,errorCallback){//name，成功回调，失败回调
	   cordova.exec(successCallback,//成功回调方法
	   errorCallback,//失败回调防范
	   'HelloWorldPlugin',//Java端的插件名称
	   'hello',//Action名称
	   [name]);//传递给java端的参数
	}
}