layui.config({
    base: '/static/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'table'], function () {
    var admin = layui.admin
        , table = layui.table;

    table.render({
        elem: '#test-table-page'
        , url: layui.setter.base + 'json/table/user.js'
        , cols: [[
            {field: 'id', width: 80, title: 'ID', sort: true}
            , {field: 'username', width: 80, title: '用户名'}
            , {field: 'sex', width: 80, title: '性别', sort: true}
            , {field: 'city', width: 80, title: '城市'}
            , {field: 'sign', title: '签名', minWidth: 150}
            , {field: 'experience', width: 80, title: '积分', sort: true}
            , {field: 'score', width: 80, title: '评分', sort: true}
            , {field: 'classify', width: 80, title: '职业'}
            , {field: 'wealth', width: 135, title: '财富', sort: true}
        ]]
        , page: true
    });

});