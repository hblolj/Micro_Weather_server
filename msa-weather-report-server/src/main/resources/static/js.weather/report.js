/**
 * report页面下拉框事件
 * auther:waylau.com
 */
$(function(){
	$("#selectCityId").change(function(){
		var cityId = $("#selectCityId").val();
        console.log("happend change the new city Id is " + cityId)
        var url = '/report-server/report/cityId/'+ cityId;
		window.location.href = url;
	})
});