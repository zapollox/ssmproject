<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <form action="${ctx}/file/upload" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="file" width="120px">
        <input type="submit" value="上传">
    </form>
    <hr>
    <form action="http://localhost:8080/uploadDemo/rest/file/down" method="get">
        <input type="submit" value="下载">
    </form>
</body>
</html>
