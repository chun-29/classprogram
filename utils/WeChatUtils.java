package com.google.chapter.wechat.utils;

import java.io.*;

/**
 * @program: classprogram
 * @Description: Tool
 * @author: chun
 * @date: 2019/11/27 下午
 */
public class WeChatUtils {
    /* 如果用户名和密码正确返回1，用户名和密码错误返回0 */
    public int login(String name,String password) {
        int result = 0;
        /* 找到用户文件 */
        String filename = "./users/" + name + ".txt";
        File file = new File(filename);
        if(file.exists()) {
            /* 读取用户信息 */
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String username = br.readLine();
                String userpassword = br.readLine();
                br.close();
                /* 匹配用户和密码是否一致 */
                if(username.equals(name) && userpassword.equals(password)){
                    result = 1;
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
