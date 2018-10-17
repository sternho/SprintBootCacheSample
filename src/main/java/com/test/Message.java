package com.test;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = 3027815139245410697L;
	
	private long id;
    private String subject;
    private String content;
    private double randNum;

    Message(long id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        
        randNum = Math.random();
    }

	public long getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
    
    @Override
    public String toString() {
    	return "id: " + id + 
    			"; Subject:" + subject + 
    			"; Content:" + content + 
    			"; RandNum:" + randNum;
    }
    
}
