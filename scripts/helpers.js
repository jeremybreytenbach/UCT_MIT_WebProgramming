function dropdown(event) {
if (event == "mouseover")
{
    document.getElementById("dropdownContent").style.display = "block";
}
else if (event == "mouseout")
{
	document.getElementById("dropdownContent").style.display = "none";
}
}

function changeImage() {

var imageSourcePath = document.getElementById("imageElement").src;
var imageSourceName = imageSourcePath.substring(imageSourcePath.lastIndexOf("/")+1,imageSourcePath.length);
	
	if (imageSourceName == "schoolkids.jpg")
	{
		document.getElementById("imageElement").src = "images/success.jpg";
	}
	else if (imageSourceName == "success.jpg")
	{
		document.getElementById("imageElement").src = "images/poverty.jpg";
	}
	else if (imageSourceName == "poverty.jpg")
	{
		document.getElementById("imageElement").src = "images/schoolkids.jpg";
	}
}