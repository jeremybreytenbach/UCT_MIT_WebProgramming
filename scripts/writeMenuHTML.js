function writeMenuHTML()
{
	var htmlCode = "<div>"+
	"<table class=\"menuTable\">"+
	"  <tr><td><a href=\"home.html\">HOME</a></td>"+
	"  <td><a href=\"about.html\">ABOUT</a></td>"+
	"  <td><a href=\"casestudies.html\">CASE STUDIES</a></td>"+
	"  <td>"+
	"  <div class=\"dropdown\" onmouseover=\"dropdown('mouseover')\" onmouseout=\"dropdown('mouseout')\"><a href=\"participate.html\">PARTICIPATE</a>"+
	"	<div id=\"dropdownContent\" class=\"dropdownContent\">"+
	"	<a href=\"donate.html\">DONATE</a>"+
	"	<a href=\"volunteer.html\">VOLUNTEER</a>"+
	"	<a href=\"events.html\">EVENTS</a>"+
	"	</div>"+
	"  </div>"+
	"  </td>"+
	"  <td><a href=\"contact.html\">CONTACT</a></td></tr>"+
	"</table>"+
	"</div>";

	document.write(htmlCode);

}