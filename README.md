# EvalCSU-ChatRoom

English | [简体中文](global/README-zh.md)

> Developing Chat Rooms with JavaSocket Programming

GkJAVAers build this basic demo for you to learn and practice JavaSocket in a more standard way.

We hope you can bring your thoughts to life base on this repo rather than CTRL-C/V, since it's just a toy program.

Welcome to light up the stars for [EvalCSU-ChatRoom](https://github.com/EvalCSU/evalcsu-chatroom) and join us at [EvalCSU](https://github.com/Jacob953/evalcsu).

## Feature
1. Write the chat room server and client in Java GUI , support for multiple clients to connect to a server . Each client can enter an account number.
2. Group chat (chat logs are displayed on all client screens) can be implemente.
3. Complete the friends list displayed on each client.
4. Private chatting is possible, where users can select a certain other user and send messages individually.
5. The server is able to send system messages in a group, and can force some users to go offline.
6. The client's online and offline requirements can be refreshed in real time on top of other clients.

## Framework
GkJAVAers strongly suggest you build your frame as follow.
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

## Start

### Dependence
- Java 1.8
- JavaFX
- MySQL

### Build
<!-- How to build the program -->

### Run
<!-- How to run the program -->

## Usage
<!-- How to use the program -->

## Contribution
Welcome contributions include only the following.
- Fix bugs
- Correct typos

## About
You can find Team GkJAVA all in [EvalCSU-EVALUATORS.md](https://github.com/Jacob953/evalcsu/blob/main/global/EVALUATOR.md).

Contact us at:

| Name          | Email               |
|---------------|---------------------|
| jacob953      | jacob953@csu.edu.cn |
| typedrandomly |                     |
| Anwen-zww     |                     |
| Rick Lin      |                     |

## License
This repository follows the [GPL-3.0 License](LICENSE)
