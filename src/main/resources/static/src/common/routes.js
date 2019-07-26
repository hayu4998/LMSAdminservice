
lmsApp.config(["$routeProvider", function($routeProvider){
	return $routeProvider.when("/",{
		redirectTo: "home"
	}).when("/home",{
		templateUrl: "home.html"
	}).when("/admin",{
		templateUrl: "admin.html"
	}).when("/borrower", {
		templateUrl: "borrower.html"
	}).when("/librarian", {
		templateUrl: "librarian.html"
	}).when("/author", {
		templateUrl: "viewauthors.html"
	})
}])