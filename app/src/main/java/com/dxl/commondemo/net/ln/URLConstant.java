package com.dxl.commondemo.net.ln;

/**
 * @author dujiapin
 * @date 2018/3/27
 */
public class URLConstant {
    //存放全部的URL（可分为开发、测试、正式）
    // 1、测试
//    public static String HOST_URL = "http://tester3.pingnuosoft.com/";

    // 2、主干
//    public static String HOST_URL = "http://erp-tester.pingnuosoft.com/";

    //吴朋电脑
//    public static String HOST_URL = "http://192.168.0.245/";


    // 3、预发布
//    public static String HOST_URL = "http://erp-product.pingnuosoft.com/";

    // 4、正式
    public static String HOST_URL = "https://erp.pingnuosoft.com/";

    public static String BASE_URL = HOST_URL + "api/inner/";

    //     测试环境
//    public static String SECRET = "9ba3340a118eb40fc6499c7cdd95c539";
//    public static String APP_ID = "inner";

    // 正式环境
    public static String SECRET = "de1bded20bf755d10b5aba743a65e231api";
    public static String APP_ID = "erp_app";

//    public static final String SOCKET_IP = "192.168.0.66";
//    public static final int SOCKET_PORT = 8092;

    public static final String SOCKET_IP = "erp-chat.pingnuosoft.com";
    public static final int SOCKET_PORT = 8092;

    //一卡通单点登录AES加密key和iv
    public static final String ONE_CARD_AES_KEY = "970d90aff4486b8a";

    public static final String ONE_CARD_AES_IV = "191bb9ab26af7e0a";

    public static String API_LAUNCH = "app.erp.start.page";

    public static String API_GET_NOW_TIME = "app.erp.get.time";

    public static String API_MAIN = "app.erp.work.desk";

    public static String API_LOGIN = "app.erp.user.login";

    public static String API_GET_CODE = "app.erp.send.verification";

    public static String API_CHAECK_CODE = "app.erp.check.verification";

    public static String API_CHANGE_PWD = "app.erp.change.password";

    public static String API_CHANGE_DEVICE = "app.erp.change.device";

    // 考试培训

    public static String API_EXERCISE_LIST = "app.exam.get.class.list";

    public static String API_EXERCISE_START = "app.exam.class.start";

    public static String API_EXERCISE_UPLOAD = "app.exam.class.exercise";

    public static String API_GET_EXAM = "app.exam.class.practice";

    public static String API_EXERCISE_RECORD = "app.exam.class.record";

    public static String API_SIMULATE_LIST = "app.exam.practice.list";

    public static String API_SIMULATE_RANK_LIST = "app.exam.practice.ranking";

    public static String API_ONLINE_RANK_LIST = "app.exam.real.ranking";

    public static String API_SIMULATE_RANK = "app.exam.practice.ranking.info";

    public static String API_SIMULATE_SUBMIT = "app.exam.practice.submit";

    public static String API_ONLINE_RANK = "app.exam.real.ranking.info";

    public static String API_ONLINE_RECORD = "app.exam.real.history";

    public static String API_SIMULATE_RECORD = "app.exam.practice.history";

    public static String API_ONLINE_LIST = "app.exam.real.list";

    public static String API_ONLINE_CHANGE = "app.exam.real.edit";

    public static String API_ONLINE_EXAM = "app.exam.real.start";

    public static String API_SIMULATE_EXAM = "app.exam.practice.start";

    public static String API_ONLINE_SUBMIT = "app.exam.real.submit";

    public static String API_ONLINE_OPEN = "app.exam.real.onekey.start";

    public static String API_ONLINE_CLOSE = "app.exam.real.onekey.close";
    // 消息

    public static String API_MESSAGE_LIST = "app.notify.msg.list";

    public static String API_MESSAGE_READ = "app.notify.msg.read";

    // 通讯录
    public static String API_ADDRESS_LIST = "app.contact.member.list";

    public static String API_ADDRESS_ALL = "app.contacts.get.all";

    public static String API_ADDRESS_USER_LIST = "app.contacts.search.user";

