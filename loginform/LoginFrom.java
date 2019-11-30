package com.google.chapter.wechat.loginform;

import com.google.chapter.wechat.utils.WeChatUtils;
import com.google.chapter.wechat.wechatform.WeChatForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: classprogram
 * @Description: 设置登陆界面，通过判断用户名及密码正确进入聊天界面
 * @author: chun
 * @date: 2019/11/27 下午
 */
public class LoginFrom extends JFrame {

    private JPanel panelLogin;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public LoginFrom() {
        setTitle("Login Form");
        setSize(280, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panelLogin.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panelLogin.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 100, 80, 25);
        panelLogin.add(loginButton);
        loginButton.addActionListener(new LoginEventListener());

        registerButton = new JButton("register");
        registerButton.setBounds(100, 100, 80, 25);
        panelLogin.add(registerButton);

        add(panelLogin);
    }

    class LoginEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            /* 判断用户名和密码是否正确 */
            /* 如果正确 */
            /* 获取文本框信息 */
            String username = userText.getText();
            String userpassword = String.valueOf(passwordText.getPassword());
            WeChatUtils weChatUtils = new WeChatUtils();
            if(weChatUtils.login(username,userpassword) == 1) {
                WeChatForm weChatForm = new WeChatForm();
                weChatForm.setFrameWeChatVisible(true);
                dispose();
            }
        }
    }
    /**
     * @Description: 设置界面可见
     * @Param: [visible]
     * @return: void
     * @Author: chun
     * @Date: 2019/11/27 下午
     */
    public void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
    }
}
