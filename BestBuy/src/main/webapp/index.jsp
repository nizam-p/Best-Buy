<html>
<head>
<title>Welcome</title></head>

<body>
<h2>H!! Welcome to my BestBuy REST API</h2>
<p>
Allow me to quickly introduce and walk you through my API.<br>
<br>
I have designed a REST API which scans the cart and provides  final amount of the cart
by avoiding the ambiguity of deciding whether to apply per unit price or volume price of the items scanned.
It accepts a group of characters or string like abc, abcdaba, aaaa, ccccc, abbba 
as a new path parameter to the following URL.
<p align = "center">http://localhost:8040/BestBuy/api/checkout/</p>
Suggestions: For Instance you can try something like
			<p align="center">		
			http://localhost:8040/BestBuy/api/checkout/abcd<br>http://localhost:8040/BestBuy/api/checkout/aaaaa
			</p>
NOTE : Your server's listening port may vary from the one listed above.<div></div>
Currently our grocery store is limited to four items i.e. abcd.
<br><br>

At Best Buy we do our best to make everything easy for our customers.<br>
You can begin scanning your cart by clicking scan <a href = "http://localhost:8040/BestBuy/api/checkout/">scan</a>

</body>
</html>