    public static String API_ADDRESS_USER_INFO = "app.contacts.get.user.info";

    public static String API_ADDRESS_CONTACTS_SETTING = "app.contacts.follow.setting";

    public static String API_ADDRESS_TOP_CONTACTS = "app.contacts.my.follow";

    // 考勤

    public static String API_ATTENDANCE_LIST = "app.train.plan.list";

    public static String API_MY_ATTENDANCE_LIST = "app.train.sign.status";

    public static String API_MIDDLE_LIST = "app.train.middle.list";

    public static String API_MIDDLE_SIGNIN = "app.train.middle.sign";

    public static String API_LEAVE_SUBMIT = "app.train.vacation.invoke";

    public static String API_SIGN_OFF = "app.train.plan.sign";

    public static String API_EXCHANGE_SIGN = "app.train.scan.sign";

    public static String API_ATTENDANCE_DETAIL = "app.train.plan.detail";

    public static String API_MEETING_SUBMIT = "app.train.plan.modify";

    public static String API_MIDDLE_SUBMIT = "app.train.middle.add";

    public static String API_LEAVE_CHECKERS = "app.train.plan.checker";

    public static String API_SIGNATURE_SIGNIN = "app.train.plan.hand";

    public static String API_TRAIN_PLAN_JOIN = "app.train.plan.join";

    // 现场操作考试

    public static String API_OPERATION_LIST = "app.exam.scene.list";

    public static String API_OPERATION_HISTORY = "app.exam.scene.history";

    public static String API_OPERATION_QUERY = "app.exam.scene.team";

    public static String API_OPERATION_CHANGE = "app.exam.scene.edit";

    public static String API_OPERATION_MEMBER_LIST = "app.exam.scene.start";

    public static String API_OPERATION_SUBMIT = "app.exam.scene.submit";

    public static String API_OPERATION_DETAIL_LIST = "app.exam.scene.view.list";

    public static String API_OPERATION_USER_LIST = "app.exam.scene.user.list";


    //知识
    public static String API_MATERIAL_TREE_LIST = "app.train.material.get.class";

    public static String API_MATERIAL_LIST = "app.train.material.get.lists";

    public static String API_MATERIAL_DETAIL = "app.train.material.get.content";

    public static String API_MATERIAL_STUDY_OVER = "app.train.material.study.over";

    public static String API_MATERIAL_ADD_DOWNLOAD_NUM = "app.train.material.increment.download";

    public static String API_MATERIAL_ADD_MY_DOWN = "app.train.material.download.list";

    public static String API_MATERIAL_GET_INDEX_TYPE = "app.train.material.get.index.type";

    public static String API_MATERIAL_GET_INDEX_LIST = "app.train.material.get.index.list";

    public static String API_MATERIAL_DOWNLOAD_DELETE = "app.train.material.download.delete";


    // 我的
    public static String API_MINE_APPLY_LIST = "app.train.apply.list";

    public static String API_MINE_APPROVAL_LIST = "app.train.approval.list";

    public static String API_APPROVAL_DETAIL = "app.train.approval.detail";

    public static String API_APPROVAL_CHECK = "app.train.approval.check";

    public static String API_CHANGE_PASSWORD = "app.erp.reset.password";

    public static String API_GET_VERSION = "app.erp.check.version";

    //员工上岗
    public static String API_ONDUTY_APPLY_LIST = "app.onduty.apply.list";

    public static String API_EXT_DEPART_LIST = "app.ext.depart.reasonable";

    public static String API_ONDUTY_APPLY_DETAIL = "app.onduty.apply.detail";

    public static String API_ONDUTY_APPLY_SUBMITL = "app.onduty.apply.submit";

    public static String API_ONDUTY_SUGGEST_LIST = "app.onduty.suggest.list";

    public static String API_ONDUTY_SUGGEST_DETAIL = "app.onduty.suggest.detail";

    public static String API_ONDUTY_SUGGEST_GROUP = "app.onduty.suggest.group";

    public static String API_ONDUTY_SUGGEST_DEPART = "app.onduty.suggest.depart";

    public static String API_ONDUTY_SUGGEST_HR = "app.onduty.suggest.hr";

