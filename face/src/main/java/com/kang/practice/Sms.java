//package com.kang.practice;
//import com.alibaba.fastjson.JSONObject;
//import com.aliyun.dysmsapi20170525.models.*;
//import com.aliyun.teaopenapi.models.*;
//
//public class AddSmsTemplate {
//
//    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
//        Config config = new Config()
//                // 您的AccessKey ID
//                .setAccessKeyId(accessKeyId)
//                // 您的AccessKey Secret
//                .setAccessKeySecret(accessKeySecret);
//        // 访问的域名
//        config.endpoint = "dysmsapi.aliyuncs.com";
//        return new com.aliyun.dysmsapi20170525.Client(config);
//    }
//
//    public static void main(String[] args_) throws Exception {
//        java.util.List<String> args = java.util.Arrays.asList(args_);
//        com.aliyun.dysmsapi20170525.Client client = Sample.createClient("accessKeyId", "accessKeySecret");
//        AddSmsTemplateRequest addSmsTemplateRequest = new AddSmsTemplateRequest()
//                .setTemplateType(0)
//                .setTemplateName("content3")
//                .setTemplateContent("您正在申请手机注册，验证码为：${code}，5分钟内有效!")
//                .setRemark("用于文件下载时的验证码");
//        // 复制代码运行请自行打印API的返回值
//        client.addSmsTemplate(addSmsTemplateRequest);
//        AddSmsTemplateResponse response = client.addSmsTemplate(addSmsTemplateRequest);
//        System.out.println(JSONObject.toJSONString(response));
//    }
//}