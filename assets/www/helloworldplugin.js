// JavaScript Document
var HelloWorldPlugin = {
   createEvent:function(name,successCallback,errorCallback){
	   cordova.exec(successCallback,
	   errorCallback,
	   'HelloWorldPlugin',
	   'hello',
	   [name]);
   }
   }