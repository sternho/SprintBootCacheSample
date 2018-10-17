package com.test;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ForeignEndpointGateway {

    @Cacheable("messages")
    public Message findMessage(long id) {
    	Message msg = new Message(id, "subject", "content");
    	return msg;
    }
    
}