    public static String API_COMMENT_ITEM_LIST = "app.comment.item.list";

    public static String API_COMMENT_DETAIL = "app.train.out.comment.detail";

    public static String API_TRAIN_LIST = "app.train.out.comment.list";

    public static String API_ONDUTY_CHECK_SUBMITTED = "app.onduty.check.submitted";

    public static String API_TRAIN_OUT_COMMENT_USER = "app.train.out.comment.user";

    public static String API_TRAIN_OUT_COMMENT_DEPART = "app.train.out.comment.depart";


    /*新闻公告,主题学习*/
    public static String API_APP_AFFICHE_LIST = "app.affiche.msg.list";

    public static String API_APP_STUDY_LIST = "app.study.msg.list";

    public static String API_APP_AFFICHE_INDEX = "app.affiche.index";

    public static String API_APP_STUDY_INDEX = "app.study.index";

    public static String API_APP_AFFICHE_ADD_READ_LOG = "app.affiche.add.read.log";

    public static String API_APP_STUDY_ADD_READ_LOG = "app.study.add.read.log";

    public static String API_APP_AFFICHE_GOOD_UP = "app.affiche.good.up";

    public static String API_APP_STUDY_GOOD_UP = "app.study.good.up";

    public static String API_APP_AFFICHE_READ_RANK = "app.affiche.read.rank";

    public static String API_APP_STUDY_READ_RANK = "app.study.read.rank";

    public static String API_APP_AFFICHE_UNREAD_USERS = "app.affiche.not.read.users";

    public static String API_APP_STUDY_UNREAD_USERS = "app.study.not.read.users";

    public static String API_APP_AFFICHE_READ_LIST = "app.affiche.get.read.list";

    public static String API_APP_STUDY_READ_LIST = "app.study.get.read.list";

    public static String API_APP_AFFICHE_COMMENT_LIST = "app.affiche.get.comment";

    public static String API_APP_STUDY_COMMENT_LIST = "app.study.get.comment";

    public static String API_APP_AFFICHE_GOOD_UP_LIST = "app.affiche.good.up.list";

    public static String API_APP_STUDY_GOOD_UP_LIST = "app.study.good.up.list";

    public static String API_APP_AFFICHE_COMMENT_ZAN = "app.affiche.comment.zan";

    public static String API_APP_AFFICHE_COMMENT_CAI = "app.affiche.comment.cai";

    public static String API_APP_STUDY_COMMENT_ZAN = "app.study.comment.zan";

    public static String API_APP_STUDY_COMMENT_CAI = "app.study.comment.cai";

    public static String API_APP_AFFICHE_COMMENT_ADD = "app.affiche.comment.add";

    public static String API_APP_STUDY_COMMENT_ADD = "app.study.comment.add";

    public static String API_APP_AFFICHE_COMMENT_REPLY_LIST = "app.affiche.comment.reply.list";

    public static String API_APP_STUDY_COMMENT_REPLY_LIST = "app.study.comment.reply.list";

    public static String API_APP_AFFICHE_COMMENT_REPLY = "app.affiche.comment.reply";

    public static String API_APP_STUDY_COMMENT_REPLY = "app.study.comment.reply";

    public static String API_APP_AFFICHE_COMMENT_TALK_BACK = "app.affiche.comment.talk.back";

    public static String API_APP_STUDY_COMMENT_TALK_BACK = "app.study.comment.talk.back";

    public static String API_APP_AFFICHE_COMMENT_CHANGE_STATUS = "app.affiche.comment.change.status";

    public static String API_APP_STUDY_COMMENT_CHANGE_STATUS = "app.study.comment.change.status";
    /**
     * 运动会签到
     */
    public static String API_SPORT_SIGN = "app.ext.sport.sign";
    /**
     * 获取运动会签到时间段
     */
    public static String API_SPORT_SIGN_TIMES = "app.ext.sport.times";

