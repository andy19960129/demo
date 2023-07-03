資料庫環境(於demo/src/main/resources/application.properties)：
spring.datasource.url=jdbc:sqlserver://127.0.0.1;databaseName=Test;encrypt=false
spring.datasource.username=sa
spring.datasource.password=p@ssw0rd

安裝說明：
前端：
1.於demo-vue資料夾下打開CMD
2.輸入npm install
3.輸入npm run dev
4.進入網址：http://localhost:8800/#/login
後端：
1.打開IDE匯入Maven專案，於demo資料夾
2.運行專案(run as Spring Boot App)
資料庫：
1.於127.0.0.1建立資料庫Test
2.建立使用者sa，密碼：p@ssw0rd
3.執行位於db資料夾下的script
