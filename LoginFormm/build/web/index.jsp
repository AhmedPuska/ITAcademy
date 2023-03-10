<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Online Movie Store</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="wrapper">
  <div id="inner">
    <div id="header">
      <h1><img src="images/logo.gif" width="519" height="63" alt="Online Movie Store" /></h1>
      <div id="nav"> <a href="http://www.free-css.com/">HOME</a> <c:if test="${sessionScope.logged==null}"> | <a href="login.jsp">login</a> </c:if> <c:if test="${sessionScope.logged!=null}"> | <a href="logout">logout</a> </c:if> </div>
      <!-- end nav -->
      <a href="http://www.free-css.com/"><img src="images/header_1.jpg" width="744" height="145" alt="Harry Potter cd" /></a> <a href="http://www.free-css.com/"><img src="images/header_2.jpg" width="745" height="48" alt="" /></a> </div>
    <!-- end header -->
    <dl id="browse">
      <dt>Full Category Lists</dt>
      <dd class="first"><a href="http://www.free-css.com/">Action &amp; Adventure</a></dd>
      <dd><a href="http://www.free-css.com/">Anime &amp; Manga</a></dd>
      <dd><a href="http://www.free-css.com/">Art House &amp; International</a></dd>
      <dd><a href="http://www.free-css.com/">Classics</a></dd>
      <dd><a href="http://www.free-css.com/">Comedy</a></dd>
      <dd><a href="http://www.free-css.com/">Cult Movies</a></dd>
      <dd><a href="http://www.free-css.com/">Drama</a></dd>
      <dd><a href="http://www.free-css.com/">New &amp; Future Releases</a></dd>
      <dd><a href="http://www.free-css.com/">Horror</a></dd>
      <dd><a href="http://www.free-css.com/">Musicals</a></dd>
      <dd><a href="http://www.free-css.com/">Mystery &amp; Suspense</a></dd>
      <dd><a href="http://www.free-css.com/">Science Fiction &amp; Fantasy</a></dd>
      <dd class="last"><a href="http://www.free-css.com/">Westerns</a></dd>
      <dt>Search Your Favourite Movie</dt>
      <dd class="searchform">
        <form action="http://www.free-css.com/" method="get">
          <div>
            <select name="cat">
              <option value="-" selected="selected">CATEGORIES</option>
              <option value="-">------------</option>
            </select>
          </div>
          <div>
            <input name="q" type="text" value="DVD TITLE" class="text" />
          </div>
          <div class="softright">
            <input type="image" src="images/btn_search.gif" />
          </div>
        </form>
      </dd>
    </dl>
    <div id="body">
      <div class="inner">
        <div class="leftbox">
          <h3>Star Wars Trilogy (Widescreen Edition)</h3>
          <img src="images/photo_1.jpg" width="93" height="95" alt="photo 1" class="left" />
          <p><b>Price:</b> <b>$225.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$195</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        <!-- end .leftbox -->
        <div class="rightbox">
          <h3>Batman - The Animated Series </h3>
          <img src="images/photo_4.jpg" width="107" height="91" alt="photo 4" class="left" />
          <p><b>Price:</b> <b>$125</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$105</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        <!-- end .rightbox -->
        <div class="clear br"></div>
        <div class="leftbox">
          <h3>Harry Potter and the Prisoner of Azkaban </h3>
          <img src="images/photo_2.jpg" width="93" height="101" alt="photo 2" class="left" />
          <p><b>Price:</b> <b>$350</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$295</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        <!-- end .leftbox -->
        <div class="rightbox">
          <h3>Blade - Trinity (New Platinum Series)</h3>
          <img src="images/photo_5.jpg" width="90" height="103" alt="photo 5" class="left" />
          <p><b>Price:</b> <b>$115</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$95</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        <!-- end .rightbox -->
        <div class="clear br"></div>
        <c:if test="${sessionScope.logged!=null}">
        <div class="leftbox">
          <h3>Million Dollar Baby (Widescreen Edition)</h3>
          <img src="images/photo_3.jpg" width="106" height="100" alt="photo 3" class="left" />
          <p><b>Price:</b> <b>$105.97</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$99</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        <!-- end .leftbox -->
        <div class="rightbox">
          <h3>The Matrix Reloaded (Full Screen Edition)</h3>
          <img src="images/photo_6.jpg" width="91" height="99" alt="photo 6" class="left" />
          <p><b>Price:</b> <b>$75</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$55</b>.</p>
          <p><b>Availability:</b> Usually ships within 24 hours</p>
          <p class="readmore"><a href="http://www.free-css.com/">BUY <b>NOW</b></a></p>
          <div class="clear"></div>
        </div>
        </c:if>
        <!-- end .rightbox -->
        <div class="clear"></div>
      </div>
      <!-- end .inner -->
    </div>
    <!-- end body -->
    <div class="clear"></div>
    <div id="footer"> Web design by <a href="http://www.freewebsitetemplates.com">free website templates</a> &nbsp;
      <div id="footnav"> <a href="http://www.free-css.com/">Legal</a> | <a href="http://www.free-css.com/">Home</a> </div>
      <!-- end footnav -->
    </div>
    <!-- end footer -->
  </div>
  <!-- end inner -->
</div>
<!-- end wrapper -->
</body>
</html>
