package com.google.chapter.wechat.registerform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: classprogram
 * @Description: 设置注册界面，包括用户名、邮箱以及密码等信息
 * @author: chun
 * @date: 2019/11/27 下午
 */
public class RegisterForm extends JFrame {

    private JPanel panelRegister;
    private JLabel userLAbel;
    private JTextField userText;
    private JLabel emailLabel;
    private JTextField emailText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton backButton;
    private JButton registerButton;

    public RegisterForm() {
        setTitle("Register Form");
        setSize(280,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelRegister = new JPanel();
        panelRegister.setLayout(null);

        userLAbel = new JLabel("User:");
        userLAbel.setBounds(10,20,80,25);
        panelRegister.add(userLAbel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelRegister.add(userText);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10,50,80,25);
        panelRegister.add(emailLabel);

        emailText = new JTextField(20);
        emailText.setBounds(100,50,165,25);
        panelRegister.add(emailText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,80,80,25);
        panelRegister.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,80,165,25);
        panelRegister.add(passwordText);

        backButton = new JButton("back");
        backButton.setBounds(100,110,80,25);
        panelRegister.add(backButton);

        registerButton = new JButton("register");
        registerButton.setBounds(10,110,80,25);
        panelRegister.add(registerButton);

        add(panelRegister);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    /**
     * @Description: 设置界面可见
     * @Param: [visible]
     * @return: void
     * @Author: chun
     * @Date: 2019/11/27 下午
     */
    public void setFrameRegisterVisible(Boolean visible) {
        setVisible(visible);
    }
}
