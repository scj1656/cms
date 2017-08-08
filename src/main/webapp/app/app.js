Ext.Loader.setConfig({enabled:true});
Ext.application({
	name:'CMS',
	appFolder:'app',
	controllers:[
	             'Controller'
	             ],
	launch:function(){
		Ext.create('Ext.container.Viewport',{
			layout:'border',
			items:[{xtype:'top'},//这里可以写对应view的alias的属性
			       {xtype:'accordion'},
			       {xtype:'center'},
			       {xtype:'bottom'}]
		});
	}             
	
});