    /**
     * 培训
     */
    public static String API_TRAIN_OUT_LIST = "app.train.out.list";
    /**
     * 外出培训申请提交
     */
    public static String API_TRAIN_OUT_ADD = "app.train.out.add";
    /**
     * 参训提交
     */
    public static String API_TRAIN_OUT_APPLY = "app.train.out.apply";
    /**
     * 获取我的培训列表
     */
    public static String API_TRAIN_OUT_JOIN = "app.train.out.join";

    /**
     * 更换设备申请详情
     */
    public static String API_CHANGE_DEVICE_INFO = "app.erp.change.device.info";
    /**
     * 更换设备审批
     */
    public static String API_CHANGE_DEVICE_CHECK = "app.erp.change.device.check";
    /**
     * 外出培训申请-选择参训人和参训部门
     */
    public static String API_EXT_STRUCT_LIST = "app.ext.struct.list";

    /**
     * 需求调查列表
     */
    public static String API_SURVEY_DEMAND_LIST = "app.survey.demand.list";

    public static String API_SURVEY_VOTE_DETAIL = "app.survey.vote.detail";

    public static String API_SURVEY_DEMAND_DETAIL = "app.survey.demand.detail";

    /**
     * 调查结果查看
     */
    public static String API_SURVEY_DEMAND_SUBMITTED = "app.survey.demand.submitted";
    /**
     * 投票提交
     */
    public static String API_SURVEY_VOTE_ADD = "app.survey.vote.add";
    /**
     * 需求调查提交
     */
    public static String API_SURVEY_ADD = "app.survey.result.add";

    /**
     * 投票提交结果
     */
    public static String API_SURVEY_VOTE_SUBMITTED = "app.survey.vote.submitted";

    /**
     * 发送消息
     */
    public static String API_SEND_MESSAGE = "app.message.send.advance";

    public static String API_MESSAGE_ONLINE = "app.message.online";

    /**
     * 消息已读
     */
    public static String API_MESSAGES_READ = "app.message.read";

    /**
     * 消息回执
     */
    public static String API_MESSAGES_ACK = "app.message.ack";

    /**
     * 获取用户头像
     */
    public static final String API_USER_INFO = "app.ext.user.info";

    /**
     * 自定义菜单
     */
    public static String API_DESK_MENU = "app.erp.work.desk.menu";

    /**
     * pc下线接口
     */
    public static String API_MESSAGE_OUTLINE = "app.message.outline";

    /**
     * 现场操作考试排行列表
     */
    public static String API_EXAM_SCENE_TEAM = "app.exam.scene.team";

    /**
     * 现场操作考试人员排行
     */
    public static String API_EXAM_SCENE_RANKING = "app.exam.scene.ranking";

    /**
     * 人力云单点登录
     */
    public static String REN_LI_YUN_URL = "https://hcm.lunan.com.cn/api_outer/dynamic.script.for.common.api";

    public static String REN_LI_YUN_TOKEN = "a14b49dc89c940003e443d8a25031dfda2ec93a8";


    /**
     * 日志，添加模板
     */
    public static String DAILYREPORT_TEMPLATE_ADD = "DailyReport.Template.Add";

    /**
     * 获取日志基本设置信息
     */
    public static String DAILYREPORT_SETTING_GETALLSETTINGITEM = "DailyReport.Setting.GetAllSettingItem";
    /**
     * 编辑基本设置信息
     */
    public static String DAILYREPORT_SETTING_CHANGESETTINGITEM = "DailyReport.Setting.ChangeSettingItem";
    /**
     * 未读列表首页
     */
    public static String DAILYREPORT_LISTPAGE_INDEX = "DailyReport.ListPage.Index";

    /**
     * 获取日志详情
     */
    public static String DAILYREPORT_WRITE_SHOW = "DailyReport.Write.Show";

    /**
     * 提交日志
     */
    public static String DAILYREPORT_WRITE_SUBMIT = "DailyReport.Write.Submit";

    /**
     * 日志列表详情
     */
    public static String DAILYREPORT_LISTPAGE_CONTENT = "DailyReport.ListPage.Content";

    /**
     * 日志合理化部门列表
     */
    public static String DAILYREPORT_LISTPAGE_REASONABLEDEPART = "DailyReport.ListPage.ReasonableDepart";
    /**
     * 日志点赞
     */
    public static String DAILYREPORT_OPERATE_GOODUP = "DailyReport.Operate.Goodup";

