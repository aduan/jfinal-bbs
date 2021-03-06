package cn.iver.controller;

import cn.iver.model.Topic;
import cn.iver.model.User;
import com.jfinal.core.Controller;
import com.jfinal.kit.StringKit;

/**
 * Created with IntelliJ IDEA.
 * Author: iver
 * Date: 13-3-26
 */
public class IndexController extends Controller {
    public void index(){
        setAttr("topicPage", Topic.dao.getTopicPage(getParaToInt(0, 1)));
        setAttr("actionUrl", "/");
        render("/common/index.html");
    }
    public void leaveMsg(){
        render("/common/leaveMsg.html");
    }
    public void regist(){
        render("/user/regist.html");
    }
    public void toLogin(){
        render("/user/login.html");
    }
    public void test(){
        render("/common/test.html");
    }
}
