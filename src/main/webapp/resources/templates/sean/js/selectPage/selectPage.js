var selectPage = (function () {
    var configMap = {
            titleHtml: selectPage.html.title,
            contentHtml: selectPage.html.content,
            dataSource: selectPage.html.dataSource,
            staffManagement: selectPage.html.staffManagement
        }, stateMap = {

        }, jqueryMap = {
            $container: null,
            $titleContainer: null,
            $contentContainer: null,
            $bottomContainer: null
        }, setJqueryMap, init, initTitle, initContent;

    setJqueryMap = function ($container) {
        jqueryMap.$container = $container;
        jqueryMap.$titleContainer = $container.find('.titleContainer');
        jqueryMap.$contentContainer = $container.find('.contentContainer');
        jqueryMap.$bottomContainer = $container.find('.bottomContainer');
    };

    initTitle = function () {
        jqueryMap.$titleContainer.append(configMap.titleHtml);
    };

    initContent = function () {
        jqueryMap.$contentContainer.append(configMap.contentHtml);
        jqueryMap.$contentContainer.append(configMap.dataSource);
        jqueryMap.$contentContainer.append(configMap.staffManagement);
    };

    //類型下拉式選單
    findAllEmpNoList = function () {
        var $select = jqueryMap.$contentContainer.find('.selectEmpNo');
        $select.html("");
        var data = {};
        var dataStr = JSON.stringify(data);
        var url = '';
        $.get(url, function (resultObj) {
            console.log(resultObj);
        });
    };

    findAllEmpNameList = function () {
        var $select = jqueryMap.$contentContainer.find('.selectEmpName');
        $select.html("");
        var data = {};
        var dataStr = JSON.stringify(data);
        var url = '';
        $.get(url, function (resultObj) {
            console.log(resultObj);
        });
    };

    init = function ($container) {
        setJqueryMap($container);
        initTitle();
        initContent();
    };
    return {
        init: init
    }
})();