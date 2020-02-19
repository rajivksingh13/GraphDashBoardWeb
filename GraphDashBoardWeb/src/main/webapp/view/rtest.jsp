<!-- Styles -->
<style>
#chartdiv {
  width: 100%;
  height: 500px;
  top: 100px;
}
</style>

<!-- Resources -->
<script src="https://www.amcharts.com/lib/4/core.js"></script>
<script src="https://www.amcharts.com/lib/4/charts.js"></script>
<script src="https://www.amcharts.com/lib/4/themes/animated.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Chart code -->
<script>
var rtestJSONData = new Object();

am4core.ready(function() {

	
// Themes begin
am4core.useTheme(am4themes_animated);
// Themes end
var chartData = [];
$.getJSON("/rtestResultSummary", function(data) {
	rtestJSONData = data;
	$.each(rtestJSONData, function(i, item) {
		chartData.push(item);
		
	});	

var chart = am4core.create("chartdiv", am4charts.XYChart);
chart.hiddenState.properties.opacity = 0; // this creates initial fade-in

chart.data=chartData;

var categoryAxis = chart.xAxes.push(new am4charts.CategoryAxis());
categoryAxis.renderer.grid.template.location = 0;
categoryAxis.dataFields.category = 'siloName';
categoryAxis.title.text = "SILO";
categoryAxis.renderer.minGridDistance = 40;
categoryAxis.fontSize = 11;


var valueAxis = chart.yAxes.push(new am4charts.ValueAxis());
valueAxis.min = 0;
valueAxis.max = 100;
valueAxis.strictMinMax = true;
valueAxis.renderer.minGridDistance = 30;
valueAxis.title.text = "RTest Passed (%)";
valueAxis.fontSize = 20;
// axis break
var axisBreak = valueAxis.axisBreaks.create();
axisBreak.startValue = 2100;
axisBreak.endValue = 22900;
//axisBreak.breakSize = 0.005;

// fixed axis break
var d = (axisBreak.endValue - axisBreak.startValue) / (valueAxis.max - valueAxis.min);
axisBreak.breakSize = 0.05 * (1 - d) / d; // 0.05 means that the break will take 5% of the total value axis height

// make break expand on hover
var hoverState = axisBreak.states.create("hover");
hoverState.properties.breakSize = 1;
hoverState.properties.opacity = 0.1;
hoverState.transitionDuration = 1500;

axisBreak.defaultState.transitionDuration = 1000;
/*
// this is exactly the same, but with events
axisBreak.events.on("over", function() {
  axisBreak.animate(
    [{ property: "breakSize", to: 1 }, { property: "opacity", to: 0.1 }],
    1500,
    am4core.ease.sinOut
  );
});
axisBreak.events.on("out", function() {
  axisBreak.animate(
    [{ property: "breakSize", to: 0.005 }, { property: "opacity", to: 1 }],
    1000,
    am4core.ease.quadOut
  );
});*/

var series = chart.series.push(new am4charts.ColumnSeries());
series.dataFields.categoryX = 'siloName';
series.dataFields.valueY = 'passePct';
//series.columns.template.tooltipText = "{categoryX}: {valueY}%";
series.tooltip.label.textAlign = "middle";
series.columns.template.tooltipText = "{categoryX}\n[bold]{valueY}[/]%";
series.columns.template.alwaysShowTooltip = true;
series.tooltip.pointerOrientation = "down";
//series.tooltip.dy = 20;
series.columns.template.tooltipY = 0;
series.columns.template.strokeOpacity = 0;

// as by default columns of the same series are of the same color, we add adapter which takes colors from chart.colors color set
series.columns.template.adapter.add("fill", function(fill, target) {
	
	if (target.dataItem && (target.dataItem.valueY > 90)) {
	    return am4core.color("green");
	  }
	  else if (target.dataItem && (target.dataItem.valueY > 70)){
		  return am4core.color("yellow");
	  }else{
		  return am4core.color("red");
	  }
	
	  //return chart.colors.getIndex(target.dataItem.index);
	});
});
}); // end am4core.ready()
</script>

<!-- HTML -->
<div><h1>RTest Result of SILO vs PASSED(%)</h1></div>
<div id="chartdiv"></div>
