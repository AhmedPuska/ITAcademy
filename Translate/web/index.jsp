<!DOCTYPE html>  
  <html>  
    <head>  
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
      <title>Translator index page</title>  
      <script type="text/javascript">  
        function go() {  
          url = 'http://localhost:8080/TranslateWS/rest/TranslatorService/' + document.getElementById("word").value;  
          window.open(url, '_blank');  
        }  
      </script>  
    </head>  
    <body>  
      <h1>Hello Translator!</h1>  
      <br/>  
      <form>  
        Your word:  
        <input type="text" name="word" id="word"/>  
      </form>  
      <button onclick="go()">Translate</button>  
    </body>  
  </html>  