    /**
     * 日志评论
     */
    public static String DAILYREPORT_OPERATE_COMMENT = "DailyReport.Operate.Comment";

    /**
     * 日志删除
     */
    public static String DAILYREPORT_OPERATE_COMMENTDELETE = "DailyReport.Operate.CommentDelete";

    /**
     * 日志阅读
     */
    public static String DAILYREPORT_OPERATE_READ = "DailyReport.Operate.Read";

    /**
     * 我的日报列表
     */
    public static String DAILYREPORT_LIST_MYREPORT = "DailyReport.ListPage.MyReport";

    /**
     * 修改我的日报可见领导
     */
    public static String DAILYREPORT_OPERATE_ISHELPBOSSVISIBILE = "DailyReport.Operate.IsHelpBossVisible";


    /**
     * 修改我的日报是否部门领导可见
     */
    public static String DAILYREPORT_OPERATE_ISDEPARTLEADERVISIBILE = "DailyReport.Operate.IsDepartLeaderVisible";


    /**
     * 获取指定日报详情
     */
    public static String DAILYREPORT_LISTPAGE_RECORD = "DailyReport.ListPage.Record";

    /**
     * 获取我的积分列表
     */
    public static String DAILYREPORT_POINT_LOGLIST = "DailyReport.Point.LogList";

    /**
     * 是否允许创建模板
     */
    public static String DAILYREPORT_TEMPLATE_ALLOW = "DailyReport.Template.Allow";


    /**
     * 电话簿一级列表
     */
    public static String APP_TEL_DIRECTORY_GET_DIRECTORY = "app.telDirectory.get.directory";

    /**
     * 权限判断，是否展示设置按钮
     */
    public static String APP_TEL_DIRECTORY_AUTHORITY = "app.telDirectory.authority";

    /**
     * 获取设置列表
     */
    public static String APP_TEL_DIRECTORY_APPROVER_DIRECTORY = "app.telDirectory.approver.directory";

    /**
     * 删除电话簿
     */
    public static String APP_TEL_DIRECTORY_DELETE_DIRECTORY = "app.telDirectory.delete.directory";

    /**
     * 获取部门
     */
    public static String APP_TEL_DIRECTORY_GET_DEPART = "app.telDirectory.get.depart";

    /**
     * 添加电话簿
     */
    public static String APP_TEL_DIRECTORY_ADD_DIRECTORY = "app.telDirectory.add.directory";

    /**
     * 添加电话簿
     */
    public static String APP_TEL_DIRECTORY_EDIT_DIRECTORY = "app.telDirectory.edit.directory";

    /**
     * 创建群聊
     */
    public static final String APP_MESSAGE_GROUP_CREATE = "app.message.group.create";


    /**
     * 编辑群组信息
     */
    public static final String APP_MESSAGE_GROUP_EDIT = "app.message.group.edit";

    /**
     * 获取群组信息
     */
    public static final String APP_MESSAGE_GROUP_INFO = "app.message.group.info";

    /**
     * 删除群组成员
     */
    public static final String APP_MESSAGE_GROUP_MEMBER_REMOVE = "app.message.group.member.remove";

    /**
     * 解散群组
     */
    public static final String APP_MESSAGE_GROUP_REMOVE = "app.message.group.remove";

    /**
     * 添加群组成员
     */
    public static final String APP_MESSAGE_GROUP_ADD = "app.message.group.member.add";

    /**
     * 获取群组列表
     */
    public static final String APP_MESSAGE_GROUP_LIST = "app.message.group.list";

    /**
     * 提交错误日志
     */
    public static final String APP_SYSTEM_ERROR_LOG_SUBMIT = "app.system.errorLog.submit";

    /**
     * 考试交补考费
     */
    public static final String APP_EXAM_PAY_ORDER = "app.exam.pay.order";

    /**
     * 考试补考消息已读
     */
    public static final String APP_EXAM_PAY_MESSAGE_READ = "app.exam.pay.message.read";

}
