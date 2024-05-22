<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletTest Contact</title>
</head>
<body>
<h1>お問い合わせフォーム</h1>
<form action="../servlet/contactServlet" method="post">
<p>名前：　<input type="text" name="name" required><p>
<p>会社：　<input type="text" name="company"></p>
<p>メールアドレス：　<input type="text" name="address" required></p>
<p>問い合わせ内容：　<textarea name="inquiry" cols="30" rows="5" required></textarea></p>
<p>メルマガ種類：　　
	<input type="checkbox" name="merumaga_type" value="総合案内">総合案内　　
	<input type="checkbox" name="merumaga_type" value="セミナー案内">セミナー案内　
	<input type="checkbox" name="merumaga_type" value="求人採用情報">求人採用情報　
</p>
<p>資料請求希望：　　
	<input type="radio" name="document_request" value="Yes">Yes　　
	<input type="radio" name="document_request" value="No">No　　
</p>
<input type="submit" value="送信">
</form>

</body>
</html>