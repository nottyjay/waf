<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>[#if siteConfig??]编辑站点[#else]新增站点[/#if] -- D3code Web Application Firewall</title>
    <meta name="description" content="Doodle is a Dashboard & Admin Site Responsive Template by hencework." />
    <meta name="keywords" content="admin, admin dashboard, admin template, cms, crm, Doodle Admin, Doodleadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application" />
    <meta name="author" content="hencework"/>
    <base href="/">

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <!-- Custom CSS -->
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<!--Preloader-->
<div class="preloader-it">
    <div class="la-anim-1"></div>
</div>
<!--/Preloader-->
<div class="wrapper theme-1-active pimary-color-red">
    [#include "public/header.ftl"]
    [#include "public/left.ftl"]

    <!-- Main Content -->
    <div class="page-wrapper">
        <!-- Row -->
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default card-view">
                    <div class="panel-heading">
                        <div class="pull-left">
                            <h6 class="panel-title txt-dark">[#if siteConfig??]编辑站点[#else]新增站点[/#if] </h6>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="panel-wrapper collapse in">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="form-wrap col-md-6 col-md-offset-3">
                                        <form action="/site/save.xhtml" method="post" class="form-horizontal">
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">*域名：</label>
                                                <div class="col-md-9">
                                                    <div class="input-group col-md-12">
                                                        <input type="text" name="domain" class="form-control" id="exampleInputuname_3" [#if siteConfig??]value="${siteConfig.domain}" [/#if]placeholder="请输入您的网站，例如:www.baidu.com">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">*协议类型</label>
                                                <div class="col-md-9">
                                                    <div class="input-group col-md-12">
                                                        <input type="checkbox" name="protocol.httpApply" value="1" id="httpApply" /> HTTP &nbsp;
                                                        <input type="checkbox" name="protocol.httpsApply" value="1" id="httpsApply" /> HTTPS
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">*服务器地址：</label>
                                                <div class="col-md-9">
                                                    <div class="input-group col-md-12">
                                                        <textarea name="host" class="col-md-12 form-control" rows="10" placeholder="请输入要保护的服务器公网IP"></textarea>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">*服务器端口：</label>
                                                <div class="col-md-9">
                                                    <div class="input-group" id="portText">
                                                        <span id="httpStatus"></span>
                                                        &nbsp;
                                                        <span id="httpsStatus"></span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group mb-0">
                                                <div class="col-md-offset-3 col-md-9">
                                                    <button type="submit" class="btn btn-info ">保存</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /Main Content -->
</div>

<!-- JavaScript -->

<!-- jQuery -->
<script src="vendors/bower_components/jquery/dist/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="vendors/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Slimscroll JavaScript -->
<script src="vendors/jquery-slimscroll.min.js"></script>
<script src="js/init.js"></script>

<script>
    $("#httpApply").click(function(){
        if($(this).is(':checked')){
            $("#httpStatus").html("HTTP: 80");
        }else{
            $("#httpStatus").html("");
        }
    });

    $("#httpsApply").click(function(){
        if($(this).is(':checked')){
            $("#httpsStatus").html("HTTPS: 443");
        }else{
            $("#httpsStatus").html("");
        }
    });
</script>
</body>
</html>