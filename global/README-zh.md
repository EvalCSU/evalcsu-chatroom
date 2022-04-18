# EvalCSU-ChatRoom

[English](/README.md) | 简体中文

> 用JavaSocket编程开发聊天室

EvalCSU 的极客们建立了这个基本的演示，让你以更标准的方式学习和实践 JavaSocket。

我们希望你能在这个仓库的基础上把你的想法变成现实，而不是 CTRL-C/V，因为它只是一个玩具项目。

欢迎为 [EvalCSU-ChatRoom](https://github.com/EvalCSU/evalcsu-chatroom) 点亮 star，和加入我们 [EvalCSU](https://github.com/Jacob953/evalcsu) 。

## 项目功能
1. 用 Java GUI 编写聊天室服务器和客户端，支持多个客户端连接到一个服务器。每个客户端可以输入一个账号。
2. 可以实现群聊（聊天记录显示在所有客户端屏幕上）。
3. 完成每个客户端上显示的好友列表。
4. 可以实现私聊，用户可以选择某个其他用户并单独发送消息。
5. 服务器能够在群组中发送系统信息，并能迫使一些用户下线。
6. 客户端的在线和离线要求可以在其他客户端之上实时刷新。

## 项目架构
GkJAVAers 强烈建议你按以下方式建立你的框架：
```
├── chatroom.com.evalcsu.base.chatroom
│   ├── config
│   ├── constant
│   ├── controller
│   ├── dao
│   ├── exception
│   ├── fx
│   ├── model
│   │   ├── dto
│   │   ├── entity
│   │   └── vo
│   ├── service
│   ├── utils
│   └── wrapper
└── resources
    ├── static
    │   ├── css
    │   └── img
    └── template
```

## 开始

### 依赖
- Java 1.8
- JavaFX
- MySQL

### 构建
<!-- 如何构建程序 -->

### 运行
<!-- 如何运行该程序 -->

## 使用方法
<!-- 如何使用该程序 -->

## 贡献
欢迎的贡献只包括以下内容：
- 修复错误
- 纠正错别字

## 关于
你可以在 [EvalCSU-EVALUATORS.md](https://github.com/Jacob953/evalcsu/blob/main/global/EVALUATOR.md) 中找到 090207Z1(0/1) 团队的所有成员。

请与我们联系。

| 姓名            | 电子邮件                  |
|---------------|-----------------------|
| jacob953      | jacob953@csu.edu.cn   |
| typedrandomly |                       |
| Anwen-zww     |                       |
| Rick Lin      |                       |

## 许可证
此仓库遵循 [GPL-3.0许可证](LICENSE) 。
