package com.chatapp.realtimechatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatapp.realtimechatapp.models.Message;

@RestController
public class MessageController {

    @MessageMapping("/messsage") // to send the message
    @SendTo("/topic/return-to") // to receive the message
    public Message getContent(@RequestBody Message message){

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        return message;
    }
    
}
