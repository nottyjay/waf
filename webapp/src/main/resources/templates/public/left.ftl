<!-- Left Sidebar Menu -->
<div class="fixed-sidebar-left">
    <ul class="nav navbar-nav side-nav nicescroll-bar">
        <li class="navigation-header">
            <span>Web Application Firewall</span>
            <i class="zmdi zmdi-more"></i>
        </li>
        <li>
            <a href="javascript:void(0)" data-toggle="collapse" data-target="#statistic"><div class="pull-left"><i class="fa fa-bar-chart-o mr-20"></i><span class="right-nav-text">监控中心</span></div><div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div><div class="clearfix"></div></a>
            <ul id="statistic" class="collapse collapse-level-2">
                <li><a href="/statistic/system.xhtml">系统监控</a></li>
                <li><a href="">API监控</a></li>
            </ul>
        </li>
        <li>
            <a href="javascript:void(0)" data-toggle="collapse" data-target="#setting"><div class="pull-left"><i class="fa fa-gears mr-20"></i><span class="right-nav-text">系统设定</span></div><div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div><div class="clearfix"></div></a>
            <ul id="setting" class="collapse collapse-level-1">
                <li><a href="">管理员</a></li>
                <li>
                    <a href="javascript:void(0)" data-toggle="collapse" data-target="#wafconfig">
                        系统配置
                        <div class="pull-right"><i class="zmdi zmdi-caret-down"></i></div><div class="clearfix"></div>
                    </a>
                    <ul id="wafconfig" class="collapse collapse-level-2">
                        <li><a href="/setting/index.xhtml">参数设置</a></li>
                        <li><a href="/setting/iptable.xhtml">访问控制</a></li>
                        <li><a href="/setting/site.xhtml">站点配置</a></li>
                        <li></li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>
<!-- /Left Sidebar Menu -->