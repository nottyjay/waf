<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>站点管理 -- D3code Web Application Firewall</title>
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
                            <h6 class="panel-title txt-dark">站点管理</h6>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="panel-wrapper collapse in">
                        <div class="panel-body">
                            <div class="pull-right"><a href="/site/add.xhtml" class="btn btn-primary">添加站点</a></div>
                            <div class="table-wrap mt-40">
                                <table class="table mb-0">
                                    <thead>
                                    <tr>
                                        <th>域名</th>
                                        <th>DNS解析状态</th>
                                        <th>协议状态</th>
                                        <th>攻击监控</th>
                                        <th>防护设置</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    [#list page.records as siteConfig]
                                    <tr>
                                        <td>${siteConfig.domain}</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td>
                                            <a href="/site/edit.xhtml?id=${siteConfig.id}">编辑</a>
                                            <a href="/site/delete.xhtml?id=${siteConfig.id}">删除</a>
                                            <a href="/site/config.xhtml">防护配置</a>
                                        </td>
                                    </tr>
                                    [/#list]
                                    </tbody>
                                </table>
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
</body>
</html>