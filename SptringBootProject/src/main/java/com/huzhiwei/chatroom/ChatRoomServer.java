package com.huzhiwei.chatroom;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Component;

/**
 * 聊天室的服务端程序
 * @author Administrator
 *
 */
//声明websocket服务端的地址
@ServerEndpoint("/chatRoomServer")
@Component
public class ChatRoomServer {
	//websocket中的sesson,和http中的sesson相似
	private Session session;
	//连接的条数
	private static final HashMap<String, Object> connectNum=new HashMap<>();
	//用户名
   private String userName;	
	//保存所有用户的信息。key是sessionId,value是用户名
   private static final HashMap<String, String> userMap=new HashMap<>();
   //第一次进来的用户
   private boolean firstFlag=true;
   //在线人数
   private static int onLineNum=0; 

	//服务端收到客户端的请求，成功后执行该方法
	@OnOpen
	public void start(Session session){
		this.session=session;
		//key表示 此次客户端的sesson,value代表此次连接的对象
		connectNum.put(session.getId(), this);
		//增加在线人数
		add();
	}
	
	//服务器发送消息
	@OnMessage
	public void chat(String clientMessage,Session session) throws IOException{	
/*System.out.println("clientMessage:"+clientMessage);
System.out.println("session:"+session);*/
		ChatRoomServer chatRoomServer=null;
		if(firstFlag){
			this.userName=clientMessage;
			//将新进来的用户保存到用户的map
			userMap.put(session.getId(), userName);
			//构造发送给客户端的信息
			//调用htmlMessage方法中的格式
			String message=htmlMessage("系统消息", userName+"进入了聊天室"+",当前人数:"+getOnlineNum()+"人");
			//将消息广播给所用的用户
			for(String connectKey:connectNum.keySet()){
				 chatRoomServer=(ChatRoomServer)connectNum.get(connectKey);
				//给对应的web发送文本消息
				chatRoomServer.session.getBasicRemote().sendText(message);	
			}
			 firstFlag=false;
		}else {
			//构造发送给客户端的信息
			//调用htmlMessage方法中的格式
			String message=htmlMessage(userMap.get(session.getId()),clientMessage);
			//将消息广播给所用的用户
			for(String connectKey:connectNum.keySet()){
				 chatRoomServer=(ChatRoomServer)connectNum.get(connectKey);
				//给对应的web发送文本消息
				chatRoomServer.session.getBasicRemote().sendText(message);
		}
		}	
	}
	
	//ws.close时间，会触发后台的oncloe方法
	@OnClose
	public void close(Session session) throws IOException{
		//减少在线人数
		reduce();
		String message=htmlMessage("系统消息", userMap.get(session.getId())+"退出聊天室"+",当前人数:"+getOnlineNum()+"人");
		userMap.remove(session.getId());
		connectNum.remove(session.getId());
		ChatRoomServer chatRoomServer=null;
	
		//将消息广播给所用的用户
		for(String connectKey:connectNum.keySet()){
			 chatRoomServer=(ChatRoomServer)connectNum.get(connectKey);
			//给对应的web发送文本消息
			chatRoomServer.session.getBasicRemote().sendText(message);
		}
	}
	
	public String htmlMessage(String userName,String message){
	       StringBuffer messageBuffer = new StringBuffer();
	       SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		      messageBuffer.append("<div class='record_item'>");
		      messageBuffer.append("<p class='record_item_time'>");
		      messageBuffer.append("<span>"+sf.format(new Date())+"</span>");
		      messageBuffer.append("</p>");
		      messageBuffer.append("<div class='record_item_txt'>");
		      messageBuffer.append("<span class='avatar'>"+userName+"</span>");
		      messageBuffer.append("<p>");
		      messageBuffer.append("<span class='txt'>"+message+"</span>");
		      messageBuffer.append("</p>");
		      messageBuffer.append("</div>");
		      messageBuffer.append("</div>");
		  return  messageBuffer.toString();
	    }
	
	//操作当前人数，使用synchronized确保线程安全
	public static synchronized void add(){
		ChatRoomServer.onLineNum++;
	}
	
	public static synchronized void reduce(){
		ChatRoomServer.onLineNum--;
	}
	//获取当前人数
	 public synchronized int getOnlineNum(){
	        return onLineNum;
	    }

}
