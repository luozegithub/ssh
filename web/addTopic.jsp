<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加一个新的话题</title>
    <script src="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/jquery.min.js"></script>
    <script src="js/bootstrap-3.3.0-dist/dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="js/bootstrap-3.3.0-dist/dist/css/bootstrap.min.css">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                   Add New Topic
                </h1>
            </div>
            <div class="row clearfix">
                <div class="col-md-4 column">
                </div>
                <div class="col-md-4 column">
                    <form role="form" action="topic_addTopic.action" method="post">
                        <div class="form-group">
                            <label for="exampleInputtopic">Topic</label>
                            <input type="text" class="form-control" id="exampleInputtopic" name="topicEntity.topicTitile"/>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputdescribe">Description</label>
                            <textarea id="exampleInputdescribe" name="topicEntity.topicDescribe" cols="40" rows="6"></textarea><br/>
                        </div>

                        <button type="submit" class="btn btn-default" name="submit">Submit</button>

                    </form>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
