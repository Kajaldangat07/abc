<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js">

</script>
<script type="text/javascript">

var app = angular.module('postserviceApp', []);
app.controller('postserviceCtrl',function($scope, $http) {
	alert(2);

$scope.send=function(cust_email1,cust_email2,firstName,lastName,mobile1,mobile2)
{
	alert(2);
	var data={
			'cust_email1':'sapana',
			'cust_email2':'mane',
			'firstName':'ertyk',
			'lastName':'fgh',
			'mobile1':'8765',
			'mobile2':'123',
			'area':'malad'
			
			
	};
	
	console.log(data);
	$http({
		method:'POST',
		url:'http://localhost:8080/abc/insertcustomer',
		data:data
		}).then(function(successResponse) {
		
		alert("'sajbdjabsjddjbvjsdjvbsdbv'");
		},function(errorResponse) {
			
			
		alert("Error");		
		});
}


$scope.getUser = function()
{
	alert(2);
	
// var data = {}; 
//Call the services
$http({
method:'GET',
dataType:'json',
url:'http://localhost:8080/abc/Customer'
//data:data
}).then(function(successResponse) {
alert(successResponse);
//alert(angular.toJson(successResponse.data));

if (successResponse.data)
$scope.msg = "Post Data Submitted Successfully!";
//console.log(successResponse);
alert(successResponse.data.ulist);
$scope.list=successResponse.data.ulist;
$scope.add=$scope.list.addList;
console.log($scope.list);
console.log($scope.add);
}, function(errorResponse) {
alert(errorResponse);

$scope.msg = errorResponse.message;
$scope.statusval = errorResponse.status;
/* $scope.statustext = response.statusText;
$scope.headers = response.headers(); */
});

}

/* ---------------------------------------------------- */

$scope.update = function(a)
{
	alert(2);
	
var data = {
		'fname':'zzz',
		'lname':'xxxx',
		'id':1
}; 
//Call the services
$http({
method:'POST',
url:'http://localhost:8080/abc/update',
data:data
}).then(function(successResponse) {
alert(successResponse);
//alert(angular.toJson(successResponse.data));

if (successResponse.data)
alert("YES")
}, function(errorResponse) {
alert(errorResponse);

$scope.msg = errorResponse.message;
$scope.statusval = errorResponse.status;
/* $scope.statustext = response.statusText;
$scope.headers = response.headers(); */
});

}

/*--------------------------------------------------------- */

$scope.delete1 = function()
{
	alert(1);
var data = {
		'id':1
}; 
console.log(data);
//Call the services
$http({
method:'POST',
url:'http://localhost:8080/abc/deleteCustomer',
data:data
}).then(function(successResponse) {
alert(successResponse);
//alert(angular.toJson(successResponse.data));

if (successResponse.data)
alert("YES");
alert(successResponse.data);
console.log(successResponse.data);
alert(1);
}, function(errorResponse) {
alert(errorResponse);

$scope.msg = errorResponse.message;
$scope.statusval = errorResponse.status;
/* $scope.statustext = response.statusText;
$scope.headers = response.headers(); */
});

}



});



</script>

</head>
<body>
<h2>Hello World!</h2>
<div ng-app="postserviceApp" ng-controller="postserviceCtrl">

<input type="button" ng-click="send(cust_email1,cust_email2,firstName,lastName,mobile1,mobile1)" value="insert"><br>

<input type="button" ng-click="getUser()" value="get user">
<button ng-click="delete1()">delete</button>

</div>
</body>
</html>
