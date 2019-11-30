package com.google.chapter.wechat.wechatform;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description: 聊天界面
 * @author: chun
 * @date: 2019/11/27 下午
 */
public class WeChatForm extends JFrame {
    private  JPanel panelMain;

    public WeChatForm() {
        setTitle("WeChat Form");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelMain = new JPanel();
        panelMain.setLayout(null);
    }

    /**
     * @Description:设置主界面可见
     * @Param: [visible]
     * @return: void
     * @Author: chun
     * @Date: 2019/11/27 下午
     */
    public void setFrameWeChatVisible(Boolean visible) {
        setVisible(visible);
    }
}
