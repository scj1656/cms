Ext.define('CMS.view.Accordion',{  
    extend:'Ext.panel.Panel',  
    title:'系统设置',  
    alias:'widget.accordion',  
    //是否可以折叠  
    collapsible: true,  
    //是否可以通过拖动改变宽度  
    split:true,  
    width:200,  
    //布局方式  
    layout:'accordion',  
    region:'west',  
    layoutConfig: {            
        titleCollapse: true,    //设置为点击整个标题栏都可以收缩       
        animate: true,  //开启默认动画效果           
        activeOnTop: true   //展开的面板总是在最顶层          
    },  
    items:[  
        {    
            title:'首页设置',  
            html:'设置首页'  
              
        },{    
            title:'导航栏设置',    
            html:'导航栏'    
        },{    
            title:'文章设置',    
            html:'文章设置'    
        },{  
            title:'留言设置',  
            html:'留言'  
        }  
    ]  
}); 